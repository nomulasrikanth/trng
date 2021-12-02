select e.ename , c.ename
from emp e , emp c
where e.empno = c.mgr and e.HIREDATE < c.HIREDATE;