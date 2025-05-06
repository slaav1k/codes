-- Дано
Create table If Not Exists Logs (id int, num int)
Truncate table Logs
insert into Logs (id, num) values ('1', '1');
insert into Logs (id, num) values ('2', '1');
insert into Logs (id, num) values ('3', '1');
insert into Logs (id, num) values ('4', '2');
insert into Logs (id, num) values ('5', '1');
insert into Logs (id, num) values ('6', '2');
insert into Logs (id, num) values ('7', '2');


-- Условие задачи
-- Find all numbers that appear at least three times consecutively.
-- Return the result table in any order.
-- The result format is in the following example.


-- Решение
select * from logs

select num, count(num) from logs
group by num

with lagged as (
	select *,
		lag(num, 1) over (order by id) as prev1,
		lag(num, 2) over (order by id) as prev2
	from logs
)
select distinct num ConsecutiveNums 
from lagged
where num = prev1 and num = prev2