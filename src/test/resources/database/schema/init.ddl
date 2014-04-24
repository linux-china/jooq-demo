-- CREATE DATABASE IF NOT  EXISTS jooq_dev CHARACTER SET utf8 COLLATE utf8_general_ci;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id         INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nick       VARCHAR(32),
  passwd     VARCHAR(64),
  email      VARCHAR(64),
  status     INT,
  created_at DATETIME
);

DROP TABLE IF EXISTS books;
CREATE TABLE books (
  id         INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  isbn       VARCHAR(32),
  name       VARCHAR(256),
  author     VARCHAR(16),
  page_count INT,
  price      DOUBLE,
  status     INT,
  created_at DATETIME
);

DROP TABLE IF EXISTS user_readings;
CREATE TABLE user_readings (
  id         INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id    INT,
  book_id    INT,
  status     INT,
  created_at DATETIME,
  updated_at DATETIME
);

