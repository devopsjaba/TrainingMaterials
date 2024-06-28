USE sakila;

-- customer 테이블의 열 정보 조회하기 
show columns from sakila.customer;

-- 하나의 열 조회하기
select first_name 
from customer;

-- 2개 이상의 열 조회하기 
select first_name, last_name 
from customer;

-- 전체 열 조회하기 
select *
from customer;

-- where문으로 특정 값 조회하기
select * 
from customer 
where first_name = 'MARIA';

-- address_id가 200인 행을 조회하시오.
select *
from customer
where address_id = 200;

-- address_id가 200 미만에 해당하는 행을 조회하시오.
select *
from customer
where address_id < 200;



-- payment 테이블에서 payment_date 열에서 데이터가 2005년 7월 9일 이전 날짜에 해당하는 데이터를 조회하시오.
select * 
from payment
where payment_date < '2005-07-09';

USE world ;

desc city;
select * from city;

select *
from city
where CountryCode='KOR';

select *
from city
where population > 5000000;

select *
from city
where id = 500;

-- customer 테이블의 address_id 열에서 데이터가 5~10 범위에 해당하는 행을 조회하시오.
select *
from customer
where address_id between 5 and 10;

-- payment 테이블의 payment_date열에서 데이터가 2005년 6월17일~2005년 7월 19일 범위에 해당하는 행을 조회하시오.
select *
from payment
where payment_date between '2005-06-17 00:00:00' and '2005-07-19'
;

-- customer 테이블의 first_name열에서 M과 O범위의 데이터를 조회하시오.
select *
from customer
where first_name between 'M' and 'O'; 

-- customer 테이블의 first_name열에서 M과 O범위를 제외한 데이터를 조회하시오.
select *
from customer
where first_name not between 'M' and 'O'; 

-- city 테이블에서 city 열이 'Sunnyvale' 이면서 country_id 열이 103인 데이터를 조회하시오. 
select *
from city
where city = 'Sunnyvale' and country_id = 103;

select *
from payment
where payment_date >= '2005-06-01' and payment_date <= '2005-07-05';

-- customer 테이블의 first_name열에서 'MARIA' 또는 'LINDA'인 데이터를 조회하시오.
select *
FROM customer
where first_name = 'MARIA' or first_name = 'LINDA';

-- customer 테이블의 first_name열에서 'MARIA' 또는 'LINDA' 또는 'NANCY'인 데이터를 조회하시오.
select *
FROM customer
where first_name = 'MARIA' or first_name = 'LINDA' OR first_name = 'NANCY';

select *
FROM customer
where first_name in ('MARIA', 'LINDA', 'NANCY');

-- city 테이블에서 국가코드가 'KOR', 'CHN', 'JPN'인 도시를 찾으시오. 
select *
from city 
where Countrycode in ('KOR', 'CHN', 'JPN');

select *
from city 
where Countrycode='KOR' or  Countrycode='CHN' or Countrycode='JPN';

-- 국가코드가 'KOR'이고 인구가 100만 이상 500만 이하인 도시를 찾으시오.
select *
from city
where Countrycode='KOR' and (Population between 1000000 and 5000000);

select *
from city
where Countrycode='KOR' and (Population >= 1000000 and Population <= 5000000);

-- city 테이블에서 country_id열이 103 또는 country_id열이 86이면서 city열이 'Cheju', 'Sunnyvale', 'Dallas'인
-- 데이터를 조회하시오.
select * 
from city where country_id = 103;

select *
from city where country_id = 86
		 and city in ('Cheju', 'Sunnyvale', 'Dallas'); 
         
select *         
from city where country_id in (86, 103)
				and city in ('Cheju', 'Sunnyvale', 'Dallas'); 		
                
                
-- NULL 데이터 조회하기
select *
FROM address 
where address2 IS NULL;    


-- NULL 아닌 데이터 조회하기
select *
FROM address 
where address2 IS NOT NULL;  

-- address2열에서 공백인 행을 조회하시오.   
select *
FROM address 
where address2 = '';  
        
        
-- country 테이블에서 기대수명(LifeExpectancy)이 없는 국가 개수를 표시하시오.
-- count(*)         
select count(*)
from country 
where LifeExpectancy is null;

-- country 테이블에서 기대수명(LifeExpectancy)이 있는 국가 개수를 표시하시오.
select count(*)
from country 
where LifeExpectancy is not null;

