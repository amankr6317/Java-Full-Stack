Q1. WRITE a QUERY TO FETCH the EmpFname FROM the EmployeeInfo TABLE IN UPPER CASE AND USE the ALIAS NAME AS EmpName.

SELECT UPPER(EmpFname) AS NAME FROM employee_info;

Q2. WRITE a QUERY TO FETCH the NUMBER OF employees working IN the department ‘HR’.

SELECT COUNT(*) AS NUMBER FROM employee_info WHERE department IN ('HR');

Q3. WRITE a QUERY TO get the CURRENT date.

SELECT CURRENT_DATE AS 'CURRENT DATE';

Q4. WRITE a QUERY TO retrieve the FIRST four characters OF EmpLname FROM the EmployeeInfo table.

SELECT SUBSTRING(EmpLname,1,4) FROM employee_info;

Q5. WRITE a QUERY TO FETCH ONLY the place NAME(STRING BEFORE brackets) FROM the Address COLUMN OF EmployeeInfo table. USING the MID FUNCTION IN MySQL

-- SELECT MID(Address, 0, LOCATE('(',Address)) FROM employee_info;

Q6. WRITE a QUERY TO CREATE a NEW TABLE which consists OF DATA AND structure copied FROM the other table.

CREATE TABLE employee_info2 AS (SELECT EmpID, Department FROM employee_info);

Q7. WRITE q QUERY TO find ALL the employees whose salary IS BETWEEN 50000 TO 100000.

SELECT EmpFname FROM employee_info WHERE EmpID IN (SELECT EmpID FROM employe_position WHERE salary BETWEEN 50000 AND 100000)

Q8. WRITE a QUERY TO find the NAMES OF employees that BEGIN WITH ‘S’

SELECT * FROM employee_info WHERE EmpFname LIKE 'S%';

Q9. WRITE a QUERY TO FETCH top N records.

SELECT * FROM employee_info2 LIMIT 3;

Q10. WRITE a QUERY TO retrieve the EmpFname AND EmpLname IN a single COLUMN AS “FullName”. The FIRST NAME AND the LAST NAME must be separated WITH space.

SELECT CONCAT(EmpFname, ' ', EmpLname) AS FullName FROM employee_info;

Q11. WRITE a QUERY find NUMBER OF employees whose DOB IS BETWEEN 02/05/1970 TO 31/12/1975 AND are grouped according TO gender

SELECT COUNT(Gender), Gender FROM employee_info WHERE DOB BETWEEN '02/05/1970' AND '31/12/1975'  GROUP BY Gender;

Q12. WRITE a QUERY TO FETCH ALL the records FROM the EmployeeInfo TABLE ordered BY EmpLname IN descending ORDER AND Department IN the ascending order.

SELECT * FROM employee_info e ORDER BY e.Department ASC, e.EmpLname DESC ;

Q13. WRITE a QUERY TO FETCH details OF employees whose EmpLname ENDS WITH an alphabet ‘A’ AND CONTAINS five alphabets.

SELECT * FROM employee_info WHERE EmpLname LIKE '%A' AND LENGTH(EmpLname) > 5;

Q14. WRITE a QUERY TO FETCH details OF ALL employees excluding the employees WITH FIRST NAMES, “Sanjay” AND “Sonia” FROM the EmployeeInfo table.

SELECT * FROM employee_info WHERE EmpFname NOT IN ('Sanjay','Sonia');

Q15. WRITE a QUERY TO FETCH details OF employees WITH the address AS “DELHI(DEL)”.

SELECT * FROM employee_info WHERE Address LIKE 'DELHI(DEL)%';

Q16. WRITE a QUERY TO FETCH ALL employees who also hold the managerial position.

SELECT E.EmpFname, E.EmpLname, P.EmpPosition FROM employee_info E INNER JOIN employee_position P ON E.EmpID = P.EmpID AND P.EmpPosition IN ('Manager');

Q17. WRITE a QUERY TO FETCH the department-wise COUNT OF employees sorted BY department’s COUNT IN ascending order.

SELECT Department, COUNT(EmpID) AS EmpDeptCount FROM employee_info GROUP BY Department ORDER BY EmpDeptCount ASC;

Q18. WRITE a QUERY TO calculate the even AND odd records FROM a table.

-- SELECT EmpID FROM (SELECT rowno, EmpID from employee_info) WHERE MOD(rowno,2)= 0;

Q19. WRITE a SQL QUERY TO retrieve employee details FROM EmployeeInfo TABLE who have a DATE OF joining IN the EmployeePosition table.

SELECT * FROM employee_info E WHERE EXISTS(SELECT * FROM employee_position P WHERE E.EmpId = P.EmpId);

Q20. WRITE a QUERY TO retrieve two minimum AND maximum salaries FROM the EmployeePosition table. TO retrieve two minimum salaries, you can WRITE a QUERY AS below:

SELECT DISTINCT Salary FROM employee_position E1 WHERE 2 >= (SELECT COUNT(DISTINCT Salary)FROM employee_position E2 WHERE E1.Salary >= E2.Salary) ORDER BY E1.Salary DESC;
SELECT DISTINCT Salary FROM employee_position E1 WHERE 2 >= (SELECT COUNT(DISTINCT Salary) FROM employee_position E2 WHERE E1.Salary <= E2.Salary) ORDER BY E1.Salary DESC;

Q21. WRITE a QUERY TO find the Nth highest salary FROM the TABLE WITHOUT USING TOP/LIMIT keyword.

-- SELECT Salary FROM employee_position E1 WHERE IN ( SELECT COUNT( DISTINCT ( E2.Salary ) ) FROM employee_position E2 WHERE E2.Salary > E1.Salary );

Q22. WRITE a QUERY TO retrieve DUPLICATE records FROM a table.

SELECT EmpID, EmpFname, Department, COUNT(*) FROM employee_info GROUP BY EmpID, EmpFname, Department HAVING COUNT(*) > 1;

Q23. WRITE a QUERY TO retrieve the LIST OF employees working IN the same department.

-- Select E.EmpID, E.EmpFname, E.Department FROM employee_info E, employee_position E1 WHERE E.EmpId = E1.EmpId;

Q24. WRITE a QUERY TO retrieve the LAST 3 records FROM the EmployeeInfo table.

SELECT * FROM employee_info WHERE EmpID <=3 UNION SELECT * FROM (SELECT * FROM employee_info E ORDER BY E.EmpID DESC) AS E1 WHERE E1.EmpID <=3;

Q25. WRITE a QUERY TO find the third-highest salary FROM the EmpPosition table.

SELECT Salary FROM(SELECT Salary FROM employee_position ORDER BY salary DESC LIMIT 3) AS emp ORDER BY salary ASC LIMIT 1;
