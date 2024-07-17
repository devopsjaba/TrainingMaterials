drop table users;
create table users (
	userid		varchar(50)		primary key,
    username	varchar(50)		not null,
    userpassword	varchar(50)	not null,
    userage		numeric(3)		not null,
    useremail	varchar(50)		not null
);

drop table boards (
	bid			int				primary key	auto_increment,
    btitle		varchar(100)	not null,
    bcontent	longtext		not null,
    bwriter		varchar(50)		not null,
    bdate		datetime		default now(),
    bfilename	varchar(50)		null,
    bfiledata	longblob		null
);





