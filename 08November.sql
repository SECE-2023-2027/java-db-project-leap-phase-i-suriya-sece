


create database information;
use information;
create table bank(
id int,
name varchar(30),
age int
 );
select*from bank;
insert into bank (id,name,age) values
(101,"Suriya",18);
insert into bank (id,name,age) values
(102,"adchaya",14);
insert into bank (id,name,age) values
(103,"anbu",47);
select * from bank where id=102;
set sql_safe_updates=0;
update bank set age=14 where id=101;
truncate table bank;
drop table bank;

alter table bank add city varchar(20);
alter table bank drop column city;
alter table bank modify column age varchar(10);
create database crud_;
use crud_;
create table crud_pro(id int, name varchar(20), age int);
select * from crud_pro;




















