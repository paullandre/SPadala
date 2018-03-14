package core;

/**
 * @author Paul Andre Francisco
 */
public class Conn 
{
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "red field";
    private static final String MAX_POOL = "250";
    
    public static String getDBDriver()
    {
        return DATABASE_DRIVER;
    }
    
    public static String getDBURL()
    {
        return DATABASE_URL;
    }
    
    public static String getDBUsername()
    {
        return USERNAME;
    }
    
    public static String getDBPassword()
    {
        return DATABASE_DRIVER;
    }        
}
