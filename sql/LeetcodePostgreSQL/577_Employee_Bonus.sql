-- Дано
Create table If Not Exists Employee (empId int, name varchar(255), supervisor int, salary int)
Create table If Not Exists Bonus (empId int, bonus int)
Truncate table Employee
insert into Employee (empId, name, supervisor, salary) values ('3', 'Brad', NULL, '4000');
insert into Employee (empId, name, supervisor, salary) values ('1', 'John', '3', '1000');
insert into Employee (empId, name, supervisor, salary) values ('2', 'Dan', '3', '2000');
insert into Employee (empId, name, supervisor, salary) values ('4', 'Thomas', '3', '4000');
Truncate table Bonus
insert into Bonus (empId, bonus) values ('2', '500');
insert into Bonus (empId, bonus) values ('4', '2000');


-- Условие задачи
-- Write a solution to report the name and bonus amount of each employee
-- with a bonus less than 1000.
-- Return the result table in any order.
-- The result format is in the following example.

-- Решение
select e.name, b.bonus from
Employee e left join Bonus b on e.empId = b.empId
where bonus < 1000 or bonus is null

select * from
Employee e left join (
	select * from Bonus b
	where bonus < 1000
)
on e.empId = b.empId




select * from Bonus