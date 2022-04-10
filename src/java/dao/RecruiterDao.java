
package dao;
import dto.RecruiterDto;
import java.sql.*;
import dbConn.GetConnection;
public class RecruiterDao 
{
public int addRecruiter(RecruiterDto obj)   
{
    int i=0;
    Connection con = GetConnection.getConnect();
    System.out.println("name : "+obj.getName());
     System.out.println("name : "+obj.getRecruiter());
      System.out.println("name : "+obj.getEmail());
       System.out.println("name : "+obj.getPassword());
        System.out.println("name : "+obj.getContact());
        
    System.out.println("name : "+obj.getAddress());
    String query = "insert into recruiter(name,recruiter,email,password,contact,address,status) values(?,?,?,?,?,?,?)";
    try
    {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,obj.getName());
        ps.setString(2,obj.getRecruiter());
        ps.setString(3,obj.getEmail());
        ps.setString(4,obj.getPassword()); 
        ps.setString(5,obj.getContact());
        ps.setString(6,obj.getAddress());
        ps.setString(7,"inactive");
        
        i=ps.executeUpdate();
        con.close();
          
    }catch(SQLException e)
    {
        System.out.println("Exception :" +e);
    }
    return i;
}

public int recruiterLogin(String email, String password)
{
    int i=0;
    Connection con = GetConnection.getConnect();
    String query="select * from recruiter where email=? and password=? and status=?";
    try{
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2,password);
        ps.setString(3, "active");
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
         i=1;
         con.close();
        }
    }
    catch(SQLException e)
    {
        System.out.println("Exception:" +e);
    }
    return i;
}

public RecruiterDto getTypeName(String email)
{
    RecruiterDto rt = new RecruiterDto();
    Connection con = GetConnection.getConnect();
    String query = "select recruiter,name from recruiter where email=?";
    try{
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,email);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            rt.setRecruiter(rs.getString(1));
            rt.setName(rs.getString(2));
        }
        con.close();
    }catch(SQLException e)
    {
        System.out.println("Exception:" +e);
    }
    return rt;
}
}
