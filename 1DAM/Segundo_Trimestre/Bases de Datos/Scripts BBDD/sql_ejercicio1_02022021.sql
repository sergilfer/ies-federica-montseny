CREATE DATABASE if not exists gestionanimales;

USE gestionanimales;

SHOW DATABASES;

/* Creacion de la tabla mascotas */
CREATE TABLE IF NOT EXISTS pets (
name VARCHAR(20), 
owner VARCHAR(20),
species VARCHAR(20),
sex CHAR(1),
birth DATE,
death DATE
);

DESCRIBE pets;

/* Creacion de la tabla empleados */

CREATE TABLE IF NOT EXISTS  empleados (
id INT,
nombre VARCHAR(30),
edad INT
);

SHOW TABLES;

DESCRIBE empleados;

/* DROP TABLE empleados sirve para eliminar */

/* cambia el nombre de la tabla */
 ALTER TABLE empleados 
RENAME TO employees;

/* CUIDADO: borra los datos de la tabla, por eso esta comentado */
/* TRUNCATE TABLE employees; */ 

/* sirve para modificar la tabla, en este caso añadir una nueva columna */
ALTER TABLE employees ADD (
oficina INT 
);

DESCRIBE employees;

ALTER TABLE employees ADD (
jefe VARCHAR(20),
departamento BIT 
);

DESCRIBE employees;

/* en este caso modificamos la tabla, pero para eliminar una columna */
 ALTER TABLE employees DROP jefe; 

ALTER TABLE employees ADD (
boss VARCHAR(2)
);

/* en este caso modificamos una columna que ya esta en la tabla anteriormente */
ALTER TABLE employees MODIFY boss VARCHAR(20);

DROP TABLE tasks; 

CREATE TABLE tasks (
id INT NOT NULL,
title VARCHAR(255) NOT NULL,
start_date DATE UNIQUE,
end_date DATE,
UNIQUE (end_date, title),
price INT CHECK (price > 0)
);

/* price INT CHECK (price > 0) es igual a poner 
CONSTRAINT tasks_price_chk CHECK (price > 0) */

/* con el de abajo seleccionas tu el nombre que tiene la restriccion, en la primera te lo
elige automaticamente SQL el nombre */

/* DDL de una tabla */
SHOW CREATE TABLE employees;

/* listado de tablas */
SHOW TABLES;

/* para añadir un unique a algo que no lo tenia previamente */
ALTER TABLE tasks
ADD CONSTRAINT tas_tit_uk
UNIQUE (title);

/* eliminamos la tabla para crearla de nuevo con un id */ 
DROP TABLE IF EXISTS employees;

show indexes from employees;

show create table employees;

/* creamos un tabla nueva con indice INDEX */
CREATE TABLE IF NOT EXISTS employees (
id INT,
name_employee VARCHAR(30),
age INT,
INDEX(id)
);

/* para eliminar un indice */
DROP INDEX id ON employees;

/* para crear un indice si la tabla ya esta creada */
CREATE INDEX IDX_id ON employees (id);



