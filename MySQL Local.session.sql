-- USE odoo404fixers;

-- CREATE TABLE users (
--   id INT AUTO_INCREMENT PRIMARY KEY,
--   username VARCHAR(100) NOT NULL UNIQUE,
--   password VARCHAR(255) NOT NULL
-- );

-- SELECT * FROM users;

-- CREATE TABLE users (
--   id INT AUTO_INCREMENT PRIMARY KEY,
--   username VARCHAR(100) NOT NULL,
--   password VARCHAR(100) NOT NULL
-- );

-- INSERT INTO users (username, password) VALUES (?, ?)

CREATE DATABASE IF NOT EXISTS mydb;

USE mydb;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);
SELECT * FROM users;

