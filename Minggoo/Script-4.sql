-- ------------
-- 검색 
select * from member -- row여러개 
select * from member where id = 'apple' -- row 한개 
-- 로그인을 하면 id, pw입력 
select * from member where id = 'apple' and pw = '1234'
select count(id) from member where id = 'apple' and pw = '1234'
select id from member where id = 'apple' and pw = '1234'