CREATE DATABASE IF NOT EXISTS game_management;

USE game_management;

/* ejercicio 1 */ 

/*creacion de tablas con pk y fk */ 

CREATE TABLE IF NOT EXISTS game (
id INT AUTO_INCREMENT PRIMARY KEY,
game_name VARCHAR(20) NOT NULL,
CONSTRAINT fk_gamegnre FOREIGN KEY (genre)
REFERENCES genre(genre_game)
);

CREATE TABLE IF NOT EXISTS genre (
id INT AUTO_INCREMENT PRIMARY KEY,
genre_game VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS publisher (
id INT AUTO_INCREMENT PRIMARY KEY,
publisher_name VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS game_publisher(
id INT AUTO_INCREMENT PRIMARY KEY,
CONSTRAINT fk_game_publisher_gameid FOREIGN KEY (game)
REFERENCES game(id),
CONSTRAINT fk_game_publisher_publid FOREIGN KEY (publisher)
REFERENCES publisher(id)
);

CREATE TABLE IF NOT EXISTS plataform (
id INT AUTO_INCREMENT PRIMARY KEY,
plataform_name VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS game_plataform(
id INT AUTO_INCREMENT PRIMARY KEY,
release_year INT NOT NULL,
CONSTRAINT fk_ga_pla_gapublid FOREIGN KEY (game_publisher)
REFERENCES game_publisher(id),
CONSTRAINT fk_ga_pla_plat FOREIGN KEY (plataform)
REFERENCES plataform(id)
);

