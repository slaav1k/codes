-- Дано
Create table If Not Exists Triangle (x int, y int, z int)
Truncate table Triangle
insert into Triangle (x, y, z) values ('13', '15', '30');
insert into Triangle (x, y, z) values ('10', '20', '15');


-- Условие задачи
-- Report for every three line segments
-- whether they can form a triangle.
-- Return the result table in any order.


-- Решение
(select *, 'Yes' as triangle
from Triangle
where (x + y > z) and (y + z > x) and (z + x > y))
union
(select *, 'No' as triangle
from Triangle
where (x + y <= z) or (y + z <= x) or (z + x <= y))