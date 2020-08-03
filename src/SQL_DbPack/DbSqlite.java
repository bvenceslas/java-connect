/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL_DbPack;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Brain
 */
public class DbSqlite {
    static Connection conn = null;
    static String url = "jdbc:sqlite:C:src/db_pack/db_try.sqlite";
    public static Connection connectDbMysql() throws Exception
    {
        
        Class.forName("org.sqlite.JDBC");
        return conn = DriverManager.getConnection(url);
    }
}
