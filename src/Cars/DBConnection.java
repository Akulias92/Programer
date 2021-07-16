package Cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
     private String url = "jdbc:mysql://localhost:3306/cars";    
     private String username = "root";
     private String password = "lujo92";
     
     private Connection conn = null;
     private static DBConnection instance = null;

    private DBConnection() throws SQLException {
        
        conn = DriverManager.getConnection(url, username, password);
    }

    public static Connection getConn() throws SQLException {
        if(instance == null)
            instance = new DBConnection();
       
        return instance.conn;
    }
     
     
     
    
}
