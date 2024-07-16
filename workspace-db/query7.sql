-- 내부 조인한 테이블에서 조건에 맞는 데이터 조회
select a.customer_id, a.store_id, a.first_name, a.last_name, a.email, 
		a.address_id as a_address_id, b.address_id as b_address_id,
        b.address, b.district, b.city_id, b.postal_code, b.phone, b.location
FROM customer as a 
inner join address as b 
on a.address_id = b.address_id
where a.first_name = 'ROSA'
;

-- world 데이터베이스에서 국가코드와 해당 나라의 GNP를 조회 출력하시오.
select *
from city join country on city.CountryCode = country.Code;

select city.CountryCode, GNP
from city join country on city.CountryCode = country.Code;

-- 2개 조인 조건으로 조인한 테이블에서 요청사항에 맞는 데이터 조회하기 
select *
from customer as a 
	inner join address as b on a.address_id = b.address_id and a.create_date = b.last_update
	where a.first_name = 'ROSA';

-- first_name이 ROSA인 사람의 고객 정보와 주소 그리고 해당 주소가 어느 도시인지를 조회하시오.

select a.customer_id, a.first_name, a.last_name,
	   b.address_id, b.address, b.district, b.postal_code,
       c.city_id, c.city
from customer as a
	inner join address as b on a.address_id = b.address_id
    inner join city as c on b.city_id = c.city_id
where a.first_name = 'ROSA';    

-- LEFT OUTER JOIN 
-- address, store테이블을 address_id 열을 조인 조건으로 LEFT OUTER JOIN
-- ==> address 테이블을 기준으로 외부 조인했기에 store 테이블에 없는 address_id의 경우 null로 출력됨.

select a.address, a.address_id as a_address_id,
	   b.address_id as b_address_id, b.store_id
from address as a 
	left outer join store as b
    on a.address_id = b.address_id;

-- 앞선 외부조인한 결과에서 null만 조회 
-- 왼쪽에만 존재하는 데이터를 조회할 때 사용함 
select a.address, a.address_id as a_address_id,
	   b.address_id as b_address_id, b.store_id
from address as a 
	left outer join store as b
    on a.address_id = b.address_id
where b.address_id is null;


-- RIGHT OUTER JOIN 
-- address, store테이블을 address_id 열을 조인 조건으로 RIGHT OUTER JOIN
-- ==> address 테이블을 기준으로 외부 조인했기에 store 테이블에 없는 address_id의 경우 null로 출력됨.

select a.address, a.address_id as a_address_id,
	   b.address_id as b_address_id, b.store_id
from address as a 
	RIGHT outer join store as b
    on a.address_id = b.address_id;

-- RIGHT OUTER JOIN으로 조회한 결과에서 NULL만 조회 
select a.address, a.address_id as a_address_id,
	   b.address_id as b_address_id, b.store_id
from address as a 
	RIGHT outer join store as b
    on a.address_id = b.address_id
where a.address_id is null;

-- 테이블 준비
CREATE TABLE kosta_cross1(num int);
CREATE TABLE kosta_cross2(num varchar(10));
insert INTO kosta_cross1 values (1), (2), (3);
insert INTO kosta_cross2 values ('ko'), ('st'), ('o');

-- 교차 조인 (cross join) => 데이터가 총 9개 생성됨 
select a.num, b.num
from kosta_cross1 as a
cross join kosta_cross2 b 
where a.num = 1;
-- order by a.num;

-- 셀프 조인 (self join)
select a.customer_id as a_customer_id,
	   b.customer_id as b_customer_id
from customer as a 
	inner join customer b
    on a.customer_id = b.customer_id
;








