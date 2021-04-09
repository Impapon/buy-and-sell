
package TestProject;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class SQLconnect {
     static Connection cn;
    public static Connection ConnectedDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kenakata","root","");
            System.out.println("Connected!");
            return cn;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
}
