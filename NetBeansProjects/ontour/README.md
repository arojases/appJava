# OnTour

OnTour es una aplicacion de escritorio desarrollada en Java Swing para la administracion interna de usuarios de una agencia o plataforma de viajes.

El proyecto fue construido con NetBeans y organiza su codigo en capas para separar interfaz, controladores, transferencia de datos, acceso a datos y servicios de conexion.

## Funcionalidades

- Login de acceso al panel de administracion.
- Ventana principal con menu de modulos.
- Modulo de usuarios con listado de registros.
- Formulario para registrar nuevos usuarios.
- Modelos DTO para usuarios, clientes y empleados.
- Capa DAL preparada para insertar usuarios en base de datos.
- Conexion a Oracle Database mediante JDBC.

## Tecnologias utilizadas

- Java
- Java Swing
- NetBeans GUI Builder
- JDBC
- Oracle Database
- Apache Ant

## Estructura del proyecto

```text
src/
  ConexionJB/      Conexion JDBC hacia Oracle
  controller/      Controladores de eventos
  dal/             Acceso a datos
  dto/             Objetos de transferencia de datos
  images/          Logos e iconos de la interfaz
  resources/       Utilidades para cambio de paneles
  servicios/       Servicio de apertura y cierre de conexion
  view/            Vistas Swing del sistema
```

## Pantallas principales

- `main.java`: pantalla de login.
- `view/home.java`: panel principal de administracion.
- `view/UsuarioListado.java`: listado de usuarios.
- `view/UsuarioNuevo.java`: formulario de registro de usuarios.

## Ejecucion local

1. Abrir el proyecto `NetBeansProjects/ontour` en NetBeans.
2. Verificar que el JDK este configurado.
3. Configurar el driver JDBC de Oracle si se desea probar la conexion real.
4. Ejecutar la clase principal `main.java`.

Credenciales demo visibles en el codigo:

```text
Usuario: luis
Clave: 123
```

## Base de datos

La capa de acceso a datos usa JDBC y esta preparada para ejecutar el procedimiento almacenado:

```sql
ontour.sp_InsertaUsuario
```

La conexion se encuentra centralizada en:

```text
src/ConexionJB/Conexion.java
src/servicios/ConexionServ.java
```

## Demo para portafolio

Como este proyecto original es una aplicacion de escritorio, se agrego una demo web estatica para mostrar el flujo principal en un portafolio:

```text
../../portfolio-demo/ontour/index.html
```

La demo recrea visualmente el panel administrativo, listado de usuarios, formulario de registro y modulo de paquetes de viaje sin requerir base de datos ni ejecutar Java.

## Estado del proyecto

Proyecto academico/prototipo funcional con interfaz Swing y estructura preparada para integracion con Oracle. Algunas operaciones de persistencia estan modeladas o parcialmente implementadas, por lo que la demo web se incluye como apoyo visual para presentacion en portafolio.

