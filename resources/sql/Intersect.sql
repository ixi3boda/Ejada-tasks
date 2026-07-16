use TestSchema;

/* Get the names of employees who are in department 1 or 2 and whose names start with 'A' */
SELECT employee_name
FROM Employees
WHERE department_id IN (1,2)
    AND employee_name LIKE 'A%';