CREATE TABLE Book
(
    id               SERIAL PRIMARY KEY,
    title            VARCHAR(100),
    author           VARCHAR(100),
    publisher        VARCHAR(100),
    publication_year INTEGER,
    no_of_copies        INTEGER
);

CREATE TABLE Reader
(
    id           SERIAL PRIMARY KEY,
    first_name   VARCHAR(50),
    last_name    VARCHAR(50),
    address      VARCHAR(100),
    phone_number VARCHAR(20),
    email        VARCHAR(100)
);

CREATE TABLE Genre
(
    id         SERIAL PRIMARY KEY,
    genre_name VARCHAR(50)
);

CREATE TABLE Author
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name  VARCHAR(50),
    birth_year INT,
    death_year INT
);

CREATE TABLE Loan
(
    id          SERIAL PRIMARY KEY,
    book_id     INT REFERENCES Book (ID),
    reader_id   INT REFERENCES Reader (ID),
    loan_date   DATE,
    return_date DATE
);

CREATE TABLE Authorship
(
    id        SERIAL PRIMARY KEY,
    book_id   INT REFERENCES Book (ID),
    author_id INT REFERENCES Author (ID)
);

CREATE TABLE GenreAssignment
(
    id       SERIAL PRIMARY KEY,
    book_id  INT REFERENCES Book (ID),
    genre_id INT REFERENCES Genre (ID)
);

