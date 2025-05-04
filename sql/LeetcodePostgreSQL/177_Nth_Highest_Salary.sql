-- Дано
Create table If Not Exists Employee (Id int, Salary int)
Truncate table Employee
insert into Employee (id, salary) values ('1', '100')
insert into Employee (id, salary) values ('2', '200')
insert into Employee (id, salary) values ('3', '300')
insert into Employee (id, salary) values ('4', '300')
insert into Employee (id, salary) values ('5', '200')
insert into Employee (id, salary) values ('6', '200')
insert into Employee (id, salary) values ('7', '100')

select * from Employee
drop table Employee

-- Условие
-- Write a solution to find the nth highest distinct salary from the Employee table.
-- If there are less than n distinct salaries, return null.

-- Задача
CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
    -- Write your PostgreSQL query statement below.
	select * from (
		select salary, row_number() over (order by salary desc) as r_n
		from (select distinct(salary) from Employee) as uniq_salaries
	)
	where r_n = N
  );
END;
$$ LANGUAGE plpgsql;


select * from (
	select salary, row_number() over (order by salary desc) as r_n
	from (select distinct(salary) from Employee) as uniq_salaries
)
where r_n = 4

SELECT * FROM NthHighestSalary(2);

