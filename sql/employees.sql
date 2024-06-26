-- Создание таблицы employees
CREATE TABLE employees (
    id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    hire_date DATE
);

-- Вставка данных в таблицу employees
INSERT INTO employees (id, first_name, last_name, email, hire_date) VALUES
(1, 'John', 'Doe', 'john.doe@example.com', '2019-05-15'),
(2, 'Jane', 'Smith', 'jane.smith@example.com', '2021-03-22'),
(3, 'Robert', 'Brown', 'robert.brown@example.com', '2020-11-10'),
(4, 'Emily', 'Davis', 'emily.davis@example.com', '2018-07-19'),
(5, 'Michael', 'Wilson', 'michael.wilson@example.com', '2020-02-28');

-- Запрос для выбора сотрудников, нанятых после 1 января 2020 года
SELECT
    id,
    first_name,
    last_name,
    email,
    hire_date
FROM employees
WHERE hire_date > '2020-01-01';
