CREATE DATABASE usercontrol;

USE usercontrol;

CREATE TABLE users (
  id INT PRIMARY KEY,
  nombre VARCHAR(50),
  apellido VARCHAR(50),
  email VARCHAR(100),
  fechaNac DATE
);


INSERT INTO users (id, nombre, apellido, email, fechaNac)
VALUES (1, 'Cesar', 'Centurion', 'cesar@example.com', '2000-10-17');
