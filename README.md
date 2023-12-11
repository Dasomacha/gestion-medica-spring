# Gestion de Citas - Aplicación Spring Boot 🚀

La aplicación de Gestión de Citas es una aplicación desarrollada con Spring Boot para la gestión de citas médicas entre doctores y pacientes.

## Instalación

Sigue estos pasos para instalar y ejecutar la aplicación localmente:

### Requisitos Previos 📌

- Java JDK 21
- Maven
- MySQL Database

### Pasos de Instalación ⚙️

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

### Tecnologías Empleadas 💻
- Spring Boot
- Spring Data JPA
- MySQL Database
- Maven
- Lombok

## Modelo relacional

![model_spring](https://github.com/Dasomacha/imagenes/blob/main/modelo.png?raw=true)   

## Colección de Postman 🎯

Para facilitar la interacción con la API, se ha creado una colección de Postman que contiene ejemplos de solicitudes y ejemplos de respuesta. Sigue los pasos a continuación para importar la colección:

1. Copia el contenido de la colección de Postman API Citas Spring (archivo JSON).
2. Abre Postman.
3. En la interfaz de Postman, haz clic en el botón "Import" en la esquina superior izquierda.
4. Pega el contenido copiado y haz clic en "Import". 

Una vez importada, podrás ver y ejecutar las solicitudes directamente desde Postman para probar la API.

### Principales solicitudes

- Agregar paciente
![paciente](https://github.com/Dasomacha/imagenes/blob/main/spring_crearpacientes.png?raw=true)

- Agregar doctor
![doctor](https://github.com/Dasomacha/imagenes/blob/main/spring_creardoctores.png?raw=true)   

- Agregar cita
![cita](https://github.com/Dasomacha/imagenes/blob/main/spring_crearcitas.png?raw=true)

- Listar pacientes
![listapaciente](https://github.com/Dasomacha/imagenes/blob/main/spring_listarpacientes.png?raw=true)

- Listar doctores
![listadoctores](https://github.com/Dasomacha/imagenes/blob/main/spring_listardoctores.png?raw=true)

- Listar citas
![listacitas](https://github.com/Dasomacha/imagenes/blob/main/spring_listarcitas.png?raw=true)