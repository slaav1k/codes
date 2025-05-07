-- Дано
drop table Employee
drop table Department
Create table If Not Exists Employee (id int, name varchar(255), salary int, departmentId int)
Create table If Not Exists Department (id int, name varchar(255))
Truncate table Employee
insert into Employee (id, name, salary, departmentId) values ('1', 'Joe', '70000', '1');
insert into Employee (id, name, salary, departmentId) values ('2', 'Jim', '90000', '1');
insert into Employee (id, name, salary, departmentId) values ('3', 'Henry', '80000', '2');
insert into Employee (id, name, salary, departmentId) values ('4', 'Sam', '60000', '2');
insert into Employee (id, name, salary, departmentId) values ('5', 'Max', '90000', '1');
Truncate table Department
insert into Department (id, name) values ('1', 'IT');
insert into Department (id, name) values ('2', 'Sales');

-- Условие задачи
-- Write a solution to find employees who have the highest salary
-- in each of the departments.
-- Return the result table in any order.
-- The result format is in the following example.

-- Решение
select d.name as Department, e.name as Employee, salary from Employee e
join Department d on e.departmentId = d.id
where e.salary = (
	select max(e2.salary)
	from Employee e2 
	where e2.departmentId = e.departmentId
)


select * from Employee e
join Department d on e.departmentId = d.id
where e.departmentId in (
	select d.id as d_id, max(salary) from Employee e
	join Department d on e.departmentId = d.id
	group by (d.id)
)


select d.name as Department, e.name as Employee, max(salary) from Employee e
join Department d on e.departmentId = d.id
group by (d.name)