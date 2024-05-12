MySQL -> MySQL was first developed by a swedish company MySQL AB in 1995. The company was later acquired by Sun Microsystems, which in turn was acquired by Oracle Corporation.

1. MySQL is a relational database management system.
2. MySQL is open-source.
3. MySQL is free.
4. MySQL is very fast, reliable, scalable, and easy to use.
5. MySQL is cross-platform.


Ques. What is SQL?
Ans. SQL is the standard language for dealing with Relational Databases. SQL is used to insert, search, update, and delete database records.

Ques. What are the types of SQL statement?
Ans. There are mainly four types of SQL statement -:

    1. DDL -> It is the short name of Data Definition Language, which deals with database schemas and descriptions, of how the data should reside in the database.

    ● CREATE - to create a database and its objects like (table, index, views, store procedure, function, and triggers)
    ● ALTER - alters the structure of the existing database
    ● DROP - delete objects from the database
    ● TRUNCATE - remove all records from a table, including all spaces allocated for the records are removed
    ● RENAME - rename an object

    2. DML -> DML is short name of Data Manipulation Language which deals with data manipulation and includes most common SQL statements such SELECT, INSERT, UPDATE, DELETE, etc., and it is used to store, modify, retrieve, delete and update data in a database.

    ● SELECT - retrieve data from a database
    ● INSERT - insert data into a table
    ● UPDATE - updates existing data within a table
    ● DELETE - Delete all records from a database table
    ● MERGE - UPSERT operation (insert or update)

    3. DCL -> DCL is short name of Data Control Language which includes commands such as GRANT and mostly concerned with rights, permissions and other controls of the database system.

    ● GRANT - allow users access privileges to the database
    ● REVOKE - withdraw users access privileges given by using the GRANT command.

    4. TCL ->TCL is short name of Transaction Control Language which deals with a transaction within a database.

    ● COMMIT - commits a Transaction
    ● ROLLBACK - rollback a transaction in case of any error occurs
    ● SAVEPOINT - to roll back the transaction making points within groups.

Ques. What is CREATE DATABASE Statement?
Ans. The CREATE DATABASE statement is used to create a new SQL database.
Syntax -: CREATE DATABASE databasename;

Ques. What is DROP DATABASE Statement?
Ans. The DROP DATABASE statement is used to drop an existing SQL database.
Syntax -: DROP DATABASE databasename;

Ques. What is CREATE TABLE Statement?
Ans. The CREATE TABLE statement is used to create a new table in a database.
Syntax -: CREATE TABLE table_name (
            column1 datatype,
            column2 datatype,
            column3 datatype,
            ....
          );


Ques. What is INSERT INTO Statement?
Ans. The INSERT INTO statement is used to insert new records in a table.

Syntax -: 

It is possible to write the INSERT INTO statement in two ways:
1. Specify both the column names and the values to be inserted:
    INSERT INTO table_name (column1, column2, column3, ...)
    VALUES (value1, value2, value3, ...);

2. If you are adding values for all the columns of the table, you do not need to specify the column names in the SQL query. However, make sure the order of the values is in the same order as the columns in the table. Here, the INSERT INTO syntax would be as follows:
    INSERT INTO table_name
    VALUES (value1, value2, value3, ...);


Ques. What is DROP TABLE statement?
Ans. The DROP TABLE statement is used to drop an existing table in a database.

Syntax -: DROP TABLE table_name;

Ques. What is TRUNCATE TABLE?
Ans. The TRUNCATE TABLE statement is used to delete the data inside a table, but not the table itself.

Syntax -: TRUNCATE TABLE table_name;


Ques. What is ALTER TABLE Statement?
Ans. The ALTER TABLE statement is used to add, delete, or modify columns in an existing table.

The ALTER TABLE statement is also used to add and drop various constraints on an existing table.

Syntax -: ADD COLUMN -> ALTER TABLE table_name ADD column_name datatype;
          DROP COLUMN -> ALTER TABLE table_name DROP column_name;
          MODIFY COLUMN -> ALTER TABLE table_name MODIFY COLUMN column_name datatype;


