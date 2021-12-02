SELECT e.ENAME, d.loc
FROM EMP e,dbo.dept d
where e.DEPTNO=d.DEPTNO;