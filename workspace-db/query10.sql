drop table member;
create table member (
	id			varchar(10)	not null,
    pass		varchar(10) not null,
    name		varchar(30) not null,
    regidate	date	default (current_date) not null,
    primary key (id)
);

drop table board;
create table board (
	num int primary key,
    title varchar(200) not null,
    content varchar(2000) not null,
    id varchar(10) not null,
    postdate date default (current_date) not null,
    visitcount int(6)
);

alter table board
	add constraint board_member_fk foreign key(id)
    references member(id);

alter table board modify num int auto_increment;

INSERT INTO teampro.`member` (id, pass, name, regidate) VALUES('kosta', 'pass123#', 'kosta', now());
SELECT id, pass, name, regidate FROM member;

SELECT * FROM member where id = 'kosta' and pass = 'pass123#';

-- mvcboard 
drop table mvcboard;
create table mvcboard (
	idx		int 	primary key auto_increment,
    name	varchar(50)	not null,
    title	varchar(200) not null,
    content	varchar(2000)	not null,
    postdate	datetime default current_timestamp not null,
    ofile	varchar(200),
    sfile	varchar(30),
    downcount	int(5)	default 0 not null,
    pass varchar(50)	not null,
    visitcount	int default 0 not null
);

INSERT INTO teampro.mvcboard (name, title, content,  pass)
	VALUES('코스타', '제목1', '내용1입니다.', 'pass123#');
INSERT INTO teampro.mvcboard (name, title, content,  pass)
	VALUES('코스타2', '제목2', '내용2입니다.', 'pass123#');
INSERT INTO teampro.mvcboard (name, title, content,  pass)
	VALUES('코스타3', '제목3', '내용3입니다.', 'pass123#');
INSERT INTO teampro.mvcboard (name, title, content,  pass)
	VALUES('코스타4', '제목4', '내용4입니다.', 'pass123#');
INSERT INTO teampro.mvcboard (name, title, content,  pass)
	VALUES('코스타5', '제목5', '내용5입니다.', 'pass123#');  

INSERT INTO teampro.mvcboard (name, title, content,  pass)
	VALUES('코스타', '제목1', '내용11입니다.', 'pass123#');    

select count(*) from mvcboard;
select count(*) from mvcboard
	where title like '%1%';

select * from mvcboard
	where title like '%1%';

select * from mvcboard
	where content like '%1%';

select * from mvcboard
	where content like '%1%'
    order by idx desc ;


-- 첨부파일 관련 테이블 생성하기 
drop table myfile;
create table myfile(
	idx		int primary key,
    title	varchar(200)	not null,
    cate	varchar(100),
    ofile	varchar(100) not null,
    sfile	varchar(30) not null,
    postdate	datetime default now() not null
);


INSERT INTO mvcboard
(name, title, content, ofile, sfile, pass)
VALUES('코스타','8월', '팔초 핫한 더위', 'sky.jpg', '240802_1135', '1234');













