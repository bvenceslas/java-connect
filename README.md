# jv_dbConnect

How to connect different db to a java program
# SQL DATABASES

## Connecting to a mysql database

When you're working offline, almost all the **mysql databases** are connected in the same way from java program,
here is a general class syntax to do that:
```
public class Db_Mysql {
    static String username = "root";
    static String password = "root_brain";
    static String database = "db_brain";
    
    private static Connection conn = null;
    public static Connection connectDbMysql() throws SQLException, ClassNotFoundException, Exception
    {
        Class.forName("com.mysql.jdbc.driver");
        return conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, username, password);
    }
}
```
for that, you need to add a **mysql-driver** in your project,
you can find it in library of project or you download a jar for that ()[]

## Connecting to a sqlite database

To connect your java program to a sqlite database you need to use this template class

```
public class DbSqlite {
    static Connection conn = null;
    static String url = "jdbc:sqlite:C:src/db_pack/db_try.sqlite";
    public static Connection connectDbMysql() throws Exception
    {
        
        Class.forName("org.sqlite.JDBC");
        return conn = DriverManager.getConnection(url);
    }
}
```

**src/db_pack/db_try.sqlite** is the path to the database which is inside the project

## Connecting to a SQLServer database

To connect your java program to a SQLServer database you need to use this template class

```
public class Db_SqlServer {
    private static Connection con = null;
    public static Connection connectDbSqlServer() throws SQLException, ClassNotFoundException, Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-2SIGCPD\\BRAINSERVER;databaseName=AndreaBD; user = sa; password = brain"); 
    }
}
```


## Connecting to a postGreSQL database

To connect your java program to a postGreSQL database you need to use this template class

```
public class Db_PostgreSQL {
    static String username = "root";
    static String password = "root_brain";
    static String database = "db_brain";
    static String url = "jdbc:postgresql://localhost/"+database;
    
    private static Connection conn = null;
    public static Connection connectDbMysql() throws SQLException, ClassNotFoundException, Exception
    {
        Class.forName("org.postgresql.Driver");
        return conn = DriverManager.getConnection(url, username, password);
    }
}
```
# NOSQL DATABASES

## Connecting to a MongoDb database

To connect your java program to a MongoDb database you need to follow up this process

    To install MongoDB on Windows, first download the latest release of MongoDB from https://www.mongodb.com/download-center.

    Enter the required details, select the **On-Premises** tab, in it you can choose the version of MongoDB, operating system 

    Now install the downloaded file, by default, it will be installed in the folder ```C:\Program Files\```.

    MongoDB requires a data folder to store its files. The default location for the MongoDB data directory is c:\data\db. So you need to create this folder using the Command Prompt. Execute the following command sequence.
```
public class Db_PostgreSQL {
    static String username = "root";
    static String password = "root_brain";
    static String database = "db_brain";
    static String url = "jdbc:postgresql://localhost/"+database;
    
    private static Connection conn = null;
    public static Connection connectDbMysql() throws SQLException, ClassNotFoundException, Exception
    {
        Class.forName("org.postgresql.Driver");
        return conn = DriverManager.getConnection(url, username, password);
    }
}
```

