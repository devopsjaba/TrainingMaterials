-- 단일 행 서브 쿼리 적용 
select * from customer
where customer_id = (select customer_id from customer where first_name = 'ROSA')
;

-- 잘못된 단일 행 서브 쿼리 적용시 오류 발생하는 경우 
select * from customer
where customer_id 
	= (select customer_id from customer where first_name in('ROSA', 'MARY'));
    
    
-- IN을 활용한 다중 행 서브 쿼리 실행     
select * FROM customer
where first_name in ('ROSA', 'MARY');    

select * FROM customer
where customer_id in (select customer_id from customer where first_name in('ROSA', 'LINDA'));    


-- 테이블 3개 조인하는 쿼리 
select a.film_id, a.title
FROM film AS a 
	inner join film_category b on a.film_id = b.film_id
    inner join category c on b.category_id = c.category_id
where c.name = 'Action'; 

-- IN 활용한 서브 쿼리 
select film_id, title
from film 
where film_id  in (
	select a.film_id
    from film_category as a
		inner join category as b on a.category_id = b.category_id
    where b.name = 'Action');  

-- query 요청 : 국가명이 'South Korea'의 국가코드를 찾아 이에 해당되는 도시의 수를 표시하시오.
 select count(*) from city where CountryCode = (
	select code from country where Name = 'South Korea'
 );
 
 -- query 요청 : city 테이블에서 국가코드가 'KOR'인 도시의 평균 인구 수보다 많은 
 -- 도시들의 이름을 표시하시오.
 select Name, Population from city where Population > (
	select avg(Population) from city where CountryCode = 'KOR'
 ) order by Population desc;
 
 
 
 -- not in을 활용한 서브 쿼리 적용하기 
select film_id, title
from film 
where film_id not in (
	select a.film_id
    from film_category as a
		inner join category as b on a.category_id = b.category_id
    where b.name = 'Action');  
 
 -- any를 활용한 서브 쿼리 적용 
select * FROM customer
where customer_id = any (select customer_id from customer where first_name in('ROSA', 'LINDA'));    
 
select * FROM customer
where customer_id < any (select customer_id from customer where first_name in('ROSA', 'LINDA'));    

-- exists
select * FROM customer
where exists (select customer_id from customer where first_name in('ROSA', 'LINDA'));


select * FROM customer
where exists (select customer_id from customer where first_name in('AAA', 'BBB'));

-- not exists
select * FROM customer
where not exists (select customer_id from customer where first_name in('AAA', 'BBB'));

-- all을 적용한 서브 쿼리 실행  
select * FROM customer
where customer_id = all (select customer_id from customer where first_name in('ROSA', 'LINDA')); 

-- 테이블 조인 
select a.film_id, a.title, a.special_features, c.name
FROM film AS a 
	inner join film_category b on a.film_id = b.film_id
    inner join category c on b.category_id = c.category_id
where a.film_id > 10 and a.film_id < 20; 

-- 테이블 조인 (from 문에 서브 쿼리 적용)
select a.film_id, a.title, a.special_features, x.name
FROM film AS a 
	inner join (
		select b.film_id, c.name
		from film_category as b
			inner join category as c on b.category_id = c.category_id
		where b.film_id > 10  and b.film_id < 20
    ) as x on a.film_id = x.film_id
; 

-- 국가명이 'South Korea', 'China', 'Japan'의 국가코드를 찾아 이에 해당되는 도시의 수를 각각 표시하시오.
select CountryCode, count(*) from city 
where CountryCode in (select code from country  where name in ('South Korea', 'China', 'Japan'))
group by CountryCode;

-- 인구가 5,000,000명이 넘어가는 도시의 이름, 국가 코드, 인구 수를 출력하시오.(in)
select Name, CountryCode, Population from city
where (Name, CountryCode) in (select Name, CountryCode from city where Population > 5000000)
order by Population desc;

-- select 문에 서브 쿼리 사용
select a.film_id, a.special_features, (select c.name from film_category as b inner join category as c 
								on b.category_id = c.category_id where a.film_id = b.film_id) as name
from film as a
where a.film_id > 10 and a.film_id < 20
;


