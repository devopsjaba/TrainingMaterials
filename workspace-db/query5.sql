CREATE TABLE kosta_increment (
	col_1	int 	auto_increment primary key,
    col_2	varchar(50),
    col_3   int 
);

insert into kosta_increment (col_2, col_3)
values ('자동 입력1', 1);
insert into kosta_increment (col_2, col_3)
values ('자동 입력2', 1);

select * from kosta_increment;

insert into kosta_increment (col_2, col_3)
values ('자동 입력3', 3);

insert into kosta_increment (col_2, col_3)
values ('자동 입력4', 4);

select last_insert_id();

alter table kosta_increment auto_increment = 100;

insert into kosta_increment (col_2, col_3)
values ('자동 입력4', 4);

-- 자동으로 입력되는 값이 5씩 증가 
set @@auto_increment_increment = 5;
insert into kosta_increment (col_2, col_3)
values ('자동 입력101', 0);
insert into kosta_increment (col_2, col_3)
values ('자동 입력102', 0);
insert into kosta_increment (col_2, col_3)
values ('자동 입력103', 0);

drop table kosta_insert_select_from;
-- 조회 결과를 테이블에 입력하기 
create TABLE kosta_insert_select_from (
	col_1 int,
    col_2 varchar(10)
);

drop table kosta_insert_select_to;
create TABLE kosta_insert_select_to (
	col_1 int,
    col_2 varchar(10)
);

insert into kosta_insert_select_from values (1, 'Kosta');
insert into kosta_insert_select_from values (2, 'Ori');
insert into kosta_insert_select_from values (3, 'Ori2');
select * from kosta_insert_select_from;

-- 첫번째 테이블을 조회하여 두번째 테이블에 입력 
insert into kosta_insert_select_to
select * from kosta_insert_select_from;

select * from kosta_insert_select_to;

-- 새 테이블에 조회 결과 입력하기 
create table kosta_insert_select_to 
as (select * from kosta_insert_select_from);

-- 외래키로 연결되어 있는 테이블 생성하기
create table kosta_parent (col_1 int primary key);
create table kosta_child (col_10 int);

alter table kosta_child 
add foreign key (col_10) references kosta_parent(col_1);

-- 부모 테이블에 해당 데이터가 없는 경우 자식 테이블에 입력시 에러 발생.
insert into kosta_child values (1);


-- 부모 테이블에 데이터 입력 후 자식 테이블에도 데이터 입력 
insert into kosta_parent values (1);
insert into kosta_child values (1);
select * from kosta_parent;
select * from kosta_child;


-- 부모 테이블에서만 데이터 삭제한 경우 
delete from kosta_parent where col_1 = 1;

-- 자식 테이블의 데이터 삭제 후 부모 테이블 데이터 삭제
delete from kosta_child where col_10 = 1;
delete from kosta_parent where col_1 = 1;

-- 부모 테이블 삭제 (외래키로 연결되어 있는 테이블)
drop table kosta_parent;

-- 하위 테이블 삭제 후 상위 테이블 삭제
drop table kosta_child;
drop table kosta_parent;




create table kosta_parent (col_1 int primary key);
create table kosta_child (col_10 int);
alter table kosta_child 
add foreign key (col_10) references kosta_parent(col_1);
show create table kosta_parent;
show create table kosta_child;

-- 제약조건 제거하여 부모 테이블 삭제하기 
alter table kosta_child
drop constraint kosta_child_ibfk_1;

drop table kosta_parent;



-- 외래키 비활성 
set foreign_key_checks = 0;

-- 외래키 활성 
set foreign_key_checks = 1;


-- 실수형 데이터가 있는 테이블 생성 
CREATE TABLE kosta_float (col_1	float);
insert into kosta_float values (0.7);

-- float 타입은 부동 소수점 숫자 저장됨. 정확한 값이 아닌 근사치를 저장함  
select * from kosta_float where col_1 = 0.7;

-- 암시적 형 변환 
select 10 / 3;


-- 문자열 데이터의 길이, 크기 확인
use kosta;
create table kosta_char_varchar (
	col_1	char(5),
    col_2	varchar(5)
);

-- 실제 문자열의 개수와 사용되는 물리적 바이트 수 달라질 수 있음.
insert into kosta_char_varchar values ('12345', '12345');
insert into kosta_char_varchar values ('ABCDE', 'ABCDE');
insert into kosta_char_varchar values ('가나다라마', '가나다라마');
insert into kosta_char_varchar values ('hello', '안녕하세요');

select char_length(col_1) as char_length, length(col_1) as char_byte,
		char_length(col_2) as char_length, length(col_2) as char_byte
from kosta_char_varchar;

-- 문자 집합 확인하기
show character set;

-- 현재 시간 조회 
create table kosta_date (
	kostadate	date,
    kostatime	time,
    kostadatetime	datetime,
    kostatimestampt	timestamp
);

insert into kosta_date values (now(), now(), now(), now());
select * from kosta_date;





