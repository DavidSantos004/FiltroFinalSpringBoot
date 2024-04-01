#Filtro Final SpringBoot

# Bota de primavera "Filtro Final"

Esta es una aplicación Java/Maven/Spring Boot (versión 1.5.6) de muestra que se puede utilizar como iniciador para crear un microservicio completo con verificación de estado integrada, métricas y mucho más. Espero que te ayude.

## Como correr

Esta aplicación está empaquetada como una guerra que tiene Tomcat 8 integrado. No es necesaria la instalación de Tomcat o JBoss. Lo ejecutas usando el comando ```java -jar```.

* Clonar este repositorio
* Asegúrate de estar usando JDK 1.8 y Maven 3.x
* Puedes construir el proyecto y ejecutar las pruebas ejecutando ```mvn clean package```
* Una vez creado correctamente, puede ejecutar el servicio mediante uno de estos dos métodos:
```
         java -jar -Dspring.profiles.active=objetivo de prueba/spring-boot-rest-example-0.5.0.war
o
         mvn spring-boot: ejecutar -Drun.arguments="spring.profiles.active=prueba"
```
* Verifique el archivo stdout o boot_example.log para asegurarse de que no se generen excepciones

Una vez que se ejecute la aplicación, deberías ver algo como esto.

```
2017-08-29 17:31:23.091 INFORMACIÓN 19387 --- [principal] s.b.c.e.t.TomcatEmbeddedServletContainer: Tomcat se inició en los puertos: 8080 (http)
2017-08-29 17:31:23.097 INFO 19387 --- [principal] com.khoubyari.example.Application: aplicación iniciada en 22.285 segundos (JVM ejecutándose durante 23.032)
```

## Acerca del servicio

El servicio es simplemente un simple servicio REST de reseñas audiovisuales. Utiliza una base de datos en memoria (H2) para almacenar los datos. También puedes hacerlo con una base de datos relacional como PostgreSQL. Si las propiedades de conexión de su base de datos funcionan, puede llamar a algunos puntos finales REST definidos en ```com.khoubyari.example.api.rest.hotelController``` en el **puerto 8080**. (vea abajo)

Más interesante aún, puede comenzar a llamar a algunos de los puntos finales operativos (consulte la lista completa a continuación) como ```/metrics``` y ```/health``` (estos están disponibles en el **puerto 8091**)

Puede utilizar este servicio de muestra para comprender las convenciones y configuraciones que le permiten crear un servicio RESTful respaldado por base de datos. Una vez que comprenda y se sienta cómodo con la aplicación de muestra, podrá agregar sus propios servicios siguiendo los mismos patrones que el servicio de muestra.
 
Esto es lo que demuestra esta pequeña aplicación:

* Integración total con el último Framework **Spring**: inversión de control, inyección de dependencia, etc.
* Empaquetado como una única guerra con contenedor integrado (tomcat 8): no es necesario instalar un contenedor por separado en el host, simplemente ejecútelo usando el comando ``java -jar``
* Demuestra cómo configurar puntos finales de verificación de estado, métricas, información, entorno, etc. automáticamente en un puerto configurado. Inyecte su propia información de salud/métricas con unas pocas líneas de código.
* Escribir un servicio RESTful mediante anotación: admite solicitudes/respuestas tanto XML como JSON; simplemente use el encabezado ``Aceptar`` deseado en su solicitud
* Mapeo de excepciones de las excepciones de la aplicación a la respuesta HTTP correcta con detalles de la excepción en el cuerpo
* *Spring Data* Integración con JPA/Hibernate con solo unas pocas líneas de configuración y anotaciones familiares.
* Funcionalidad CRUD automática contra la fuente de datos usando el patrón Spring *Repository*
* Demuestra el marco de prueba MockMVC con bibliotecas asociadas
* Todas las API están "autodocumentadas" por Swagger2 mediante anotaciones

Aquí hay algunos puntos finales a los que puede llamar:

### Obtenga información sobre el estado del sistema, configuraciones, etc.

