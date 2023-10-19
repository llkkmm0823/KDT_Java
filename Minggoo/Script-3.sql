-- 주요 함수(문자함수)
-- select의 결과는 항상 테이블(항목명+값)
select CONCAT(empno, ename) as 붙인글자
from emp 
select LENGTH(ename) as 사람이름글자수 
from emp
select REPLACE(ename, 'E', 'AAA')
FROM EMP
select now()
select now(), 
year(now()) as 년, 
month(now()) as 월,
HOUR (now()) as 시, 
MINUTE(now()) as 분
select * from emp
