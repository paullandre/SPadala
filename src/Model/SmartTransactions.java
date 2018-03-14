package Model;

import core.Conn;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import smart.Smart;
import static smart.Smart.stmt;

/**
 * @author Paul Andre Francisco
 * @date 03/09/2018
 */
public class SmartTransactions {    
    private static final String DRIVER = Conn.getDBDriver();
    private static final String URL = Conn.getDBURL();
    private static final String TABLE = "smart";
    private static final String USER = Conn.getDBUsername();
    
    private static String WHERE;
    private static String SELECT;
    
    public SmartTransactions(){
        
    }
    
    public static Object connectToDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Class.forName(DRIVER).newInstance();            
        Connection conn = DriverManager.getConnection(URL + TABLE, USER, "red field");
        return conn;
    }
            
    public static ResultSet multipleSearch(List fields, String keyWord){
        int cnt = fields.size();        
        WHERE = "WHERE ";
        if(cnt == 1) {
            WHERE += fields.get(0) + " LIKE '%" + keyWord + "%'";
        }
        else if(cnt > 1){
            for(int x = 0; x < cnt; x++){                
                if(cnt - x == 1){
                    WHERE += fields.get(x) + " LIKE '%" + keyWord + "%'";
                }
                else{
                    WHERE += fields.get(x) + " LIKE '%" + keyWord + "%' OR ";
                }                                
            }            
        }
        else{
            WHERE = "";
        }
        
        SELECT = "SELECT * FROM " + TABLE + " " + WHERE;
        
//        System.out.println(SELECT);
        
        try {
            Connection connect = (Connection) connectToDB();
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT);
            
            return rs;
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(SmartTransactions.class.getName()).log(Level.SEVERE, null, ex);
        }                
        
        return null;
    }
        
    public static ResultSet getRecords(String field, String value) throws ClassNotFoundException
    {            
        try 
        {                              
            Connection connect = (Connection) connectToDB();
            String query;
            if(null != field){
                query = "SELECT * FROM " + TABLE + " WHERE " + field + " LIKE '%" + value + "%'";
            }
            else{
                query = "SELECT * FROM " + TABLE;
            }                        
                        
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(query);   
            
            return rs;
        }
        catch (InstantiationException | IllegalAccessException | SQLException ex) 
        {
            Logger.getLogger(Smart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }        
    
    public void insertRecord(String smartNo, String refNo, String amount, String balance, String type, String sender,
        String senderNo, String senderAddress, String receiver, String receiverNo, String receiverAddress) throws ClassNotFoundException
    {
        try 
        {            
            Connection conn = (Connection) connectToDB();
            stmt = conn.createStatement();
            String query = "INSERT INTO " + TABLE + " (smart_no, ref_no, amount, balance,"
                    + " type, sender, sender_no, sender_add, receiver, receiver_no, receiver_add)"
                    + " VALUES ('" + smartNo + "','" + refNo + "'," + amount + "," + balance + ",'" + type + "',"
                    + " '" + sender + "'," + senderNo + ",'" + senderAddress + "',"
                    + " '" + receiver + "', " + receiverNo + ",'" + receiverAddress + "')";   
            System.out.println(query);
            stmt.executeUpdate(query);
        }
        catch (InstantiationException | IllegalAccessException | SQLException ex) 
        {
            Logger.getLogger(Smart.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    /* TEST CODE ONLY */
    public static ResultSet fetchRecords() throws ClassNotFoundException
    {            
        try 
        {            
            Connection conn = (Connection) connectToDB();
            String query = "SELECT * FROM " + TABLE;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);   
            
            return rs;
        }
        catch (InstantiationException | IllegalAccessException | SQLException ex) 
        {
            Logger.getLogger(Smart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}