```
en construcción
```

### Crear un recurso de hotel

```
en construcción :()
```

### Recuperar una lista paginada de hoteles

```
en construcción :()

```

### Actualizar un recurso de hotel

```
en construcción :()

```
### Para ver los documentos de la API de Swagger 2

Ejecute el servidor y busque localhost:8090/swagger-ui.html

# Acerca de la bota de primavera

Spring Boot es un marco de arranque de aplicaciones "obstinado" que facilita la creación de nuevos servicios RESTful (entre otros tipos de aplicaciones). Proporciona muchas de las funciones habituales de Spring que se pueden configurar fácilmente, normalmente sin ningún XML. Además de una fácil configuración de Spring Controllers, Spring Data, etc. Spring Boot viene con el módulo Actuator que le brinda a la aplicación los siguientes puntos finales útiles para monitorear y operar el servicio:

**/metrics** Muestra información de "métricas" para la aplicación actual.

**/health** Muestra información de estado de la aplicación.

**/info** Muestra información arbitraria de la aplicación.

**/configprops** Muestra una lista recopilada de todas las @ConfigurationProperties.

**/mappings** Muestra una lista recopilada de todas las rutas de @RequestMapping.

**/beans** Muestra una lista completa de todos los Spring Beans en su aplicación.

**/env** Expone propiedades del ConfigurableEnvironment de Spring.

**/trace** Muestra información de seguimiento (de forma predeterminada, las últimas solicitudes HTTP).

### Para ver su base de datos en memoria H2

El perfil de 'prueba' se ejecuta en la base de datos en memoria H2. Para ver y consultar la base de datos, puede navegar a http://localhost:8090/h2-console. El nombre de usuario predeterminado es 'sa' con una contraseña en blanco. Asegúrese de desactivar esto en sus perfiles de producción. Para obtener más información, consulte https://goo.gl/U8m62X

# Ejecutando el proyecto
Este proyecto utiliza una base de datos en memoria para que no sea necesario instalar una base de datos para ejecutarlo. Sin embargo, convertirlo para que se ejecute con otra base de datos relacional como PostgreSQL es muy fácil. Dado que el proyecto utiliza Spring Data y el patrón Repository, es incluso bastante fácil respaldar el mismo servicio con MongoDB.

Esto es lo que haría para respaldar los servicios con Posgres, por ejemplo:

### En pom.xml agregue:

```
         <dependencia>
             <grupoId>posgrest</grupoId>
             <artifactId>conector-posgrest-java</artifactId>
         </dependencia>
```

### Agregue esto al final de application.yml:

```
---
primavera:
   perfiles: posgrest

   fuente de datos:
     driverClassName: com.posgrest.jdbc.Driver
     URL: jdbc:posgrest://<tu_host_o_ip_posgrest>/bootexample
     nombre de usuario: <tu_nombre_de_usuario_posgrest>
     contraseña: <tu_contraseña_posgrest>

   jpa:
     hibernar:
       dialecto: org.hibernate.dialect.POSGRETInnoDBDialect
       ddl-auto: actualizar # todo: en entornos que no son de desarrollo, comenta esto:


Servicio de hotel:
   nombre: 'perfil de prueba:'
```

# Adjuntar a la aplicación de forma remota desde su IDE

Ejecute el servicio con estas opciones de línea de comando:

```
mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
o
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Dspring.profiles.active=test -Ddebug -jar target/spring-boot-rest-example-0.5.0.war
```
y luego podrás conectarte a él de forma remota usando tu IDE. Por ejemplo, desde IntelliJ Tienes que agregar una configuración de depuración remota: Editar configuración -> Remota.

# Historia de las estrellas

[![Gráfico de historia de estrellas](https://api.star-history.com/svg?repos=khoubyari/spring-boot-rest-example&type=Date)](https://star-history.com/#khoubyari /ejemplo-descanso-arranque-primavera&fecha)

# Preguntas y comentarios: khoubyari@gmail.com