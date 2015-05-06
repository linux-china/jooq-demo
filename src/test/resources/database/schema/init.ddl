DROP TABLE IF EXISTS language;
CREATE TABLE language (
  id          INT     NOT NULL AUTO_INCREMENT PRIMARY KEY,
  cd          CHAR(2) NOT NULL,
  description VARCHAR(50)
);

DROP TABLE IF EXISTS author;
CREATE TABLE author (
  id            INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name    VARCHAR(50),
  last_name     VARCHAR(50) NOT NULL,
  gender        VARCHAR(16),
  date_of_birth DATE,
  year_of_birth INT,
  distinguished INT
);

DROP TABLE IF EXISTS book;
CREATE TABLE book (
  id           INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  author_id    INT          NOT NULL,
  title        VARCHAR(400) NOT NULL,
  published_in INT          NOT NULL,
  language_id  INT          NOT NULL
);

DROP TABLE IF EXISTS book_store;
CREATE TABLE book_store (
  name VARCHAR(400) NOT NULL UNIQUE
);

DROP TABLE IF EXISTS book_to_book_store;
CREATE TABLE book_to_book_store (
  name    VARCHAR(400) NOT NULL,
  book_id INTEGER      NOT NULL,
  stock   INTEGER,
  PRIMARY KEY (name, book_id)
);