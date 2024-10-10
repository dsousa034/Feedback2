# Feedback 2 NOVELAS
Enlace al repositorio: https://github.com/dsousa034/Feedback2.git (La carpeta pone Feedback1 ya que está hecho sobre el primer Feedback el cual se ha mejorado para que funcione correctamente)

## Descripción del Proyecto

**Feedback2** es una aplicación Android que  permite a los usuarios agregar, ver y gestionar reseñas de varias novelas. El proyecto se construye con las siguientes características clave:

- **Agregar Novelas**: Los usuarios pueden agregar nuevas novelas a la lista.
- **Ver Detalles de Novelas**: Los usuarios pueden ver información detallada sobre cada novela.
- **Agregar Reseñas**: Los usuarios pueden agregar reseñas para las novelas.
- **Marcar Favoritas**: Los usuarios pueden marcar novelas como favoritas.
- **Sincronización de Datos**: La aplicación incluye un trabajo en segundo plano para la sincronización de datos.

## Tecnologías Utilizadas

- **Lenguajes de Programación**: Kotlin, Java
- **Frameworks**: Jetpack Compose, Android Jetpack
- **Sistema de Construcción**: Gradle

## Estructura del Proyecto

### Componentes Principales

1. **AgregarResena.kt**
   - Permite a los usuarios agregar reseñas para las novelas.
   - Color de fondo: Azul clarito (`#ADD8E6`).
   - Color del botón: Verde clarito (`#90EE90`).

2. **MainScreen.kt**
   - La pantalla principal de la aplicación.
   - Color de fondo: Azul clarito (`#ADD8E6`).
   - Color del botón: Verde clarito (`#90EE90`).

3. **OtraPantalla.kt**
   - Otra pantalla en la aplicación.
   - Color de fondo: Azul clarito (`#ADD8E6`).
   - Color del botón: Verde clarito (`#90EE90`).

4. **AgregarNovela.kt**
   - Permite a los usuarios agregar nuevas novelas.
   - Color de fondo: Azul clarito (`#ADD8E6`).
   - Color del botón: Verde clarito (`#90EE90`).

5. **DetallesNovela.kt**
   - Muestra información detallada sobre una novela seleccionada.
   - Color de fondo: Azul clarito (`#ADD8E6`).

6. **PantallaResenas.kt**
   - Muestra una lista de reseñas para las novelas.
   - Color de fondo: Azul clarito (`#ADD8E6`).

7. **PantallaPrincipal.kt**
   - La pantalla principal que lista todas las novelas.
   - Color de fondo: Azul clarito (`#ADD8E6`).
   - Color del botón: Verde clarito (`#90EE90`).

### Trabajo en Segundo Plano

- **AlarmReceiver.kt**
  - Dispara la sincronización de datos usando un `JobScheduler`.
  - Intervalo de sincronización: 15 minutos.

## Mejoras Futuras

- Implementar autenticación de usuarios.
- Añadir soporte para múltiples idiomas.
- Mejorar la UI/UX con más temas y animaciones.
