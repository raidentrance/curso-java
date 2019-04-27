drop table if exists post;
drop table if exists author;
create table if not exists post(id int primary key, name varchar (200) not null, content clob, author varchar(100));
create table if not exists author(id int primary key, name varchar (200) not null, twitter varchar(100));


insert into post (id, name,content,author )values(1, 'Spring jdbc', 'Spring is a framework that allows using spring jdbc','@raidentrance');
insert into author (id, name,twitter )values(1, 'Alex agapo', '@raidentrance');