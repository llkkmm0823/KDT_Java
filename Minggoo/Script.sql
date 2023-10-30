--티스토리에 개념은 다시 한번 정리해봐야겠다ㅠ

-- 설명/comments 

-- 1.db생성 : ctrl + enter

create database shop2

use shop2 -- shop2 db선택 


-- 2.table생성:항목명 결정

create table member (
	id varchar(100),
	pw varchar(100),
	name varchar(100),
	tel varchar(100)
)

-- Data Definition Language(DDL)
-- 여기까지는 데이터를 어떤 것을 저장할지 정의하는 문법 

-- 이 아래부터는 데이터를 어떻게 할지 조작을 하는 문법 
-- Data Manipulation Language(DML)

-- 3.data넣어보고,수정/검색/삭제 
-- varchar == String

insert into member values ('100', '100', 'hong', '011')

insert into member values ('200', '200', 'hong', '011')

insert into member values ('300', '300', 'hong', '011')

select * from member

update member set tel = '000'

update member set tel = '999' where id = '100'

-- java ==, sql =

-- id가 200인 사람의 이름을 park이라고 수정해보세요.
update member set name = 'park' where id = '200'

-- 조건에서 and, or

delete from member where id = '100'

delete from member where id = '200' and tel = '000'

select id from member

select id, tel, name from member

INSERT INTO `reply` VALUES (1,3,'wow','apple'),(3,3,'wow2','apple');

INSERT INTO member VALUES 
('1','1','1','1'),
('1','1','1','1');

select * from member


create table product3 (
	id varchar(100),	
	name varchar(100),	
	content varchar(100),	
	price int,	
	company varchar(100),	
	img varchar(100)	
)

INSERT INTO product3 VALUES 
('100','shoes1','fun shoes1',1000, 'c100', '1.png'),
('101','shoes2','fun shoes2',2000, 'c200', '2.png'),
('102','shoes3','fun shoes3',3000, 'c300', '3.png'),
('103','shoes4','fun shoes4',4000, 'c400', '4.png')



select name, content from product3 where id = '100'

select price from product3 where id = '102'

UPDATE product3 set price = 5000 where name = 'shoes1'

UPDATE product3 set company = 'c555' where name = 'shoes2'

select * from product3 

UPDATE product3 
set name = 'fun', price = 9999 
where id = '103'

DELETE from product3 
WHERE id  = '101'

select * from product3 

DELETE from product3 
WHERE price = 3000 or img = '4.png'


