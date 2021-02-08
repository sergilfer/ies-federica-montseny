CREATE DATABASES IF NOT EXISTS gestion_pub;

use gestion_pub;

/* 1. Crea las siguientes tablas: */ 

CREATE TABLE IF NOT EXISTS pub (
cod_pub INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(40) NOT NULL,
licencia_fiscal VARCHAR (20) NOT NULL,
domicilio VARCHAR (50) NOT NULL,
cod_localidad INT NOT NULL
);

CREATE TABLE IF NOT EXISTS titular (
dni_titular VARCHAR (9) PRIMARY KEY,
nombre VARCHAR(40) NOT NULL,
domicilio VARCHAR (50) NOT NULL,
cod_pub INT NOT NULL
);

CREATE TABLE IF NOT EXISTS empleado (
dni_empleado VARCHAR (9) PRIMARY KEY,
nombre VARCHAR(40) NOT NULL,
domicilio VARCHAR (50) NOT NULL
);

CREATE TABLE IF NOT EXISTS existencias(
cod_articulo INT NOT NULL,
nombre VARCHAR(40) NOT NULL,
cantidad INT,
cod_pub INT NOT NULL
);

CREATE TABLE IF NOT EXISTS localidad(
cod_localidad INT NOT NULL,
nombre VARCHAR(40) NOT NULL
);

CREATE TABLE IF NOT EXISTS pub_empleado(
cod_pub INT AUTO_INCREMENT NOT NULL,
dni_empleado VARCHAR (9) NOT NULL,
funcion VARCHAR(50) NOT NULL
);

/* 2. Cambia los nombres de las tablas por los siguientes */ 
/* a. pub -> pubs */
ALTER TABLE pub 
RENAME TO pubs;
/* b. empleado -> employees */
ALTER TABLE empleado 
RENAME TO employees;
/* c. existencias -> stocks */
ALTER TABLE existencias 
RENAME TO stocks;
/* d. localidad -> cities */ 
ALTER TABLE localidad 
RENAME TO cities;
/* e. titular -> owners */
ALTER TABLE titular 
RENAME TO owners;
/* f. pub_empleado -> pub_employees */
ALTER TABLE pub_empleado 
RENAME TO pub_employees;

/* 3. Añade los siguientes campos: */ 

/* a. Campos FECHA_APERTURA y HORARIO en la tabla PUB */ 
ALTER TABLE pubs ADD (
fecha_apertura DATE,
horario VARCHAR (20)
);
/* b. Camp PRECIO en la tabla EXISTENCIAS */ 
ALTER TABLE stocks ADD (
precio INT 
);
/* c. Campo Provincia en la tabla LOCALIDAD */
ALTER TABLE cities ADD (
provincia VARCHAR (30)
);
/* d. Campo EDAD en la tabla EMPLEADO */
ALTER TABLE employees ADD (
edad INT (2)
);

/* 4. Añade las claves primarias de las tablas EXISTENCIAS, LOCALIDAD Y PUB_EMPLEADO. */
/* existencias */ 
ALTER TABLE stonks
ADD CONSTRAINT PK_stocks PRIMARY KEY (cod_articulo);

/* localidad */
ALTER TABLE cities
ADD CONSTRAINT PK_cities PRIMARY KEY (cod_localidad);

/* pub_empleado */
ALTER TABLE stonks
ADD CONSTRAINT PK_pub_empleado PRIMARY KEY (cod_pub, dni_empleado, funcion);

/* 5. Añade las siguientes restricciones: */ 