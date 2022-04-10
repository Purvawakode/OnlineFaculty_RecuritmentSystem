
package dao;
import dbConn.GetConnection;
import dto.CandidateDto;
import java.sql.*;
import dbConn.GetConnection;
public class CandidateDao
{
 public int addCandidate(CandidateDto obj)
 {
     int i = 0;
     Connection con = GetConnection.getConnect();
     String query="insert into candidate(fname,lname,email,password,gender,date,address,mobile,qualification,percentage,experience,status)values(?,?,?,?,?,?,?,?,?,?,?,?)";
     try{
         PreparedStatement ps = con.prepareCall(query);
         ps.setString(1,obj.getFname());
         ps.setString(2,obj.getLname());
         ps.setString(3,obj.getEmail());
         ps.setString(4,obj.getPassword());
         ps.setString(5,obj.getGender());
         ps.setString(6,obj.getDate());
         ps.setString(7,obj.getAddress());
         ps.setString(8,obj.getMobile());
         ps.setString(9,obj.getQualification());
         ps.setString(10,obj.getPercentage());
         ps.setString(11,obj.getExperience());
         ps.setString(12,"active");
         i=ps.executeUpdate();
         con.close();
         
     }catch(SQLException e)
     {
         System.out.println("Exception: " +e);
     }
     return i;
 }
 
 public int candidateLogin(String email, String password)
{
    int i=0;
    Connection con = GetConnection.getConnect();
    String query="select * from candidate where email=? and password=? and status=?";
    try{
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2,password);
        ps.setString(3, "active");
        ResultSet rs = ps.executeQuery();
        if(rs.next())
           i=1;
         con.close();
    }
    catch(SQLException e)
    {
        System.out.println("Exception:" +e);
    }
    return i;
}
}
