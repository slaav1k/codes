-- Создание таблицы
Create table If Not Exists Person (id int, email varchar(255))
Truncate table Person
insert into Person (id, email) values ('1', 'a@b.com')
insert into Person (id, email) values ('2', 'c@d.com')
insert into Person (id, email) values ('3', 'a@b.com')

select * from Person

drop table Person

-- Условие
-- Write a solution to report all the duplicate emails.
-- Note that it's guaranteed that the email field is not NULL.
-- Return the result table in any order.
-- The result format is in the following example.

-- Решение
select email from Person
group by email
having count(email) > 1
