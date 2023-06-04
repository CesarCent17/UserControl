# USER CONTROL
Este proyecto es una demo de una API web de control de usuarios, desarrollada utilizando Java, Spring Boot y Maven 🚀 .

## Descripción
El objetivo de este proyecto es proporcionar una funcionalidad básica de CRUD (Crear, Leer, Actualizar, Eliminar) para la gestión de usuarios. Actualmente, el proyecto está en desarrollo y solo se han incorporado la capa del controlador y los modelos. Las demás capas, como la capa de servicio y la capa de persistencia, aún no han sido implementadas.

## Tecnologías utilizadas
El proyecto se ha desarrollado utilizando las siguientes tecnologías:

- Java 20
- Spring Boot 3.1.0.
- Maven 3.9.2

## Instalación
Clona el repositorio en tu máquina local.

Asegúrate de tener instalado el JDK 20 de Java y Maven en tu sistema.

Abre una terminal y navega hasta el directorio raíz del proyecto.

Ejecuta el siguiente comando para compilar el proyecto y descargar las dependencias:

`mvn clean install`

Una vez finalizada la compilación, ejecuta el siguiente comando para iniciar la aplicación:

`mvn spring-boot:run`

La aplicación estará disponible en http://localhost:8080. Puedes acceder a la API utilizando herramientas como Postman o cualquier navegador web.


## Uso
La API proporciona los siguientes endpoints para la gestión de usuarios:

------------

`GET /user`

`GET /user/{id}`

`POST /user`

`PUT /user/{id}`

`DELETE /user/{id}`

------------


Puedes enviar solicitudes HTTP a estos endpoints para interactuar con la API y realizar operaciones de CRUD.