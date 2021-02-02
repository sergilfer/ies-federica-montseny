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
 /*ALTER TABLE empleados 
RENAME TO employees;*/

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


