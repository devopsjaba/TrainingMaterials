create database jpasampledb;

create table customer (						-- 고객 테이블 
	customer_id	varchar(50)	not null,		-- 고객 아이디 
    password varchar(100)	not null,		-- 비밀번호 
    customer_name varchar(100)	not null,	-- 고객 이름 
    age	int,	-- 나이
    rating	varchar(20)	not null,	-- 등급 (GOLD, SILVER, VIP)
    occupation	varchar(20),		-- 직업
    reserves	int	default 0,		-- 적립금 
    primary key(customer_id)
);


-- 스키마 / 계정 생성 (kmallapi)
create database kmalldb;
create user 'kmalluser'@'localhost' identified by '1234'; 
create user 'kmalluser'@'%' identified by '1234';
grant all privileges on kmalldb.* to 'kmalluser'@'localhost';
grant all privileges on kmalldb.* to 'kmalluser'@'%';















