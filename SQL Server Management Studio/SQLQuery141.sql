select e.ename,d.loc
from emp e,dept d
where d.deptno=e.deptno order by loc;

select e.ename,e.empno,d.loc,d.deptno
from emp e,dept d
where e.deptno=d.deptno
order by loc;

select emp.ename,dept.dname
from emp,dept;

select e.empno,e.ename,e.hiredate,j.stardate,j.enddate
from emp e,jobhist j
where e.hiredate between j.stardate and j.enddate;