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