Ques. What is Constraints?
Ans. Constraints are used to specify rules for data in a table. 
Constraints are used to limit the type of data that can go into  table.
Constraints are the restrictions imposed on the database contents and operations. They insure the correctness of data in a database.

Syntax -: CREATE TABLE table_name (
          column1 datatype constraint,
          column2 datatype constraint,
          column3 datatype constraint,
          ....
        );

Example -: NOT NULL, UNIQUE, PRIMARY KEY, FOREIGN KEY, CHECK, DEFAULT, CREATE INDEX.

Ques. What is SELECT statement?
Ans. The SELECT statement is used to select data from a database. The data returned is stored in a result table, called the result-set.

Syntax -: SELECT column1, column2 FROM table_name;
          SELECT * FROM table_name;


Ques. What is SELECT DISTINCT Statement?
Ans. The SELECT DISTINCT statement is used to return only distinct (different) values.

Inside a table, a column often contains many duplicate values; and sometimes you only want to list the different (distinct) values.

Syntax -: SELECT DISTINCT column1, column2 FROM table_name;


Ques. What is WHERE Clause?
Ans. The WHERE clause is used to filter records. It is used to extract only those records that fulfill a specified condition.

Syntax -: SELECT * from table_name WHERE condition;

Operators in The WHERE Clause -> The following operators can be used in the WHERE clause:

Operator	Description	Example
    =	        Equal	
    >	        Greater than	
    <	        Less than	
    >=	        Greater than or equal	
    <=	        Less than or equal	
    <>	        Not equal. Note: In some versions of SQL this operator may be written as !=	
    BETWEEN	    Between a certain range	
    LIKE	    Search for a pattern	
    IN	        To specify multiple possible values for a column


Ques. What is AND, OR and NOT Operators?
Ans. The WHERE clause can be combined with AND, OR, and NOT operators.
The AND and OR operators are used to filter records based on more than one condition:

AND -> The AND operator displays a record if all the conditions separated by AND are TRUE.
OR -> The OR operator displays a record if any of the conditions separated by OR is TRUE.
NOT -> The NOT operator displays a record if the condition(s) is NOT TRUE.

Syntax -: SELECT column1, column2 FROM table_name WHERE condition1 AND condition2 AND condition3;
          SELECT column1, column2 FROM table_name WHERE condition1 AND condition2 AND condition3;
          SELECT column1, column2 FROM table_name WHERE NOT condition;


Ques. What is ORDER BY Keyword?
Ans. The ORDER BY keyword is used to sort the result-set in ascending or descending order. The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword.

Syntax -: SELECT column1, column2, ... FROM table_name ORDER BY column1, column2, ... ASC|DESC;


Ques. What is NULL Values?
Ans. A field with a NULL value is a field with no value. If a field in a table is optional, it is possible to insert a new record or update a record without adding a value to this field. Then, the field will be saved with a NULL value.

Ques. How to Test for NULL Values?
Ans. It is not possible to test for NULL values with comparison operators, such as =, <, or <>. We will have to use the IS NULL and IS NOT NULL operators instead.

Syntax - SELECT column_names FROM table_name WHERE column_name IS NULL;
         SELECT column_names FROM table_name WHERE column_name IS NOT NULL;


Ques. What is UPDATE Statement?
Ans. The UPDATE statement is used to modify the existing records in a table.
Syntax -: UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;

Update Table -: UPDATE Customers SET ContactName = 'Alfred Schmidt', City = 'Frankfurt' WHERE CustomerID = 1;

UPDATE Multiple Records -: UPDATE Customers SET PostalCode = 00000 WHERE Country = 'Mexico';

Ques. What is DELETE Statement?
Ans. The DELETE statement is used to delete existing records in a table.

Syntax - DELETE FROM table_name WHERE condition; 
         DELETE FROM table_name;

Ques. What is LIMIT Clause?
Ans. The LIMIT clause is used to specify the number of records to return. The LIMIT clause is useful on large tables with thousands of records. Returning a large number of records can impact performance.

Syntax - SELECT column_name(s) FROM table_name WHERE condition LIMIT number;

