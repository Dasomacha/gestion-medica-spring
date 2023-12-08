# Gestion de Citas - Aplicación Spring Boot

La aplicación de Gestión de Citas es una aplicación desarrollada con Spring Boot para la gestión de citas médicas entre doctores y pacientes.

## Instalación

Sigue estos pasos para instalar y ejecutar la aplicación localmente:

### Requisitos Previos

- Java JDK 21
- Maven
- MySQL Database

### Pasos de Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/Dasomacha/gestion-medica-spring.git

2. Configurar la Base de Datos:

- Asegúrate de tener MySQL instalado y configurado.
- Crea una base de datos llamada gestion_citas.
- Actualiza las configuraciones de la base de datos en src/main/resources/application.properties con tu usuario y contraseña de MySQL.

3. Ejecuta la clase principal.
    ```bash
    ApiCitasApplication.java

**La aplicación estará disponible en http://localhost:8081**

### Tecnologías Empleadas
- Spring Boot
- Spring Data JPA
- MySQL Database
- Maven
- Lombok