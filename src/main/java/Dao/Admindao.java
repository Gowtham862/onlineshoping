package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Dto.Admin;

import java.sql.*;

public class Admindao {
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
    	Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/pro","root","root");

}
	public int saveadmin(Admin admin) throws ClassNotFoundException, SQLException
	{
		Connection c=getConnection();
		PreparedStatement p=c.prepareStatement("insert into Admin values(?,?,?) ");
		p.setString(1,admin.getadminemail());
		p.setString(2,admin.getadminpassword());
		p.setInt(3, admin.getadminid());
		return p.executeUpdate();
	}
    public Admin checkadmin(String email) throws ClassNotFoundException, SQLException
    {
    	Connection co=getConnection();
    	PreparedStatement pst=co.prepareStatement("select *from admin whereadminemail=?");
    	pst.setString(1,email);
    	ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			return new Admin(rs.getString(1),rs.getString(2),rs.getInt(3));
		}
		return null;
    	
    }
}
