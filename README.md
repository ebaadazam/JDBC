JDBC (Java Database Connectivity) is an API (Application Programming Interface) in Java designed to connect and execute operations with databases. JDBC serves as a bridge between databases and Java applications, allowing developers to query and manipulate data within a database using Java code. It is part of the Java Standard Edition platform, from Oracle Corporation.<br><br>

Key Components of JDBC<br>
DriverManager: This class manages a list of database drivers. It matches connection requests from Java applications with the appropriate database drivers using communication subprotocols.<br>

Driver: JDBC drivers are database-specific implementations provided by database vendors or third-party providers to ensure that Java applications can communicate with the database. There are four types of JDBC drivers:<br>

Type 1: JDBC-ODBC Bridge Driver<br>
Type 2: Native-API Driver<br>
Type 3: Network Protocol Driver<br>
Type 4: Thin Driver (Pure Java Driver)<br>
Connection: This interface provides a connection with a specific database. It includes methods for managing transactions (e.g., commit and rollback) and creating statements.<br>

Statement: This interface is used for executing static SQL statements and returning their results. There are three types of statements in JDBC:<br>

Statement: Used for simple SQL statements without parameters.<br>
PreparedStatement: Extends Statement, used for precompiled SQL statements. It can accept input parameters, making it more efficient and secure against SQL injection.<br>
CallableStatement: Used to execute stored procedures in the database.<br>
ResultSet: This interface represents the result set of a database query. It provides methods to iterate through the results and read the data contained in each row.<br>

SQLException: This class handles any errors that occur in the database access process.<br>

How JDBC Works<br>
Load the JDBC Driver: Before connecting to a database, the JDBC driver must be loaded. This can be done dynamically by calling Class.forName() with the driver's class name.<br>

Establish a Connection: Use DriverManager.getConnection() to establish a connection to the database. This requires a database URL, which varies by database, and possibly a username and password.<br>

Create a Statement: Once connected, create a Statement, PreparedStatement, or CallableStatement object to carry out SQL commands.<br>

Execute Queries: Use the statement object to execute SQL queries or updates to the database. Queries return a ResultSet object.<br>

Process the Results: Iterate through the ResultSet to retrieve data from the query result.<br>

Close Resources: It's crucial to close database connections and resources like Statement and ResultSet objects after use to free up database resources.<br>
