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


