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
public class Db_Mysql {
    static String username = "root";
    static String password = "root_brain";
    static String database = "db_brain";
    
    private static Connection conn = null;
    public static Connection connectDbMysql() throws SQLException, ClassNotFoundException, Exception
    {
        Class.forName("com.mysql.jdbc.driver");
        return conn = DriverManager.getConnection("localhost:3306/"+database, username, password);
    }
}
