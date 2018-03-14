package smart;

import Entity.Entity;
import Utils.FieldCount;
import Model.SmartTransactions;
import java.sql.Connection;
import core.Conn;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import GUI.Index;
import Utils.Constants;

/**
 *
 * @author Paul Andre Francisco
 * @date 03/08/2018
 */

public class Smart extends Thread
{    
    private String ID = Constants.ID;
    private final static String DRIVER = Conn.getDBDriver();
    private final static String URL = Conn.getDBURL();
    private final static String USER = Conn.getDBUsername();
    private final static String PASS = Conn.getDBPassword();
    private final static String TABLE = "smart";        
            
    public static Statement stmt;        
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {                                
        String regex = "^[0-9.]+$";

        // positive test cases, should all be "true"
        System.out.println("1.015150".matches(regex));
        System.out.println("12345".matches(regex));
        System.out.println("123456789".matches(regex));

        // negative test cases, should all be "false"
        System.out.println("".matches(regex));
        System.out.println("foo".matches(regex));
        System.out.println("aa123bb".matches(regex));
//        SmartTransactions tr = new SmartTransactions();
//        tr.insertRecord();
        
//        FieldCount count = new FieldCount();
//        try {
//            
//            System.out.println(count.getNumberOfFields());
//        } catch (InstantiationException ex) {
//            Logger.getLogger(Smart.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(Smart.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Smart.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        fetchRecords();
    }        
        
    public static ResultSet fetchRecords() throws ClassNotFoundException
    {
        try 
        {            
            Class.forName(DRIVER).newInstance();            
            Connection conn = DriverManager.getConnection(URL + TABLE, USER, "red field");            
            String query = "SELECT * FROM smart;";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
//            rs.last();
//            int colNo = rs.getRow();
//            rs.beforeFirst();                                                
//            stmt.close();            
            
            return rs;
        }
        catch (InstantiationException | IllegalAccessException | SQLException ex) 
        {
            Logger.getLogger(Smart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
