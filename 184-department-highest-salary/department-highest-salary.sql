select employee.name as employee,department.name as department, salary from employee
join department on employee.departmentid=department.id
where (departmentid,salary) in (select departmentid ,max(salary) as salary from employee group by departmentid);