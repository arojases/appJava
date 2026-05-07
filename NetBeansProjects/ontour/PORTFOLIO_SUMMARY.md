# OnTour - Sistema de administracion de usuarios

## Resumen para portafolio

OnTour es una aplicacion de escritorio desarrollada en Java Swing con NetBeans, orientada a la administracion interna de una agencia o plataforma de viajes. El sistema presenta un acceso administrativo, un panel principal con navegacion por modulos y pantallas para listar y registrar usuarios.

El proyecto esta organizado por capas: vistas Swing para la interfaz, controladores para manejar eventos, DTOs para transportar informacion de usuarios, clientes y empleados, una capa DAL para operaciones de datos y servicios de conexion hacia una base de datos Oracle.

## Funcionalidades visibles

- Pantalla de login para acceso al panel de administracion.
- Panel principal con menu de usuarios y paquetes de viajes.
- Listado de usuarios con datos como id, nombre, RUT, email, estado y opciones.
- Formulario de registro de usuarios con datos personales, credenciales y tipo de usuario.
- Estructura preparada para persistencia en Oracle mediante stored procedures.

## Tecnologias

- Java
- Java Swing
- NetBeans GUI Builder
- JDBC
- Oracle Database
- Patron por capas: DTO, DAL, controller, servicios y view

## Que demuestra el proyecto

- Construccion de interfaces de escritorio con Java Swing.
- Separacion basica de responsabilidades entre interfaz, controlador, datos y conexion.
- Modelado de entidades del dominio mediante DTOs.
- Conexion a base de datos Oracle desde Java usando JDBC.
- Implementacion de flujos administrativos comunes: login, listado y alta de usuarios.

## Nota tecnica

El proyecto original es una aplicacion de escritorio. Para mostrarlo en un portafolio web, se incluye una demo estatica navegable en `portfolio-demo/ontour/index.html`, que recrea visualmente el flujo principal sin requerir base de datos ni ejecutar la aplicacion Java.

