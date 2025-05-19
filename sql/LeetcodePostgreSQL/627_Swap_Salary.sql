-- Дано
Create table If Not Exists Salary (id int, name varchar(100), sex char(1), salary int)
Truncate table Salary
insert into Salary (id, name, sex, salary) values ('1', 'A', 'm', '2500')
insert into Salary (id, name, sex, salary) values ('2', 'B', 'f', '1500')
insert into Salary (id, name, sex, salary) values ('3', 'C', 'm', '5500')
insert into Salary (id, name, sex, salary) values ('4', 'D', 'f', '500')

-- Условие задачи
-- Write a solution to swap all 'f' and 'm' values (i.e., change all 'f' values to 'm' and vice versa)
-- with a single update statement and no intermediate temporary tables.
-- Note that you must write a single update statement,
-- do not write any select statement for this problem.

-- Решение
update salary
set sex = case
	when sex = 'm' then 'f'
	when sex = 'f' then 'm'
end