/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL_DbPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Brain
 */
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
