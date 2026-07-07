use TestSchema;

SELECT employee_name,salary
FROM Employees
WHERE salary >
(
    SELECT AVG(salary)
    FROM Employees
);

SELECT employee_name AS name
FROM Employees

UNION

SELECT department_name
FROM Departments;
