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

/*a. Tabla PUB: NOT NULL para los campos FECHA APERTURA y HORARIO*/
ALTER TABLE pub MODIFY fecha_apertura DATE NOT NULL;
ALTER TABLE pub MODIFY horario VARCHAR(20) NOT NULL;

/* b. Tabla EMPLEADO: NOT NULL para el campo PROVINCIA */
ALTER TABLE cities MODIFY province VARCHAR (20) NOT NULL;

/* c. Tabla EXISTENCIAS: CHECK campo precio > 0 */
ALTER TABLE stocks ADD CONSTRAINT CHK_price CHECK (price > 0);

/* d. Tabla EXISTENCIAS: DEFAULT campo precio = 1*/ 
ALTER TABLE stocks ALTER price SET DEFAULT 1;

/* e. Tabla TITULAR: INDEX para los campos DNI_TITULAR y NOMBRE */ 
CREATE INDEX owners ON owners (dni_titular, nombre);

/*  f. Tabla EXISTENCIAS: DEFAULT = 1 para el campo CANTIDAD */
ALTER TABLE stocks ALTER quantity SET DEFAULT 1;

/* g. Tabla LOCALIDAD: INDEX para los campos COD_LOCALIDAD y NOMBRE. */
CREATE INDEX cities ON cities (cod_localidad, nombre_localidad);

/*6. Elimina las siguientes relaciones: */ 

/*a. Tabla TITULAR: INDEX para los campos DNI_TITULAR y NOMBRE*/
ALTER TABLE owners DROP INDEX idx_titular;

/* b. Tabla EXISTENCIAS: DEFAULT = 1 para el campo CANTIDAD*/
ALTER TABLE stocks ALTER cantidad DROP DEFAULT;

/*c. Tabla LOCALIDAD: INDEX para los campos COD_LOCALIDAD y NOMBRE*/

ALTER TABLE cities DROP INDEX idx_localidad;

/* d. Tabla EXISTENCIAS: CHECK (precio > 0)*/
ALTER TABLE stocks DROP CHECK  CHK_stocks;

/*e. Tabla EXISTENCIAS: DEFAULT = 1 para el campo PRECIO*/ 
ALTER TABLE stocks ALTER precio DROP DEFAULT;

/* 7. Crea las siguientes claves ajenas a las tablas ya existentes */ 

/*a. Tabla Titular con el campo COD_PUB a pubs */ 
ALTER TABLE owners ADD CONSTRAINT fk_cod_pub_own FOREIGN KEY (cod_pub)
REFERENCES pubs (cod_pub);

ALTER TABLE pub_employees ADD CONSTRAINT fk_cod_pub_employees FOREIGN KEY (cod_pub)
REFERENCES pubs (cod_pub);

ALTER TABLE owners ADD CONSTRAINT fk_cod_pub_own FOREIGN KEY (cod_pub)
REFERENCES pubs (cod_pub);

ALTER TABLE owners ADD CONSTRAINT fk_cod_pub_own FOREIGN KEY (cod_pub)
REFERENCES pubs (cod_pub);

ALTER TABLE owners ADD CONSTRAINT fk_cod_pub_own FOREIGN KEY (cod_pub)
REFERENCES pubs (cod_pub);
/* 8. Eliminar las claves ajenas credas en el ejercicio anterior */ 

/* 9. Elimina y crea de nuevo las tablas TITULAR, PUB Y PUB_EMPLEADO. añadiendo las claves
primarias y ajenas, en la definicion de cada una, mediante el comando CREATE TABLE */