CREATE TABLE Sales
(
    ID       SERIAL PRIMARY KEY,
    Product  VARCHAR(50),
    Quantity INTEGER,
    Price    DECIMAL
);

INSERT INTO Sales (Product, Quantity, Price)
VALUES ('T-shirt', 10, 19.99),
       ('Notebook', 5, 9.99),
       ('Book', 8, 24.99),
       ('Vinyl', 3, 14.99);

SELECT Product, SUM(Quantity) AS total_quantity, AVG(Price) AS average_price
FROM Sales
GROUP BY Product;

CREATE TABLE Expenses
(
    ID       SERIAL PRIMARY KEY,
    Category VARCHAR(50),
    Amount   DECIMAL
);

INSERT INTO Expenses (Category, Amount)
VALUES ('Food', 50.25),
       ('Transportation', 25.50),
       ('Rent', 1000.00),
       ('Utilities', 150.75),
       ('Entertainment', 75.80);

SELECT Category, SUM(Amount) AS total_amount, AVG(Amount) AS average_amount
FROM Expenses
GROUP BY Category;


CREATE TABLE Products
(
    ID    SERIAL PRIMARY KEY,
    Name  VARCHAR(50),
    Price DECIMAL
);

INSERT INTO Products (Name, Price)
VALUES ('Product A', 9.99),
       ('Product B', 14.99),
       ('Product C', 19.99),
       ('Product D', 12.99),
       ('Product E', 7.99);

SELECT *
FROM Products
WHERE Price = (SELECT MAX(Price) FROM Products);

SELECT *
FROM Products
WHERE Price = (SELECT MIN(Price) FROM Products);

SELECT *
FROM Products
WHERE Price IN (SELECT MIN(Price) FROM Products UNION SELECT MAX(Price) FROM Products);


CREATE TABLE Students
(
    ID       SERIAL PRIMARY KEY,
    Name     VARCHAR(50),
    AvgGrade DECIMAL
);

INSERT INTO Students (Name, AvgGrade)
VALUES ('John Doe', 80.11),
       ('Jane Smith', 95.78),
       ('Michael Johnson', 66.34),
       ('Emily Brown', 87.94);

CREATE TABLE Grades
(
    StudentID  SERIAL PRIMARY KEY,
    Grade      DECIMAL,
    student_id int REFERENCES Students (ID)
);

INSERT INTO Grades (Grade, student_id)
VALUES (85.5, 1),
       (92.3, 1),
       (78.9, 4),
       (89.1, 3),
       (95.2, 2),
       (57.1, 2),
       (87.4, 3),
       (84.6, 4);

SELECT *
FROM Students
WHERE AvgGrade > (SELECT AVG(Grade) FROM Grades);


CREATE TABLE MaleStudents
(
    ID   SERIAL PRIMARY KEY,
    Name VARCHAR(50),
    Age  INT
);

INSERT INTO MaleStudents (Name, Age)
VALUES ('John', 20),
       ('Alex', 19);

CREATE TABLE FemaleStudents
(
    ID   SERIAL PRIMARY KEY,
    Name VARCHAR(50),
    Age  INT
);

INSERT INTO FemaleStudents (Name, Age)
VALUES ('Jane', 22),
       ('Alex', 19);

SELECT Name
FROM MaleStudents ms
UNION
SELECT Name
FROM FemaleStudents fs;

SELECT *
FROM MaleStudents ms
INTERSECT
SELECT *
FROM FemaleStudents fs;

SELECT Name
FROM MaleStudents ms
EXCEPT
SELECT Name
FROM FemaleStudents fs;

