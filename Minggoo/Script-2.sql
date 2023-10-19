-- company db가 선택된 상태
-- use company
CREATE TABLE SALGRADE
(
 GRADE int primary key,
 LOSAL int,
 HISAL int
)
desc SALGRADE
CREATE TABLE DEPT
(
 DEPTNO int primary key,
 DNAME  VARCHAR(100),
 LOC   VARCHAR(100)
)
desc dept
CREATE TABLE EMP
(
 EMPNO   int primary key,
 ENAME   VARCHAR(100),
 JOB    VARCHAR(100),
 MGR    int,
 HIREDATE DATE,
 SAL    decimal(7,2),
 COMM   decimal(7,2),
 DEPTNO  int
)
desc emp
-- 파일이 저장되는 위치를 알고 싶으면 alt + enter
select * from emp -- select 컬럼명(열이름), * ==> all columns
select empno from emp
select DEPTNO from EMP
select DISTINCT DEPTNO from EMP -- DISTINCT 중복제거
select deptno from emp
where DEPTNO = 10 -- = 동일연산자
-- sql은 대소문자를 구분하지 않음. DEPTNO, deptno, DeptNo
-- 내부적으로 처리할 때 모두 대문자로 변경해서 실행되기 때문!
-- oracle에서는 대문자로 변경해서 실행 --> 버그
-- oracle에서는 모두 대문자로 쓰기 권장
select ename as ‘이름‘, sal * 12 as ‘연봉’ from emp
select * from emp
order by sal ASC -- 작 --> 큰 정렬(오름차순), asc생략 가능
select * from emp
order by sal desc -- 큰 --> 작 정렬(내림차순)
select * from emp
Where job = ‘MANAGER’ -- 조건
order by sal desc -- 정렬은 마지막에 한다.!
select * from EMP e
WHERE DEPTNO = 30
select * from EMP e
WHERE not DEPTNO = 30
select * from EMP e
WHERE DEPTNO = 30 and JOB = ‘SALESMAN’ -- 조건 모두 만족 and
select * from EMP e
WHERE DEPTNO = 30 or JOB = ‘SALESMAN’ -- 조건중에 하나라도 만족 or
select * from EMP e
WHERE SAL >= 3000
select * from EMP e
WHERE SAL != 3000
select DISTINCT job from EMP e -- 중복제거하면 종류를 알 수 있음.
select * from EMP e
WHERE JOB = ‘CLERK’ or JOB = ‘SALESMAN’ or JOB = ‘MANAGER’
select * from EMP e
WHERE JOB in (‘CLERK’, ‘SALESMAN’, ‘MANAGER’)
select * from EMP e
WHERE JOB not in (‘CLERK’, ‘SALESMAN’, ‘MANAGER’)
select * from EMP e
where sal BETWEEN 2000 AND 3000 -- 사잇값
select * from EMP e
where sal not BETWEEN 2000 AND 3000
select * from EMP e
where ENAME LIKE ‘_L%’
select * from EMP e
where ENAME LIKE ‘%AM%’
select * from EMP e
where ENAME not LIKE ‘%AM%’
select * from EMP e
WHERE COMM is NULL
select * from EMP e
WHERE COMM is not NULL
-- shop2.product3 definition
CREATE TABLE `product3` (
 `id` varchar(100) DEFAULT NULL,
 `name` varchar(100) DEFAULT NULL,
 `content` varchar(100) DEFAULT NULL,
 `price` float DEFAULT NULL,
 `company` varchar(100) DEFAULT NULL,
 `img` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
show tables
-- --------------DML기본 정리 문제
desc product3 -- 스키마(뼈대) describe
select * from product3 p
order by price desc -- 내림차순
select name, content, price, company
from product3 p
order by company
select DISTINCT company
from product3 p
select price * 5 as price5
from product3 p
select name, company
from product3 p
where price = 5000
select name, price, company
from product3 p
where price BETWEEN 3000 and 6000
select name, company
from product3 p
WHERE company != ‘c100’
select name, company
from product3 p
WHERE company IN (‘c100’, ‘c200’)
select *
from product3 p
WHERE name LIKE ‘%4’
select *
from product3 p
WHERE content LIKE ‘%food%’
-- select문의 결과는 무조건 테이블 형태
UPDATE product3
set content = ‘품절’
WHERE price = 5000
-- Update, insert, delete의 결과는 무조건 정수
select * from product3 p
WHERE price = 5000
UPDATE product3
set img = ‘0.png’, price = 10000
WHERE id = 100 or id = 102
select * from product3 p
delete from product3
WHERE company = ‘c100’
DELETE FROM product3 -- data삭제
drop table product3 -- table삭제(스키마+데이터)
select * from product3 p




-- 집계/그룹함수 정리 문제 
select count(empno) 
from emp
select count(empno)
from emp
where DEPTNO = 20 or mgr <= 7700
select min(sal)
from emp
where DEPTNO = 10 or DEPTNO = 20
select min(sal), max(sal), sum(sal)
from emp
select deptno, avg(sal), max(sal), min(sal)
from emp
group by DEPTNO 
select deptno, sum(sal)
from emp
group by DEPTNO 
order by DEPTNO 
select deptno, avg(sal)
from emp
group by DEPTNO 
HAVING avg(sal) >= 2000
ORDER by DEPTNO desc
select count(deptno), avg(sal)
from emp
where job = 'MANAGER'
select count(deptno)
from emp
where ename like '%S%'
select count(deptno) as dept_count
from emp
where sal >= 3000 and comm != 0
order by sal desc