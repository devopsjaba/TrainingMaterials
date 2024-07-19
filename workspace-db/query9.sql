drop table users;
create table users (
	userid		varchar(50)		primary key,
    username	varchar(50)		not null,
    userpassword	varchar(50)	not null,
    userage		numeric(3)		not null,
    useremail	varchar(50)		not null
);

drop table boards;
create table boards (
	bid			int				primary key	auto_increment,
    btitle		varchar(100)	not null,
    bcontent	longtext		not null,
    bwriter		varchar(50)		not null,
    bdate		datetime		default now(),
    bfilename	varchar(50)		null,
    bfiledata	longblob		null
);

drop table accounts;
create table accounts (
	aid			varchar(20)		primary key,
    owner		varchar(20)		not null,
    balance		numeric			not null
);


INSERT INTO jdbc.users (userid, username, userpassword, userage, useremail) 
VALUES('kosta1', '코스타1', 'pass123#', 25, 'kosta1@kosta.com');


INSERT INTO jdbc.boards
(btitle, bcontent, bwriter, bdate, bfilename)
VALUES('비오는 수요일', '장마가 이제 시작되었습니다.', 'kosta1', now(), 'event.png');


UPDATE jdbc.boards
SET btitle='비오는 수요일', bcontent='장마가 이제 시작되었습니다', bwriter='kosta1', bfilename='event2.png'
WHERE bid=1;

DELETE FROM jdbc.boards
WHERE bid=1;

DELETE FROM jdbc.boards WHERE bwriter='kosta1';








