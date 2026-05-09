CREATE DATABASE bibliotecaweb;

USE bibliotecaweb;

CREATE TABLE libro(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    autor VARCHAR(100)
);

CREATE TABLE categoria(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);