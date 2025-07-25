# Proyecto Literatura - AluraLatam

![A7RMJPD2BSTN53P36LXGYSO77E](https://github.com/user-attachments/assets/841eed92-5f5e-4596-a0d5-d567a594164b)

<img width="1855" height="803" alt="Captura de pantalla 2025-07-25 161458" src="https://github.com/user-attachments/assets/0c54aa70-9810-4b84-a576-2c10f8bb0f57" />

Bienvenido al proyecto literAlura, una aplicación Java basada en Spring Boot que te permite gestionar libros y autores de manera eficiente.

## Descripción del Proyecto 

El proyecto literAlura está diseñado para ayudar a los amantes de la literatura a buscar, registrar y listar libros y autores correspondientes. También ofrece funcionalidades avanzadas como listar autores vivos en un determinado año y listar libros por idioma.

### Características del Programa

1. **Obtención de Datos**: El programa toma libros de la API [GutenDex](https://gutendex.com/).
2. **Conversión a Objetos Java**: Los datos obtenidos de la API se convierten en objetos Java implementando el package config mediante una interfaz y clases.
3. **Procesamiento**: Los datos se procesan para asegurarse de que los libros y autores no se dupliquen en la base de datos.
4. **Almacenamiento**: Los libros y autores procesados se guardan en una base de datos relacionales, en este caso PostgreSQL y puede ser compatible con MySQL, SQL Server, etc.

### Desafío de Alura

Este proyecto es una solución al desafío del challenge de Alura, donde se nos retó a crear una aplicación para gestionar una base de datos de libros y autores utilizando tecnologías modernas con diferentes funcionalidades.

## Funcionalidades 

1. **Agregar Libro por Nombre**: Agrega un libro específico por su nombre.
2. **Libros buscados**: Muestra todos los libros registrados en la base de datos.
3. **Buscar libro por Nombre**: Realiza la búsqueda de un libro por su nombre correspondiente.
4. **Buscar todos los Autores de libros buscados**: Filtra todos los autores sobre los libros que están registrados.
5. **Buscar Autores por año**: Filtra autores por una fecha, el cuál es validada por su fecha de nacimiento y fallecimiento.
6. **Buscar Libros por Idioma**: Filtrar libros por su idioma.
7. **Top 10 Libros más Descargadas**: Filtrar el top 10 de los libros más descargados.
8. **Buscar Autor por Nombre**: Filtrar un autor por su nombre.

0. **Salir**: Finaliza la ejecución del programa.

## Tecnologías Utilizadas 🛠️

- **Java 21**
- **Spring Boot 3.4.8**
- **Spring Data JPA**
- **PostgreSQL**
- **Gestor de dependencias: Maven**

## Instalación y Ejecución 🚀

Sigue estos pasos para configurar y ejecutar el proyecto en tu máquina local.

### Prerrequisitos

- Java 17 o superior
- Una base de datos SQL (PostgreSQL, MySQL, SQL Server, etc.)

### Clonar el Repositorio
```
git clone (Coloca la url del repositorio)
```

### Dependencias
Asegúrate de agregar las dependencias necesarias en tu archivo `pom.xml` para la base de datos que deseas usar.

### Configurar tu base de datos en el archivo application.properties
```
spring.datasource.url=jdbc:postgresql://localhost:xxxx/nombre_de_tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

### Ejecuta LiteraturaApplication en tu IDE
Al ejecutar la aplicación, se mostrará un menú en la consola con las siguientes opciones:
```
|---------------------------------------------------|
|------    BIENVENIDO A LIBRERIA DE RAFAEL    ------|
|---------------------------------------------------|

1 - Agregar Libro por Nombre
2 - Libros buscados
3 - Buscar libro por Nombre
4 - Buscar todos los Autores de libros buscados
5 - Buscar Autores por año
6 - Buscar Libros por Idioma
7 - Top 10 Libros mas Descargados
8 - Buscar Autor por Nombre

0 - Salir
```
Selecciona la opción deseada ingresando el número correspondiente y sigue las instrucciones en pantalla.

Hecho por Rafael