Ques. WAQ for finding 2nd Highest salary?
Ans.  SELECT * from table_name order by salary desc limit 1 offset 1;

Ques. What are AGGREGATE Functions?
Ans. An AGGREGATE function is a function where the values of multiple rows are grouped together as input on certain criteria to form a single value of more significant meaning.

MIN() -: The MIN() function returns the smallest value of the selected column. 
    Syntax -: SELECT MIN(column_name) FROM table_name WHERE condition;

MAX() -: The MAX() function returns the largest value of the selected column. 
    Syntax -: SELECT MAX(column_name) FROM table_name WHERE condition;

COUNT() -: The COUNT() function returns the number of rows that matches a specified criterion. 
    Syntax - SELECT COUNT(column_name)FROM table_name WHERE condition;

AVG() -: The AVG() function returns the average value of a numeric column.
    Syntax - SELECT AVG(column_name) FROM table_name WHERE condition;

SUM() -:  The SUM() function returns the total sum of a numeric column.
    Syntax -:  SELECT SUM(column_name) FROM table_name WHERE condition;


Ques. What is LIKE Operator?
Ans. The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.

There are two wildcards often used in conjunction with the LIKE operator:

1. The percent sign (%) represents zero, one, or multiple characters
2. The underscore sign (_) represents one, single character
The percent sign and the underscore can also be used in combinations!

Syntax -: SELECT * FROM table_name WHERE columnN LIKE pattern;

    LIKE Operator	            |         Description
----------------------------------------------------------------------------------------------------------------
WHERE CustomerName LIKE 'a%'	|   Finds any values that start with "a"
WHERE CustomerName LIKE '%a'	|   Finds any values that end with "a"
WHERE CustomerName LIKE '%or%'	|   Finds any values that have "or" in any position
WHERE CustomerName LIKE '_r%'	|   Finds any values that have "r" in the second position
WHERE CustomerName LIKE 'a_%'	|   Finds any values that start with "a" and are at least 2 characters in length
WHERE CustomerName LIKE 'a__%'	|   Finds any values that start with "a" and are at least 3 characters in length
WHERE ContactName LIKE 'a%o'	|   Finds any values that start with "a" and ends with "o"
----------------------------------------------------------------------------------------------------------------


Ques. What is IN Operator?
Ans. The IN operator allows you to specify multiple values in a WHERE clause.
The IN operator is a shorthand for multiple OR conditions.

Syntax -: SELECT column_name(s) FROM table_name WHERE column_name IN (value1, value2, ...);
          SELECT column_name(s) FROM table_name WHERE column_name IN (SELECT STATEMENT);

Ques. What is BETWEEN Operator?
Ans. The BETWEEN operator selects values within a given range. The values can be numbers, text, or dates.

The BETWEEN operator is inclusive: begin and end values are included.

Syntax -: SELECT column_name(s) FROM table_name WHERE column_name BETWEEN value1 AND value2;


Ques. What is Aliases?
Ans. Aliases are used to give a table, or a column in a table, a temporary name.

Aliases are often used to make column names more readable.

An alias only exists for the duration of that query.

An alias is created with the AS keyword.

Syntax -: SELECT column_name AS alias_name FROM table_name;

Ques. What are JOIN?
Ans. A JOIN clause is used to combine rows from two or more tables, based on a related column between them.

1. INNER JOIN -: The INNER JOIN keyword selects records that have matching values in both tables.

Syntax -: SELECT column_name(s) FROM table1 INNER JOIN table2 ON table1.column_name = table2.column_name;

2. LEFT OUTER JOIN -: The LEFT OUTER JOIN keyword returns all records from the left table (table1), and the matching records (if any) from the right table (table2). The result set is 0 records from the right side, if there is no match.

Syntax -: SELECT column_name(s) FROM table1 LEFT OUTER JOIN table2 ON table1.column_name = table2.column_name;

3. RIGHT OUTER JOIN -: The RIGHT OUTER JOIN keyword returns all records from the right table (table2), and the matching records (if any) from the left table (table1). The result set is 0 records from the left side, if there is no match.

Syntax -: SELECT column_name(s) FROM table1 RIGHT OUTER JOIN table2 ON table1.column_name = table2.column_name;

