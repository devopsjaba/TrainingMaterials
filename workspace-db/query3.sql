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

-- 데이터 100개를 건너뛰고 101번째 데이터부터 행 10개를 조회하시오.
select *
FROM CUSTOMER 
order by customer_id ASC limit 10 offset 100;

-- customer 테이블에서 첫 번째 글자가 A로 시작하는 데이터를 조회하시오.
select *
from customer 
where first_name like 'A%';

-- customer 테이블에서 첫 번째 글자가 AA로 시작하는 데이터를 조회하시오.
select *
from customer 
where first_name like 'AA%';

-- customer 테이블에서 first_name열에서 A로 끝나는 모든 문자열 데이터를 조회하시오.
select *
from customer
where first_name like '%A';

-- customer 테이블에서 first_name열에서 RA로 끝나는 모든 문자열 데이터를 조회하시오.
select *
from customer
where first_name like '%RA';

-- A를 포함한 모든 first_name 열의 데이터를 조회하시오.
select *
from customer
where first_name like '%A%';

-- 첫번째 글자가 A로 시작하지 않는 데이터만 조회하시오.
select *
from customer 
where first_name not like 'A%';

/*
	city 테이블에서 국가 코드가 K로 시작하는/끝나는/중간에 들어있는 국가코드를 표시하시오.
    city 테이블에서 국가코드가 K로 시작하는 3글자 국가코드를 표시하시오. 
*/
select CountryCode
from city
where CountryCode like 'K%';

select CountryCode
from city
where CountryCode like '%K';

select CountryCode
from city
where CountryCode like '%K%';

select CountryCode
from city
where CountryCode like 'K__';

-- A로 시작하면서 문자열 길이가 3인 데이터를 조회하시오.
select *
from customer
where first_name like 'A__';
-- A로 끝나면서 문자열 길이가 3인 데이터를 조회하시오.
select *
from customer
where first_name like '__A';
-- A로 시작하고 A로 끝나면서 문자열 길이가 4인 데이터를 조회하시오.
select *
from customer
where first_name like 'A__A';
-- 5글자인 이름을 갖고 있는 데이터를 조회하시오. 
select *
from customer
where first_name like '_____';

-- A_R로 시작하는 문자열을 조회하시오. 
select *
from customer
where first_name like 'A_R%';

-- __R로 시작하는 문자열을 조회하시오.
select *
from customer
where first_name like '__R%';

-- A로 시작하면서 R_로 끝나는 문자열 조회하시오. 
select *
from customer
where first_name like 'A%R_';

-- 정규 표현식을 사용해 customer 테이블의 first_name 열에서 K로 시작하거나 N으로 끝나는 데이터를 조회하시오.
select *
from customer
where first_name REGEXP '^K|N$';

-- 정규 표현식을 사용해 customer 테이블의 first_name 열에서 K와 함께 L과 N사이의 글자를 포함한 데이터를 조회하시오.
select *
from customer
where first_name REGEXP 'K[L-N]';


-- 정규 표현식을 사용해 customer 테이블의 first_name 열에서 K뒤에 L과 N사이의 글자가 포함하지 않는 데이터를 조회하시오.
select *
from customer
where first_name REGEXP 'K[^L-N]';

-- customer 테이블의 first_name 열에서 S로 시작하는 문자열 데이터 중 A 뒤에 L과 N사이의 글자가 있는 데이터를 조회하시오.
select *
from customer
where first_name like 'S%' and first_name regexp 'A[L-N]' ;

-- customer 테이블의 first_name 열에서 총 7 글자이고, 
-- A 뒤에 L과 N사이의 글자가 있고, 마지막 글자는 O인 문자열 데이터를 조회하시오.
select *
FROM customer
where first_name like '_______'
	and first_name regexp 'A[L-N]'
    and first_name regexp 'O$';








