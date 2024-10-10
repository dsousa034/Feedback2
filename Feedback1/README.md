# Feedback1
 
link al repositorio: https://github.com/siraglez/Feedback1.git

# Gestión de Biblioteca Personal de Novelas

Esta aplicación permite gestionar una biblioteca personal de novelas. Está desarrollada en Kotlin utilizando *Jetpack Compose* para la interfaz de usuario y *Android Architecture Components* como ViewModel para manejar la lógica de negocio. La aplicación permite agregar, eliminar y visualizar detalles de novelas, así como marcarlas como favoritas y agregar reseñas.

## Componentes Clave

### 1. Novela (Data Class)
`Novela` es una clase de datos que representa una novela con los siguientes atributos:

- `titulo`: El título de la novela.
- `autor`: El autor de la novela.
- `anioPublicacion`: El año de publicación.
- `sinopsis`: Una breve descripción de la novela.
- `esFavorita`: Un indicador booleano de si la novela está marcada como favorita (por defecto es `false`).
- `resenas`: Una lista mutable para almacenar reseñas de la novela.

### 2. NovelaViewModel (ViewModel)
`NovelaViewModel` gestiona la lógica de negocio de la aplicación, incluida la lista de novelas. Las funcionalidades principales incluyen:

- **Agregar novela**: Añade una nueva novela a la lista.
- **Eliminar novela**: Elimina una novela de la lista.
- **Marcar como favorita**: Alterna el estado de favorita de una novela.
- **Agregar reseña**: Permite agregar reseñas a una novela específica.

Utiliza `mutableStateListOf` para que las actualizaciones en la lista de novelas se reflejen automáticamente en la interfaz.

### 3. MainActivity (ComponentActivity)
`MainActivity` es la actividad principal que configura la interfaz de usuario usando `setContent` para mostrar el componente raíz `NovelaApp`. Es el punto de entrada de la aplicación.

### 4. NovelaApp (Composable)
`NovelaApp` organiza la interfaz principal de la aplicación utilizando un `Scaffold` para estructurar la barra superior y el contenido. También emplea `NavHost` para gestionar la navegación entre las diferentes pantallas de la aplicación.

### 5. NavigationHost (Composable)
El `NavigationHost` define la navegación entre diferentes pantallas dentro de la aplicación. Las rutas principales son:

- **Pantalla Principal**: Muestra la lista de novelas.
- **Agregar Novela**: Pantalla para agregar una nueva novela.
- **Detalles de Novela**: Muestra los detalles de una novela seleccionada.
- **Pantalla de Reseñas**: Permite ver y agregar reseñas a una novela.

### 6. PantallaPrincipal (Composable)
`PantallaPrincipal` presenta una lista de novelas usando un `LazyColumn`. Incluye las siguientes funcionalidades:

- **Agregar novela**: Botón flotante para navegar a la pantalla de agregar novelas.
- **Ver detalles**: Al hacer clic en una novela, se navega a la pantalla de detalles.
- **Eliminar novela**: Botón para eliminar una novela de la lista.

### 7. DetallesNovela (Composable)
Muestra los detalles de una novela seleccionada. Incluye:

- **Información de la novela**: Título, autor, año de publicación y sinopsis.
- **Marcar como favorita**: Botón para alternar si la novela está marcada como favorita.
- **Volver a la pantalla principal**: Botón para regresar a la lista de novelas.

### 8. PantallaResenas (Composable)
Muestra una lista de novelas para que el usuario pueda seleccionar una y ver o agregar reseñas. Utiliza un `LazyColumn` para mostrar las novelas disponibles.

### 9. AgregarNovela y AgregarResena (Composables)
Estas pantallas proporcionan formularios para que el usuario agregue nuevas novelas y reseñas. Utilizan `TextField` para la entrada de texto y un botón para confirmar la acción.

- **Agregar Novela**: Permite ingresar el título, autor, año de publicación y sinopsis de una nueva novela.
- **Agregar Reseña**: Permite ingresar una reseña para una novela existente.


