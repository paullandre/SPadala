package Utils;

import core.Conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static smart.Smart.stmt;

/**
 * @author Paul Andre Francisco
 * @count db table fields to be used to the form table headers
 * @date 03/09/2018
 */

public class FieldCount {
    
//    Conn conn = new Conn();
    private final static String DRIVER = Conn.getDBDriver();
    private final static String URL = Conn.getDBURL();
    private final static String TABLE = "smart";
    private final static String USER = Conn.getDBUsername();
    
    public FieldCount(){
        
    }
    
    public int getNumberOfFields() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{                
        Class.forName(DRIVER).newInstance();            
        Connection conn = DriverManager.getConnection(URL + TABLE, USER, "red field");  
        String query = "DESCRIBE " + TABLE;
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        int rows = 0;
        
        while(rs.next())
        {            
            rows++;
        }
                        
        return rows;
    }
}
