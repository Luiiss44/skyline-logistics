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
## GitDiagram

flowchart TD
    %% Entry Point
    Main["Main.java"]:::ui -->|starts| UIManager

    %% UI Layer
    subgraph "UI Layer"
        direction TB
        BienvenidaUI["BienvenidaUI"]:::ui
        MenuUI["MenuUI"]:::ui
        OpcionProcessor["OpcionProcessor"]:::ui
        UIManager["UIManager"]:::ui
    end

    %% Facade & Services
    subgraph "Facade & Services"
        direction TB
        GameFacade["GameFacade"]:::facade
        GameService["GameService"]:::facade
        PlayerService["PlayerService"]:::facade
    end

    %% Core Game Engine
    subgraph "Core Game Engine"
        direction TB
        JuegoLogistica["JuegoLogistica"]:::core
        PedidoManager["PedidoManager"]:::core
        DiaManager["DiaManager"]:::core
        IncidentHandler["IncidentHandler"]:::core
        EstadisticasHandler["EstadisticasHandler"]:::core
    end

    %% Domain Model
    subgraph "Domain Model"
        direction TB
        JugadorHistorico["JugadorHistorico"]:::core
    end

    %% Pattern Modules
    subgraph "Pattern Modules"
        direction TB
        Factory["Factory Module"]:::pattern
        Decorator["Decorator Module"]:::pattern
        Strategy["Strategy Module"]:::pattern
        State["State Module"]:::pattern
        Template["Template Module"]:::pattern
        Singleton["Singleton Module"]:::pattern
    end

    %% Utilities & Config
    subgraph "Utilities & Config"
        direction TB
        Utils["Utilities"]:::util
        Config["application.properties"]:::util
    end

    %% UI to Facade
    UIManager -->|calls| GameFacade

    %% Facade to Services
    GameFacade -->|delegates| GameService
    GameFacade -->|delegates| PlayerService

    %% Services to Core & Model & Patterns & Utils
    GameService -->|runs simulation| JuegoLogistica
    PlayerService -->|manages history| JugadorHistorico
    GameService -->|uses| Factory
    GameService -->|uses| Strategy
    GameService -->|uses| Decorator
    GameService -->|uses| State
    GameService -->|uses| Template
    GameService -->|reads config| Singleton
    GameService -->|utilizes| Utils

    %% Core interactions
    JuegoLogistica -->|manages turns| DiaManager
    JuegoLogistica -->|handles orders| PedidoManager
    JuegoLogistica -->|handles incidents| IncidentHandler
    JuegoLogistica -->|gathers stats| EstadisticasHandler

    PedidoManager -->|applies strategy| Strategy
    PedidoManager -->|transitions state| State
    PedidoManager -->|creates vehicles| Factory
    PedidoManager -->|enhances vehicles| Decorator
    PedidoManager -->|processes taxes| Template

    IncidentHandler -->|logs events| Utils
    EstadisticasHandler -->|calculates metrics| Utils

    %% Return control to UI
    JuegoLogistica -->|returns summary| UIManager

    %% Click Events
    click Main "https://github.com/luiiss44/skyline-logistics/blob/main/src/Main.java"
    click BienvenidaUI "https://github.com/luiiss44/skyline-logistics/blob/main/src/ui/BienvenidaUI.java"
    click MenuUI "https://github.com/luiiss44/skyline-logistics/blob/main/src/ui/MenuUI.java"
    click OpcionProcessor "https://github.com/luiiss44/skyline-logistics/blob/main/src/ui/OpcionProcessor.java"
    click UIManager "https://github.com/luiiss44/skyline-logistics/blob/main/src/ui/UIManager.java"
    click GameFacade "https://github.com/luiiss44/skyline-logistics/blob/main/src/facade/GameFacade.java"
    click GameService "https://github.com/luiiss44/skyline-logistics/blob/main/src/service/GameService.java"
    click PlayerService "https://github.com/luiiss44/skyline-logistics/blob/main/src/service/PlayerService.java"
    click Factory "https://github.com/luiiss44/skyline-logistics/tree/main/src/factory"
    click Decorator "https://github.com/luiiss44/skyline-logistics/tree/main/src/decorator"
    click Strategy "https://github.com/luiiss44/skyline-logistics/tree/main/src/strategy"
    click State "https://github.com/luiiss44/skyline-logistics/tree/main/src/state"
    click Template "https://github.com/luiiss44/skyline-logistics/tree/main/src/template"
    click Singleton "https://github.com/luiiss44/skyline-logistics/blob/main/src/singleton/GameRulesSingleton.java"
    click Utils "https://github.com/luiiss44/skyline-logistics/tree/main/src/util"
    click Config "https://github.com/luiiss44/skyline-logistics/blob/main/config/application.properties"

    %% Styles
    classDef ui fill:#D0E6FF,stroke:#00509E,stroke-width:1px
    classDef facade fill:#DFFFD0,stroke:#4F8A10,stroke-width:1px
    classDef core fill:#FFFACD,stroke:#C19A6B,stroke-width:1px
    classDef pattern fill:#FFEBCC,stroke:#BF5800,stroke-width:1px
    classDef util fill:#E0E0E0,stroke:#666666,stroke-width:1px

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
