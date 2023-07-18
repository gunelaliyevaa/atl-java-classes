CREATE TABLE Categories
(
    CategoryID SERIAL PRIMARY KEY,
    Name       VARCHAR(255)
);

CREATE TABLE Products
(
    ProductID     SERIAL PRIMARY KEY,
    Name          VARCHAR(255),
    Price         DECIMAL(10, 2),
    Quantity      INT,
    Description   TEXT,
    fk_CategoryID INT REFERENCES Categories (CategoryID)
);

CREATE TABLE Customers
(
    CustomerID  SERIAL PRIMARY KEY,
    FirstName   VARCHAR(50),
    LastName    VARCHAR(50),
    Address     VARCHAR(100),
    Email       VARCHAR(50),
    PhoneNumber NUMERIC
);

CREATE TABLE Orders
(
    OrderID       SERIAL PRIMARY KEY,
    OrderDate     DATE,
    fk_CustomerID INT REFERENCES Customers (CustomerID)
);

CREATE TABLE OrderDetails
(
    OrderDetailID SERIAL PRIMARY KEY,
    Quantity      INT,
    fk_OrderID    INT REFERENCES Orders (OrderID),
    fk_ProductID  INT REFERENCES Products (ProductID)
);

--insert statements
INSERT INTO Categories (CategoryID, Name)
VALUES (1, 'Electronics'),
       (2, 'Clothing'),
       (3, 'Books');

INSERT INTO Products (ProductID, Name, Price, Quantity, Description, fk_CategoryID)
VALUES (1, 'Laptop', 999.99, 10, 'Laptop with touchscreen', 1),
       (2, 'T-shirt', 19.99, 50, 'T-shirt with Led Zeppelin print', 2),
       (3, 'Novel', 12.99, 20, 'Best seller Novel', 3);

INSERT INTO Customers (CustomerID, FirstName, LastName, Address, Email, PhoneNumber)
VALUES (1, 'John', 'Doe', '123 Main St', 'johndoe@example.com', 1234567890),
       (2, 'Jane', 'Smith', '456 Elm St', 'janesmith@example.com', 9876543210);

INSERT INTO Orders (OrderID, OrderDate, fk_CustomerID)
VALUES (1, '2023-07-15', 1),
       (2, '2023-07-16', 2);

INSERT INTO OrderDetails (OrderDetailID, Quantity, fk_OrderID, fk_ProductID)
VALUES (1, 2, 1, 1),
       (2, 3, 1, 2),
       (3, 1, 2, 3);

--queries
SELECT *
FROM Products;
SELECT *
FROM Categories;
SELECT *
FROM Customers;
SELECT *
FROM Orders;
SELECT *
FROM OrderDetails;

SELECT *
FROM Products
WHERE ProductID = 2;

SELECT Products.Name
FROM Products
         JOIN Categories ON Products.fk_CategoryID = Categories.CategoryID
WHERE Categories.Name = 'Clothing';

SELECT *
FROM Customers
WHERE CustomerID = 1;

SELECT *
FROM Orders
WHERE fk_CustomerID = 2;


SELECT *
FROM OrderDetails
WHERE fk_OrderID = 2;

UPDATE Products
SET Price = 1050.90
WHERE ProductID = 1;

INSERT INTO Products (Name, Price, Quantity, Description, fk_CategoryID)
VALUES ('Guitar', 455, 10, 'Harley Benton', 1);

DELETE FROM Products
WHERE ProductID = 3;








