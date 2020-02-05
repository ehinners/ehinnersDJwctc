package edu.wctc;

import java.sql.*;

public class DatabaseUtils {
    // Connection constants for use by all servlets
    public static final String DRIVER_NAME = "jdbc:derby:";
    public static final String DATABASE_PATH = "db";
    public static final String USERNAME = "eric";
    public static final String PASSWORD = "eric";

    public static void closeAll(Connection conn, Statement stmt, ResultSet rset) {
        if (rset != null) {
            try {
                rset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
