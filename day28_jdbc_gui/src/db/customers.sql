-- customers.sql
select * from customers;

create table customers (
	code number(4) primary key,
	name varchar2(30) not null,
	email varchar2(30),
	phone varchar2(20)
);

insert into customers values(2, 'lee', '', '4882');
insert into customers values(3, 'park', '', '8879');
insert into customers values(4, 'kim', '', '1234');
insert into customers values(5, 'choi', '', '2341');
insert into customers values(6, 'yang', '', '6753');
