/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Brain
 */
public class Db_SqlServer {
    private static Connection con = null;
    public static Connection connectDbSqlServer() throws SQLException, ClassNotFoundException, Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-2SIGCPD\\BRAINSERVER;databaseName=AndreaBD; user = sa; password = brain"); 
    }
}
