SELECT employee_name
FROM Employees
WHERE department_id IN (1,2)

INTERSECT

SELECT employee_name
FROM Employees
WHERE employee_name LIKE 'A%';