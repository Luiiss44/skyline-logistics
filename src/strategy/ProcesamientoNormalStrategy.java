package strategy;

import game.Pedido;
import game.Vehiculo;
import game.Jugador;
import game.JuegoLogistica;
import java.util.List;
import java.util.Calendar;

public class ProcesamientoNormalStrategy implements ProcesamientoPedidoStrategy {
    private JuegoLogistica juego;

    public ProcesamientoNormalStrategy(JuegoLogistica juego) {
        this.juego = juego;
    }

    @Override
    public void procesarPedido(Pedido pedido, List<Vehiculo> flota, Calendar fechaActual, 
                              String almacenPrincipal, Jugador jugador, int[] estadisticas) {
        if (pedido.getEstado().equals("EN_CURSO")) {
            // Obtener el vehículo asignado al pedido
            Vehiculo vehiculo = flota.stream()
                .filter(v -> v.getPedidoAsignado() != null && v.getPedidoAsignado().getId().equals(pedido.getId()))
                .findFirst()
                .orElse(null);

            if (vehiculo != null) {
                // Obtener la fecha estimada de llegada del vehículo
                Calendar fechaEstimadaLlegada = vehiculo.getFechaEstimadaLlegada();
                
                // Verificar si el vehículo ha llegado a su destino
                if (fechaEstimadaLlegada != null && !fechaActual.before(fechaEstimadaLlegada)) {
                    // Calcular retraso
                    int diasRetraso = 0;
                    if (fechaActual.after(fechaEstimadaLlegada)) {
                        diasRetraso = (int) ((fechaActual.getTimeInMillis() - fechaEstimadaLlegada.getTimeInMillis()) / (1000 * 60 * 60 * 24));
                    }

                    // Procesar pago y penalizaciones
                    int pagoBase = pedido.getPago();
                    int pagoFinal = pagoBase;

                    if (diasRetraso > 0) {
                        int penalizacion = (int) (pagoBase * (diasRetraso * 0.1)); // 10% por día de retraso
                        pagoFinal -= penalizacion;
                        System.out.println("\n⚠️ Pedido entregado con " + diasRetraso + " días de retraso");
                        System.out.println("💸 Penalización aplicada: $" + penalizacion);
                        pedido.setEstado("FALLIDO");
                        juego.incrementarEnviosFallidos();
                    } else {
                        int bonificacion = (int) (pagoBase * 0.1); // 10% de bonificación por entrega a tiempo
                        pagoFinal += bonificacion;
                        System.out.println("\n✅ Pedido entregado a tiempo");
                        System.out.println("💰 Bonificación aplicada: $" + bonificacion);
                        pedido.setEstado("ENTREGADO");
                        juego.incrementarEnviosExitosos();
                    }

                    // Aplicar el pago
                    jugador.recuperarBalance(pagoFinal);
                    System.out.println("💵 Pago recibido: $" + pagoFinal);

                    // Aplicar desgaste al vehículo
                    vehiculo.aplicarDesgaste();

                    // Calcular la fecha de disponibilidad (el mismo día de la entrega)
                    Calendar fechaDisponibilidad = (Calendar) fechaEstimadaLlegada.clone();
                    vehiculo.setFechaDisponibilidad(fechaDisponibilidad);
                    
                    // Liberar el vehículo
                    vehiculo.asignarPedido(null);
                    System.out.println("🚗 Vehículo " + vehiculo.getId() + " liberado y disponible a partir del " + 
                        JuegoLogistica.formatoFecha.format(fechaDisponibilidad.getTime()));
                }
            }
        }
    }
} 