# Skyline Logistics - Memoria del Proyecto

---

## Autores
- Luis Marquina - [GitHub](https://github.com/Luiiss44/skyline-logistics)
- Manuel Martínez - [GitHub](https://github.com/ch0rtas/skyline-logistics/tree/main)
- Miguel Toran

Estudiantes de la Universidad U-Tad, Grado en Ingeniería de Software  
Asignatura: Diseño de Software

---

## Índice
1. [Introducción](#introducción)
2. [Objetivo del Juego](#objetivo-del-juego)
3. [Sistema de Envíos](#sistema-de-envíos)
4. [Modos de Juego](#modos-de-juego)
5. [Dificultades](#dificultades)
6. [Características Adicionales](#características-adicionales)
7. [Sistema de Progresión](#sistema-de-progresión)
8. [Arquitectura y Patrones de Diseño](#arquitectura-y-patrones-de-diseño)
9. [Conclusión](#conclusión)

---

## Introducción

Skyline Logistics es un juego de simulación logística que pone al jugador al frente de una empresa de transporte y distribución. El objetivo principal es gestionar eficientemente una flota de vehículos para realizar entregas y expandir el negocio, todo mientras se mantiene un balance entre la rentabilidad y la satisfacción del cliente.

El juego se desarrolla en un mundo abierto con múltiples ciudades interconectadas, cada una con sus propias características económicas, geográficas y de demanda. El jugador comenzará con una pequeña empresa local y deberá expandirse gradualmente hasta convertirse en un gigante logístico internacional.

---

## Objetivo del Juego

El jugador debe convertirse en el líder del mercado logístico, gestionando una red de distribución que conecta diferentes ciudades y puntos de entrega. Para lograrlo, deberá:
- Realizar entregas a tiempo y en perfectas condiciones
- Gestionar eficientemente los recursos económicos
- Mantener y mejorar la flota de vehículos
- Expandir el negocio a nuevas rutas y territorios
- Mantener una buena reputación con los clientes
- Adaptarse a las condiciones del mercado y la competencia
- Gestionar crisis y eventos inesperados
- Optimizar rutas y recursos para maximizar beneficios

---

## Sistema de Envíos

### Vehículos Disponibles

El juego ofrece una amplia variedad de vehículos, cada uno con características específicas:

#### Furgonetas
- Furgonetas pequeñas (hasta 1.5 toneladas)
  * Ideal para entregas urbanas
  * Bajo consumo de combustible
  * Fácil maniobrabilidad
  * Capacidad limitada
- Furgonetas medianas (hasta 3.5 toneladas)
  * Balance entre capacidad y eficiencia
  * Versatilidad en rutas urbanas e interurbanas
  * Requiere permisos específicos

#### Camiones
- Camiones rígidos (hasta 12 toneladas)
  * Versátiles para rutas medias
  * Buena capacidad de carga
  * Equilibrio entre consumo y rendimiento
- Camiones articulados (hasta 26 toneladas)
  * Alta capacidad de carga
  * Eficientes en largas distancias
  * Requieren experiencia del conductor

#### Tráileres
- Tráileres estándar
  * Máxima capacidad de carga
  * Optimizados para autopistas
  * Requieren infraestructura específica
- Tráileres especializados
  * Refrigerados para productos perecederos
  * Cisternas para líquidos
  * Portacontenedores
  * Plataformas para cargas especiales

---

### Gestión de Vehículos

#### Sistema de Desgaste
- Desgaste por kilómetro recorrido
- Desgaste por tipo de carga

---

### Restricciones y Regulaciones

#### Permisos y Licencias
- Permisos por tipo de vehículo
- Permisos por tipo de carga
- Certificaciones especiales
- Costes y renovaciones

#### Restricciones de Circulación
- Restricciones por peso
- Restricciones por dimensiones
- Rutas alternativas

#### Normativa de Carga
- Carga peligrosa
- Carga perecedera

---

## Modos de Juego

### Modo Carrera
- Progresión gradual de dificultad
- Sistema de reputación y clientes
- Desbloqueo de nuevas rutas y vehículos
- Eventos especiales
- Logros y recompensas

### Modo Libre
- Acceso a todos los vehículos
- Sin restricciones de tiempo
- Enfoque en la experimentación y optimización
- Personalización completa
- Modo sandbox
- Herramientas de prueba

### Modo Desafío
- Escenarios con condiciones específicas
- Objetivos a tiempo limitado
- Restricciones de recursos
- Desafíos diarios
- Competencias globales
- Rankings y premios

---

## Dificultades

### Fácil
- Gran balance para comenzar
- Menor número de pedidos diarios
- Progresión lenta

### Medio
- Gestión más compleja
- Restricciones realistas
- Sistema de mantenimiento
- Competencia más agresiva
- Eventos aleatorios moderados
- Economía más realista

### Dificil
- Competencia feroz
- Eventos aleatorios y crisis
- Máxima dificultad
- Economía volátil
- Eventos extremos

---

## Características Adicionales

### Sistema Económico
- Gestión de finanzas
  * Ingresos por entregas
  * Costes operativos
  * Impuestos y tasas
  * Beneficios netos
- Inversiones en infraestructura
  * Vehículos
  * Talleres
- Fluctuaciones del mercado
  * Estacionalidad
  * Crisis económicas
  * Oportunidades de mercado
  * Competencia

### Infraestructura
- Centros logísticos
  * Ubicación
  * Especialización
  * Costes
- Rutas
  * Origen-Destino
  * Eficiencia
- Gestión de almacenes
  * Organización
  * Eficiencia

---

## Sistema de Progresión

### Reputación
- Calificación por cliente
- Calificación global
- Beneficios de alta reputación

### Logros
- Logros por categoría
- Logros especiales
- Recompensas
- Desbloqueos
- Títulos y reconocimientos

---

## Arquitectura y Patrones de Diseño

### Arquitectura General

El proyecto está estructurado siguiendo una arquitectura modular y escalable, utilizando principalmente el patrón Modelo-Vista-Controlador (MVC) para separar las responsabilidades y mantener el código organizado y mantenible.

![Arquitectura General](UMLs/src.png)

#### Capas Principales
- **Capa de Presentación (Vista)**
  * Interfaz de usuario
  * Menús y HUD
  * Sistema de notificaciones
  * Visualización de datos

- **Capa de Lógica (Controlador)**
  * Gestión de la lógica de negocio
  * Control de flujo del juego
  * Manejo de eventos
  * Coordinación entre sistemas

- **Capa de Datos (Modelo)**
  * Estructuras de datos
  * Persistencia
  * Estado del juego
  * Configuraciones

---

### Patrones de Diseño Implementados

#### Patrón Template Method

El patrón Template Method se ha implementado como una solución fundamental para estandarizar procesos y comportamientos comunes en diferentes partes del juego, permitiendo la personalización de pasos específicos mientras se mantiene una estructura base consistente.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/template.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/template.png" alt="Template Method" width="600"/>
  </a>
</p>
<p align="center"><i>Diagrama UML del Patrón Template Method</i></p>

#### Patrón Strategy

El patrón Strategy se ha implementado para encapsular diferentes algoritmos y comportamientos, permitiendo que estos sean intercambiables en tiempo de ejecución. Este patrón es fundamental para manejar la variabilidad en los comportamientos del juego.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/strategy.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/strategy.png" alt="Strategy" width="600"/>
  </a>
</p>
<p align="center"><i>Diagrama UML del Patrón Strategy</i></p>

#### Patrón State

El patrón State se ha implementado para manejar los diferentes estados en los que pueden encontrarse las entidades del juego, permitiendo que su comportamiento cambie según el estado actual.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/state.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/state.png" alt="State" width="600"/>
  </a>
</p>
<p align="center"><i>Diagrama UML del Patrón State</i></p>

#### Patrón Singleton

El patrón Singleton se ha implementado para garantizar que ciertos servicios y gestores críticos del juego tengan una única instancia global, asegurando un acceso centralizado y controlado a recursos compartidos.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/singleton.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/singleton.png" alt="Singleton" width="600"/>
  </a>
</p>
<p align="center"><i>Diagrama UML del Patrón Singleton</i></p>

#### Patrón Factory

El patrón Factory se ha implementado para proporcionar una interfaz que permita crear familias de objetos relacionados sin especificar sus clases concretas.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/factory.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/factory.png" alt="Factory" width="600"/>
  </a>
</p>
<p align="center"><i>Diagrama UML del Patrón Factory</i></p>

#### Patrón Facade

El patrón Facade se ha implementado para proporcionar una interfaz simplificada a subsistemas complejos del juego, ocultando la complejidad de las interacciones entre diferentes componentes.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/facade.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/facade.png" alt="Facade" width="600"/>
  </a>
</p>
<p align="center"><i>Diagrama UML del Patrón Facade</i></p>

#### Patrón Decorator

El patrón Decorator se ha implementado para permitir la adición dinámica de comportamientos y funcionalidades a los objetos del juego sin modificar su estructura base.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/decorator.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/decorator.png" alt="Decorator" width="600"/>
  </a>
</p>
<p align="center"><i>Diagrama UML del Patrón Decorator</i></p>

---

### UML Completo del Código

A continuación se muestra el diagrama UML completo del código fuente del proyecto Skyline Logistics. Este diagrama representa la arquitectura global del sistema y la relación entre sus componentes principales.

<p align="center">
  <a href="https://github.com/ch0rtas/skyline-logistics/blob/main/UMLs/src.png">
    <img src="https://github.com/ch0rtas/skyline-logistics/raw/main/UMLs/src.png" alt="UML Completo" width="800"/>
  </a>
</p>
<p align="center"><i>Diagrama UML completo del código fuente de Skyline Logistics</i></p>

#### Descripción

Este diagrama UML muestra la estructura completa del proyecto, incluyendo todas las clases, interfaces, y las relaciones entre ellas. La arquitectura está diseñada siguiendo diversos patrones de diseño para garantizar una estructura modular, extensible y mantenible.

Entre los patrones implementados se encuentran:
- Template Method
- Strategy
- State
- Singleton
- Factory
- Facade
- Decorator

Estos patrones trabajan en conjunto para crear un sistema robusto que gestiona la logística de manera eficiente y escalable.

---

### Estructura del Código

#### Organización de Directorios
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

---

## Conclusión

En este proyecto Java hemos consolidado conocimientos avanzados en diseño de software y prácticas colaborativas que garantizan la calidad y la sostenibilidad del producto. La implementación de patrones como Singleton, Factory, Observer, Strategy y Decorator ha permitido estructurar la aplicación de forma coherente, favoreciendo la reutilización de componentes, la separación de responsabilidades y la facilidad de extensión ante nuevos requerimientos.

Paralelamente, el uso riguroso de Git y GitHub ha sido determinante para coordinar nuestro trabajo en equipo: el establecimiento de ramas temáticas, la obligatoriedad de revisiones de código mediante pull requests y la automatización de pruebas e integraciones continuas a través de GitHub Actions han elevado nuestro nivel de disciplina y eficiencia. La adopción de JUnit para pruebas unitarias y JavaDoc para la documentación ha reforzado el compromiso con la calidad y la trazabilidad de cada modificación en el repositorio.

En conclusión, este desarrollo Java no solo genera una base de código robusta y preparada para evolucionar, sino que también refuerza en cada integrante del equipo una cultura de excelencia técnica y colaboración metódica, aspectos imprescindibles para afrontar con solvencia cualquier desafío futuro.
