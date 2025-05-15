-- Дано
Create table If Not Exists SalesPerson (sales_id int, name varchar(255), salary int, commission_rate int, hire_date date);
Create table If Not Exists Company (com_id int, name varchar(255), city varchar(255));
Create table If Not Exists Orders (order_id int, order_date date, com_id int, sales_id int, amount int);

Truncate table SalesPerson
insert into SalesPerson (sales_id, name, salary, commission_rate, hire_date) values
(1, 'John', 100000, 6, '2006-04-01'),
(2, 'Amy', 12000, 5, '2010-05-01'),
(3, 'Mark', 65000, 12, '2008-12-25'),
(4, 'Pam', 25000, 25, '2005-01-01'),
(5, 'Alex', 5000, 10, '2007-02-03');
Truncate table Company
insert into Company (com_id, name, city) values ('1', 'RED', 'Boston');
insert into Company (com_id, name, city) values ('2', 'ORANGE', 'New York');
insert into Company (com_id, name, city) values ('3', 'YELLOW', 'Boston');
insert into Company (com_id, name, city) values ('4', 'GREEN', 'Austin');
Truncate table Orders
insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('1', '1/1/2014', '3', '4', '10000');
insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('2', '2/1/2014', '4', '5', '5000');
insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('3', '3/1/2014', '1', '1', '50000');
insert into Orders (order_id, order_date, com_id, sales_id, amount) values ('4', '4/1/2014', '1', '4', '25000');

-- Условие задачи
-- Write a solution to find the names of all the salespersons
-- who did not have any orders related to the company with the name "RED".
-- Return the result table in any order.
-- The result format is in the following example.


-- Решение
select sp.name from SalesPerson sp
where sp.name not in (
	select sp.name from
	orders join SalesPerson sp on orders.sales_id = sp.sales_id
	join Company c on orders.com_id = c.com_id
	where c.name = 'RED'
)


select sp.name
from salesperson sp
where sp.sales_id not in (
    select o.sales_id
    from orders o
    join company c on o.com_id = c.com_id
    where c.name = 'RED'
)


select sp.name
from salesperson sp
left join (
    select distinct o.sales_id
    from orders o
    join company c on o.com_id = c.com_id
    where c.name = 'RED'
) red_orders on sp.sales_id = red_orders.sales_id
where red_orders.sales_id is null




