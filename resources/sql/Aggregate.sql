use TestSchema;

SELECT department_id,COUNT(*) AS employee_count
FROM Employees
GROUP BY department_id
HAVING COUNT(*) > 5;