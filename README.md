# 🚚 Skyline Logistics

## Sistema de Gestión Logística Inteligente

Skyline Logistics es una simulación de una plataforma integral de gestión logística, operada completamente por línea de comandos (CLI). El sistema permite gestionar envíos de mercancías entre almacenes, transportistas y clientes finales, enfrentando desafíos reales como retrasos, averías y huelgas.

## 📋 Requisitos

- Java 11 o superior
- Terminal con soporte para caracteres UTF-8
- 4GB RAM mínimo para simulaciones complejas

## 🚀 Compilación y Ejecución

```bash
# Compilar el proyecto
javac -d bin src/**/*.java

# Ejecutar la aplicación
java -cp bin Main --difficulty medium
```

## 🎮 Uso de Menús

### Menú Principal
1. Iniciar simulación
2. Configurar región
3. Ver ayuda
4. Salir

### Menú de Turno
1. Crear nuevo envío
2. Decorar envío existente
3. Resolver incidente
4. Rastrear pedido
5. Generar informe
6. Finalizar turno

## 📁 Estructura del Proyecto

```
src/
├── factory/                       // Patrón Abstract Factory
│   ├── AbstractVehiculoFactory.java
│   ├── VehiculoFactory.java
│   ├── VehiculoFactoryProvider.java
│   ├── FurgonetaFactory.java
│   ├── CamionFactory.java
│   ├── BarcoFactory.java
│   └── AvionFactory.java
├── game/                         // Lógica principal del juego
│   ├── PedidoGenerator.java
│   ├── Jugador.java
│   ├── Pedido.java
│   ├── Almacen.java
│   ├── Ruta.java
│   └── Evento.java
├── model/                        // Modelos de datos
│   ├── TipoCarga.java
│   ├── Ubicacion.java
│   └── Estadisticas.java
├── template/                     // Patrón Template Method
│   ├── ProcesadorPedido.java
│   ├── ProcesadorPedidoBase.java
│   └── ProcesadorPedidoUrgente.java
├── singleton/                    // Patrón Singleton
│   ├── GestorRecursos.java
│   └── ConfiguracionGlobal.java
├── util/                         // Utilidades
│   ├── CalculadoraCostos.java
│   ├── ValidadorPedidos.java
│   └── Logger.java
├── service/                      // Servicios
│   ├── PedidoService.java
│   ├── VehiculoService.java
│   └── AlmacenService.java
├── facade/                       // Patrón Facade
│   ├── GestorLogistica.java
│   └── InterfazUsuario.java
├── strategy/                     // Patrón Strategy
│   ├── ProcesamientoPedidoStrategy.java
│   ├── PedidoFacilStrategy.java
│   └── PedidoDificilStrategy.java
├── state/                        // Patrón State
│   ├── EstadoPedido.java
│   ├── EnProceso.java
│   ├── EnTransito.java
│   ├── Retrasado.java
│   └── Entregado.java
├── decorator/                    // Patrón Decorator
│   ├── IVehiculo.java
│   ├── VehiculoDecorator.java
│   ├── VehiculoMejorado.java
│   ├── VehiculoResistente.java
│   └── VehiculoEficiente.java
├── ui/                           // Interfaz de usuario
│   ├── MenuPrincipal.java
│   ├── MenuTurno.java
│   └── VisualizadorEstadisticas.java
└── Main.java                     // Punto de entrada
```
## Gitdiagram

![diagram](https://github.com/user-attachments/assets/fa7ac91c-7803-43f5-8297-5e1eb68d5e58)


## 🔄 Flujo de Turnos

1. Al iniciar un turno, se muestra la fecha y número de turno actual
2. El usuario puede realizar múltiples acciones a través del menú
3. Al finalizar el turno, se procesan eventos aleatorios
4. Se muestra un resumen de los eventos ocurridos
5. El sistema avanza al siguiente turno

## 📊 Métricas de Rendimiento

- Margen de beneficio por envío
- Tiempo medio de entrega
- Satisfacción de clientes
- Incidencias resueltas vs. pendientes

## 🛠️ Patrones de Diseño Implementados

1. **Abstract Factory** - Creación de vehículos y almacenes
   - `VehiculoFactory` y `AbstractVehiculoFactory`
   - Fábricas concretas para cada tipo de vehículo

2. **Decorator** - Mejoras de vehículos
   - `IVehiculo` y `VehiculoDecorator`
   - Decoradores para diferentes mejoras

3. **Strategy** - Procesamiento de pedidos
   - `ProcesamientoPedidoStrategy`
   - Estrategias para diferentes niveles de dificultad

4. **State** - Estados de pedidos y vehículos

5. **Singleton** - Gestión de recursos globales

6. **Template Method** - Procesos estandarizados

7. **Facade** - Interfaz simplificada del sistema 
