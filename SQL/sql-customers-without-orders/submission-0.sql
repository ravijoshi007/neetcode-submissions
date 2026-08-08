-- Write your query below

select c.name
from Customers c
left join orders o
on c.id = o.customer_id
where o.customer_id is null
