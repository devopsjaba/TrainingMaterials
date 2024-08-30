create table a1 
(
	key1 integer primary key,
    value integer
);

delete from a1;
select * from a1;

create table if not exists board
(
	bno		int		auto_increment primary key,
    title	varchar(100)	not null,
    content	text	not null,
    writer	varchar(30)	not null,
    view_cnt	int 	default 0,
    comment_cnt int		default 0,
    reg_date	datetime	default current_timestamp,
    up_date		datetime	default current_timestamp on update current_timestamp
);

SELECT bno, title, content, writer, view_cnt, comment_cnt, reg_date
FROM board
where bno = 1;

INSERT INTO springbasic.board
(title, content, writer, view_cnt, comment_cnt, reg_date, up_date)
VALUES('8월 마지막 주', '태풍10호가 북상중입니다.', 'kosta', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO springbasic.board
(title, content, writer, view_cnt, comment_cnt, reg_date, up_date)
VALUES('8월 마지막 주 수요일', '태풍10호가 북상중입니다. 언제올라오나요?', 'ori', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO board
(title, content, writer)
VALUES('스프링 게시판', '게시판 구현중입니다', 'kosta');

delete from board where bno = 2 and writer = 'kosta';

UPDATE board
SET title='8월 마지막 주', content='태풍10호가 북상중입니다.', up_date= now()
WHERE bno=4 and writer = 'kosta';

select count(*) from board;

SELECT bno, title, content, writer, view_cnt, comment_cnt, reg_date
FROM board
order by reg_date desc, bno desc 
limit 10 offset 0; 

update board
set view_cnt = view_cnt + 1
where bno = 586;

select * from board
where true and title like 'Pioneering1%'; 

select * from board
where true and title like concat('Pioneering1', '%'); 

SELECT bno, title, content, writer, view_cnt, comment_cnt, reg_date
	FROM board
where bno IN (337, 338, 339)
order by reg_date desc, bno desc;    
