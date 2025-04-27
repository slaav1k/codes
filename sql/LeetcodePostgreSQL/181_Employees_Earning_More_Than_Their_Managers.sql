-- Дано
Create table If Not Exists Employee (id int, name varchar(255), salary int, managerId int)
Truncate table Employee
insert into Employee (id, name, salary, managerId) values ('1', 'Joe', '70000', '3')
insert into Employee (id, name, salary, managerId) values ('2', 'Henry', '80000', '4')
insert into Employee (id, name, salary, managerId) values ('3', 'Sam', '60000', NULL)
insert into Employee (id, name, salary, managerId) values ('4', 'Max', '90000', NULL)

-- Задача
-- Write a solution to find the employees who earn more than their managers.
-- Return the result table in any order.
-- The result format is in the following example.

-- Решение 1 Join
select e.name as Employee  from
Employee as e join Employee as m on e.managerId = m.id
where e.salary > m.salary

-- Решение 2 SubQuery
select e.name as Employee  from
Employee as e
where e.salary > (select salary from Employee where id = e.managerId)

-- Решение 3 EXISTS
select e.name as Employee  from
Employee as e
where exists (
	select 1
	from Employee as m 
	where m.id = e.managerId and e.salary > m.salary
)
