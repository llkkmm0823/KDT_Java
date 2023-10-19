-- 주석 

-- shop, shop2, sys 

-- db > table > 항목(field, item, property  attribute)

-- shop을 선택후, SQL버튼을 클릭한 경우, shop이 선택된 것.

-- create table a ==> shop db에 만들어짐.

-- 다른 db를 사용하고 싶은 경우 

-- use shop2

-- create table b ==> shop2 db에 만들어짐.


create user 
'summer3'@'localhost' identified by '1111'

grant all PRIVILEGES 
on *.* 
to 'summer3'@'localhost'
-- 모든 db에 모든 권한을 주겠다
-- 이 계정에게


-- shop3.member3 definition

CREATE TABLE `member3` (
  `id` varchar(100) DEFAULT NULL,
  `pw` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;