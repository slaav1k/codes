-- Дано
Create table If Not Exists Person (Id int, Email varchar(255))
Truncate table Person
insert into Person (id, email) values ('1', 'john@example.com')
insert into Person (id, email) values ('2', 'bob@example.com')
insert into Person (id, email) values ('3', 'john@example.com')


-- Условие задачи
-- Write a solution to delete all duplicate emails,
-- 	keeping only one unique email with the smallest id.
-- For SQL users, please note that you are supposed to write
-- 	a DELETE statement and not a SELECT one.
-- After running your script, the answer shown is the Person table.
-- 	The driver will first compile and run your piece of code
-- 	and then show the Person table. The final order of the Person table does not matter.

-- Решение
select email, count(email) from Person
group by email
having count(email) = 1

delete from Person
where id not in (
	select min(id)
	from Person
	group by Email
)
