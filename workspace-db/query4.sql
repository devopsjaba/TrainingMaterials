-- 그룹화하면 중복된 데이터를 제외하고 보여줌 
select special_features
FROM film
group by special_features;

-- rating 열의 데이터를 그룹화
select rating
from film
group by rating;

-- special_features, rating 열 순서로 데이터를 그룹화하기
-- special_features 열로 우선 그룹화한 다음 rating 열로 그룹화함 
select special_features, rating
from film
group by special_features, rating;

select rating, special_features
from film
group by rating, special_features;

-- count() 함수로 그룹에 속한 데이터 개수 세기 
select special_features, count(*) as cnt
FROM film
group by special_features;

select special_features, rating, count(*) as cnt
from film
group by special_features, rating
order by special_features, rating, cnt desc;


select special_features, rating, count(*) as cnt
from film
group by special_features, rating
having rating = 'G'
;

-- 데이터 개수가 70보다 큰 것만 필터링하시오. 
select special_features, count(*) as cnt
from film
group by special_features
having cnt > 70
;

-- city 테이블의 국가코드별 도시숫자를 구하시오.
-- countrycode, count(countrycode)
select CountryCode, count(CountryCode)
from city
group by CountryCode
;

-- 두열의 데이터 중복제거 (distinct)
select distinct special_features, rating
from film;

-- distinct문에 count()함수 사용한 경우 -- count()는 그룹별로 집계를 하기때문에 반드시 group by가 필요함.
select distinct special_features, rating, count(*)
from film;







