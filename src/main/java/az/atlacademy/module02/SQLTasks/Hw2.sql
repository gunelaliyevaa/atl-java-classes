SELECT * FROM employees;

SELECT * FROM customers;
SELECT name, email FROM customers;

SELECT * FROM orders;
SELECT status FROM orders WHERE status = 'Completed';

SELECT * FROM products;s
SELECT name, price FROM products WHERE category = 'Electronics';

SELECT * FROM sales;
SELECT SUM(revenue) AS total_revenue FROM sales;

SELECT * FROM inventory;
INSERT INTO inventory (product_id, quantity)
VALUES
  (1, 100),
  (2, 150),
  (3, 200),
  (4, 50);
SELECT SUM(quantity) AS total_quantity FROM inventory;

SELECT CONCAT(first_name,' ', last_name) AS full_name FROM employees WHERE position = 'Manager';

SELECT * FROM orders WHERE customer_id = 2;

-- 9?

SELECT * FROM products WHERE price = (SELECT MAX(price) FROM products);
