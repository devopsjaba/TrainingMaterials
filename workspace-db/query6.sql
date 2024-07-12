drop table businesscard_t;

-- NOT NULL
CREATE TABLE BusinessCard_T(
	name		varchar(255) not null,
    address		varchar(255),
    Telephone	varchar(255)
);

insert into businesscard_t values('이순신', '오리역 3번출구', '1234-5678');
insert into businesscard_t values(null, '오리역 3번출구2', '1234-5672');

drop table businesscard_t;
-- UNIQUE
CREATE TABLE BusinessCard_T(
	name		varchar(255) unique,
    address		varchar(255),
    Telephone	varchar(255)
);
insert into businesscard_t values('이순신', '오리역 3번출구', '1234-5678');
insert into businesscard_t values('이순신', '오리역 3번출구2', '1234-5672');


-- PRIMARY KEY
CREATE TABLE BusinessCard_T(
	id			int not null,
	name		varchar(255),
    address		varchar(255),
    Telephone	varchar(255),
    primary key(id)
);
insert into businesscard_t values(1, '이순신', '오리역 3번출구', '1234-5678');
insert into businesscard_t values(2, '이순신2', '오리역 3번출구2', '1234-5672');
insert into businesscard_t values(2, '이순신3', '오리역 3번출구3', '1234-5672');
select * from businesscard_t;

drop table businesscard_t;
-- FOREIGN KEY
CREATE TABLE BusinessCard_T(
	id			int not null,
	name		varchar(255),
    address		varchar(255),
    Telephone	varchar(255),
    primary key(id)
);
-- Salary_T 테이블의 businesscard_id를 외부키로 지정함 
CREATE TABLE Salary_T(
	id			int not null,
	salary_amount	int,
    businesscard_id	int not null,
    primary key(id), 
    foreign key(businesscard_id) references BusinessCard_T(id)
);
insert into BusinessCard_T values(1, '이순신', '오리역3번 출구', '1234-5678');
insert into BusinessCard_T values(2, '신사임당', '오리역3번 출구', '1234-5678');
insert into Salary_T values(1, 5000, 1);
insert into Salary_T values(2, 6000, 2);  
insert into Salary_T values(3, 6000, 4);  -- 참조 무결성 오류 발생 
select * from businesscard_t;
select * from Salary_t;

-- 참조 무결성 
insert into country(Code, Name) values ('ZZZ', 'ZZZ');
insert into city(Name, CountryCode) values ('Ori', 'ZZZ');

delete from city where Name = 'Ori' and CountryCode = 'ZZZ';
delete from country where Code='ZZZ' and Name = 'ZZZ';

-- 스키마 수정
create database sample;
drop table t_businesscard;
create table t_BusinessCard(
	id			int,
	name		varchar(255),
    address		varchar(255),
    telphone	varchar(255)
);

insert into t_businesscard values (1, '홍길동', '오리역', '010-1234-2345');
insert into t_businesscard values (2, '이순신', '이매역', '010-2341-2145');

-- 컬럼 추가 (id int)
-- alter table t_businesscard add column id int;
-- 컬럼명 변경 (address => addr)
alter table t_businesscard change address addr varchar(255);
-- 컬럼타입 변경 (addr varchar(255) => char(255))
alter table t_businesscard modify addr char(255);

-- id 컬럼에 PK, Unique 설정하기  
alter table t_businesscard add primary key(id);
alter table t_businesscard add unique(id);

-- address 기본값 설정 ("seoul")
alter table t_businesscard alter address set default "Seoul";

-- 테이블명 변경 (t_businesscard => businesscard_t)
alter table t_businesscard rename businesscard_t;

desc businesscard_t;


	










