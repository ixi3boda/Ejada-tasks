use TestSchema;

/* Counts the number of employees in each department and filters to only include departments with more than 5 employees. */
SELECT department_id,COUNT(*) AS employee_count
FROM Employees
GROUP BY department_id
HAVING COUNT(*) > 5;