-- 데이터베이스 생성하기
CREATE DATABASE kosta;
-- 데이터베이스 선택하기 
USE kosta;

-- 데이터베이스 삭제하기
DROP DATABASE kosta;

-- 테이블 생성하기 
CREATE TABLE kosta_table (
	col_1	int,
    col_2	varchar(50),
    col_3	datetime
);

-- 테이블 삭제하기
DROP TABLE kosta_table;

-- INSERT 
INSERT INTO kosta_table (col_1, col_2, col_3)
		VALUES (1, 'kosta', '2024-06-27');

-- 데이터 유형 불일치로 인한 오류 발생된 케이스         
INSERT INTO kosta_table (col_1, col_2, col_3)
		VALUES ('문자', 'kosta', '2024-06-27'); 
        
-- INSERT 문 열 이름 생략하고 데이터 삽입
insert INTO kosta_table values (2, 'kosta2', '2024-06-28'); 

-- 열 개수 불일치로 인한 오류 발생
insert INTO kosta_table values (3, 'kosta3');	

-- 특정 열에만 데이터 삽입
insert into kosta_table (col_1, col_2) values (3, 'kosta3');

-- 삽입할 데이터의 순서 변경 
insert into kosta_table (col_1, col_3, col_2) values (4, '2024-06-29', 'kosta4');

-- 여러 데이터 한 번에 삽입
insert into kosta_table (col_1, col_2, col_3)
values (5, 'kosta5', '2024-06-30'), (6, 'kosta6', '2024-07-01'), 
		(7, 'kosta5', '2024-07-02');
        
-- 테이블 생성하기 (NULL 허용하지 않음)
CREATE TABLE kosta_table_notnull (
	col_1	int,
    col_2	varchar(50) not null
);
-- null 삽입 시 오류 발생한 케이스 
insert into kosta_table_notnull (col_1) values (1);
   
drop table kosta_table_notnull;  

-- UPDATE
update kosta_table set col_2 = 'kosta04'
where col_1 = 4;

-- 안전 모드 비활성화 (쿼리로 현재 연결된 세션에만 안전모드 비활성화하기)
set SQL_SAFE_UPDATES = 0;
-- 안전 모드 활성화 (쿼리로 현재 연결된 세션에만 안전모드 활성화하기)
set SQL_SAFE_UPDATES = 1;

-- COL_1 열 전체에 10을 더하는 쿼리 작성하기
update kosta_table set col_1 = col_1 + 10;

-- DELETE FROM 테이블 이름 where [열 조건]
delete FROM kosta_table 
where col_1 = 14;

-- 테이블 전체 데이터 삭제
delete from kosta_table;



-- select
select *
FROM kosta_table;    

-- 전체 데이터를 빠르게 삭제하려면 truncate 문 사용 
-- 롤백이 안 됨.
truncate table kosta_table;

/*
여러 줄 주석


*/
