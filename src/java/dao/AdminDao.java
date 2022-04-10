package dao;
import java.sql.*;
import dbConn.GetConnection;
import java.util.ArrayList;
import dto.RecruiterDto;
public class AdminDao 
{
public int adminLogin(String email, String password)
{
    int i=0;
    Connection con = GetConnection.getConnect();
    String query="select * from admin where email=? and password=?";
    try{
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2,password);
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
public ArrayList<RecruiterDto> getRecruiterList()
{
    ArrayList<RecruiterDto>list = new ArrayList<>();
    Connection con = GetConnection.getConnect();
    String query = "select * from recruiter";
    try
    {
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            RecruiterDto obj = new RecruiterDto();
            obj.setName(rs.getString(1));
            obj.setRecruiter(rs.getString(2));
            obj.setEmail(rs.getString(3));
            obj.setPassword(rs.getString(4));
            obj.setContact(rs.getString(5));
            obj.setAddress(rs.getString(6));
            obj.setStatus(rs.getString(7));
            list.add(obj);
        }
    }
    catch(SQLException e)
    {
        System.out.println("Exception: "+e);
    }
    return list;
}
public int updateRecruiter(String email)
{
    int i=0;
    Connection con = GetConnection.getConnect();
    String query ="update recruiter set status=? where email=?";
    try{
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,"active");
        ps.setString(2,email);
        i = ps.executeUpdate();
        con.close();
    }catch(SQLException e)
    {
        System.out.println("Exception :" +e);
    }
    return i;
}
}
