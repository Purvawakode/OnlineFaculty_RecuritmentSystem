//Create Coonection for login and resigtration form

package dbConn;
import java.sql.*;
public class GetConnection 
{
public static Connection getConnect()
{
    Connection con = null;
    try
    {
        Class.forName("com.mysql.jdbc.Driver"); //load jdbc driver
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");  //create connection
    }
    catch(ClassNotFoundException | SQLException ex)
    {
        System.out.println("EXception: " +ex);
 
         }
    return con;
}
}