4. FULL OUTER JOIN -: The FULL OUTER JOIN keyword returns all records when there is a match in left or right table records.

Syntax -: SELECT column_name(s) FROM table1 FULL OUTER JOIN table2 ON table1.column_name = table2.column_name;

5. CROSS JOIN -: The CROSS JOIN or Cartesian join returns the cartesian product of the sets of records from the two or more joined tables.

Syntax -: SELECT * FROM table1 CROSS JOIN table2;
          SELECT * FROM table1,table2;

6. SELF JOIN -: A SELF JOIN is a regular join, but the table is joined with itself.

Syntax -: SELECT column_name(s) FROM table1 T1, table1 T2 WHERE condition;

7. NATURAL JOIN -: A NATURAL JOIN is a join operation that creates an implicit join clause based on the common column in the two tables being used.
A NATURAL JOIN can be an INNER JOIN, a LEFT JOIN or a RIGHT JOIN. The default is INNER JOIN.

Syntax -:  SELECT * FROM table1 NATURAL JOIN table2;
           SELECT * FROM table1 NATURAL LEFT JOIN table2;
           SELECT * FROM table1 NATURAL RIGHT JOIN table2;

Ques. What is UNION Operator?
Ans. The UNION operator is used to combine the result-set of two or more SELECT statements.

Every SELECT statement within UNION must have the same number of columns
The columns must also have similar data types
The columns in every SELECT statement must also be in the same order

Syntax -: SELECT column_name(s) FROM table1 UNION SELECT column_name(s) FROM table2;

Ques. What is UNION ALL Operator?
Ans. The UNION operator selects only distinct values by default. To allow duplicate values, use UNION ALL. 

Syntax -: SELECT column_name(s) FROM table1 UNION ALL SELECT column_name(s) FROM table2;


Ques. What is GROUP BY Statement?
Ans. The GROUP BY statement groups rows that have the same values into summary rows, like "find the number of customers in each country".

The GROUP BY statement is often used with aggregate functions (COUNT(), MAX(), MIN(), SUM(), AVG()) to group the result-set by one or more columns.

Syntax -: SELECT column_name(s) FROM table_name WHERE condition GROUP BY column_name(s) ORDER BY column_name(s);

Ques. What is HAVING Clause?
Ans. The HAVING clause was added to SQL because the WHERE keyword cannot be used with aggregate functions.
*WHERE is given priority over HAVING.

Syntax -: SELECT column_name(s) FROM table_name WHERE condition GROUP BY column_name(s) HAVING condition ORDER BY column_name(s);

Ques. What is EXISTS Operator?
Ans. The EXISTS operator is used to test for the existence of any record in a subquery.

The EXISTS operator returns TRUE if the subquery returns one or more records.

Syntax -: SELECT column_name(s) FROM table_name WHERE EXISTS (SELECT column_name FROM table_name WHERE condition);


Ques. What is ANY and ALL Operators?
Ans. The ANY and ALL operators allow you to perform a comparison between a single column value and a range of other values.


Ques. What is INSERT INTO SELECT Statement?
Ans. The INSERT INTO SELECT statement copies data from one table and inserts it into another table.

The INSERT INTO SELECT statement requires that the data types in source and target tables matches.

Note: The existing records in the target table are unaffected.

Syntax -: INSERT INTO table2 SELECT * FROM table1 WHERE condition;

Ques. What is CASE Statement?
Ans. The CASE statement goes through conditions and returns a value when the first condition is met (like an if-then-else statement). So, once a condition is true, it will stop reading and return the result. If no conditions are true, it returns the value in the ELSE clause.

If there is no ELSE part and no conditions are true, it returns NULL.

Syntax -: CASE
            WHEN condition1 THEN result1
            WHEN condition2 THEN result2
            WHEN conditionN THEN resultN
            ELSE result
          END;


Ques. How to Create Table Using Another Table?
Ans. A copy of an existing table can also be created using CREATE TABLE.

The new table gets the same column definitions. All columns or specific columns can be selected.

If you create a new table using an existing table, the new table will be filled with the existing values from the old table.

