-- customer 테이블 first_name 열 기준 정렬
select *
from customer
order by first_name;

-- customer 테이블 last_name 열 기준 정렬
select *
from customer
order by last_name;

-- customer 테이블 store_id, first_name 열 순으로 정렬하기 
select *
from customer
order by store_id, first_name;

select *
from customer
order by first_name, store_id;

-- ASC, DESC 
select *
from customer
order by first_name asc;

select *
from customer
order by first_name desc;

select *
from customer
order by store_id desc, first_name asc;

-- LIMIT로 상위 10개의 데이터 조회하기 
select *
FROM customer
order by store_id desc, first_name asc limit 10;

-- LIMIT로 101번째부터 10개의 데이터 조회하기 
select *
FROM customer
order by customer_id asc limit 100, 10;
