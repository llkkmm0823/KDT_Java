use shop 

create table test (
	id int(10),
	pw int(10)
)

show tables


insert into test values (1, 1)

select * from test


-- << root 계정 >>

create user 'mega'@'localhost' identified by 'Multi00!@'

grant all  privileges on *.* to 'mega'@'localhost'

use shop 

create table test (
	id int(10),
	pw int(10)
)

show tables

insert into test values (1, 1)

select * from test

-- mysql은 자동으로 서버에 반영이 되도록 설정!!!

select @@autocommit

set @@autocommit = 0

insert into test values (2, 2)

insert into test values (3, 3)

-- 이전에 commit한 이후의 작업의 묶음(트랜잭션)
-- 트랜잭션을 취소/반영할 수 있다. 

commit -- 반영하다. 

insert into test values (4, 4)

insert into test values (5, 5)

rollback -- 취소하다. 

-- << mega 계정 >>

use shop

show tables

select * from test