Syntax -: CREATE TABLE new_table_name AS
          SELECT column1, column2,...
          FROM existing_table_name
          WHERE ....;



Ques. What is CREATE INDEX Statement?
Ans. The CREATE INDEX statement is used to create indexes in tables.

Indexes are used to retrieve data from the database more quickly than otherwise. The users cannot see the indexes, they are just used to speed up searches/queries.

Syntax -: Creates an index on a table. Duplicate values are allowed:
            CREATE INDEX index_name ON table_name (column1, column2, ...);

          Creates a unique index on a table. Duplicate values are not allowed:
            CREATE UNIQUE INDEX index_name ON table_name (column1, column2, ...);


Ques. How to work with DATES?
Ans. MySQL comes with the following data types for storing a date or a date/time value in the database:

DATE - format YYYY-MM-DD
DATETIME - format: YYYY-MM-DD HH:MI:SS
TIMESTAMP - format: YYYY-MM-DD HH:MI:SS
YEAR - format YYYY or YY


Ques. What are Views?
Ans. A view is a virtual table based on the result-set of an SQL statement.

A view contains rows and columns, just like a real table. The fields in a view are fields from one or more real tables in the database.

You can add SQL statements and functions to a view and present the data as if the data were coming from one single table.

A view is created with the CREATE VIEW statement.

Syntax -: CREATE VIEW view_name AS SELECT column1, column2, ... FROM table_name WHERE condition;

Ques. Write a query to Rename a table name.
Ans. SQL provides two syntax to rename table name -:
    Syntax-: 1. RENAME TABLE table_name TO new_table_name;
             2. ALTER TABLE BUYERS RENAME TO CUSTOMERS;


Ques. Write a query to Rename a database name.
Ans. There can be several reasons to rename a database name.
    Syntax -: 1. ALTER DATABASE OldDatabaseName MODIFY NAME = NewDatabaseName;
              2. RENAME DATABASE OldDatabaseName TO NewDatabaseName;


Ques. WHat are the Numeric data types in MySQL?
Ans. There are several data types in MySQL -: 

    Type Name   |      	Meaning
-----------------------------------------------------------
    TINYINT     |   Very Small Integer
    SMALLINT	|   Small Integer
    MEDIUMINT	|   Medium-sized Integer
    INT	        |   Standard Integer
    BIGINT	    |   Large Integer
    DECIMAL	    |   Fixed-point number
    FLOAT	    |   Single-precision floating-point number
    DOUBLE	    |   Double-precision floating-point number
    BIT	        |   Bit-field
-----------------------------------------------------------


Ques. How to add users in MySQL?
Ans. CREATE USER 'testuser' IDENTIFIED BY 'Password';


Ques. What is the MySQL binary log, and how do you use it?
Ans. The MySQL binary log is a log file that records all changes to the database, such as INSERT, UPDATE, and DELETE statements, as well as DDL statements. You can use the binary log for various purposes, such as replication, point-in-time recovery, auditing, and debugging. To use the binary log, you need to enable it and configure its settings.


Ques. What is a trigger, and how do you create one in MySQL?
Ans. A trigger is a user-defined, automatically executed piece of code in a MySQL database that responds to specific events, such as INSERT, UPDATE, or DELETE. Triggers help maintain data integrity, enforce business rules, and automatically perform actions when specific changes occur within the database. They usually operate on the same row as the event that activated them.

Syntax -: CREATE TRIGGER trigger_name event_timing event_type
          ON table_name FOR EACH ROW
          BEGIN 
            --Statements
          END;


Ques. What is the difference between CHAR and VARCHAR data types in MySQL, and when would you use one over the other?
Ans. CHAR and VARCHAR are both used to store string (non-binary) data -: 

CHAR -: CHAR is a fixed-length data type, meaning that it will always use the full length specified upon its creation. Use CHAR when storing strings of a short, fixed length (e.g., country codes).

VARCHAR -: VARCHAR is a variable-length data type, meaning it uses only the amount of space required for a given value (plus some minimal overhead). Use VARCHAR when storing strings of varying lengths (e.g., names or addresses).