-- Дано
drop table employee
Create table If Not Exists Employee (id int, name varchar(255), department varchar(255), managerId int)
Truncate table Employee
insert into Employee (id, name, department, managerId) values ('101', 'John', 'A', NULL);
insert into Employee (id, name, department, managerId) values ('102', 'Dan', 'A', '101');
insert into Employee (id, name, department, managerId) values ('103', 'James', 'A', '101');
insert into Employee (id, name, department, managerId) values ('104', 'Amy', 'A', '101');
insert into Employee (id, name, department, managerId) values ('105', 'Anne', 'A', '101');
insert into Employee (id, name, department, managerId) values ('106', 'Ron', 'B', '101');

-- Условие задачи
-- Write a solution to find managers with at least five direct reports.
-- Return the result table in any order.
-- The result format is in the following example.

-- Решение
select name from employee
where id in (
	select managerid from employee
	group by(managerid)
	having count(managerid) > 4
)

