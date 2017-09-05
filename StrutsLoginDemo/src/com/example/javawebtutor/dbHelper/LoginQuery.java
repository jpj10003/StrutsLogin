/**
 * 
 */
package com.example.javawebtutor.dbHelper;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.example.javawebtutor.form.LoginForm;
import java.sql.PreparedStatement;

import java.sql.Connection;

/**
 * @author Jevic
 *
 */
public class LoginQuery {

	
	Connection connection;
	ResultSet rs;
	
	public LoginQuery ()
	{
		String url = "jdbc:mysql://localhost:3306/" + "dNBA" + "?autoReconnect=true&useSSL=false";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url,"root","jevic");
			
		}catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
	}
	
	public String validateUser(LoginForm login,HttpServletRequest request)
	{
		String query = "Select * from tuser where user_name = ?";
		String userCompare = login.getUserName();
		String password = login.getPassword();
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, userCompare);
			rs = ps.executeQuery();
			rs.next();
			if (!rs.getString("user_name").equals("null)"))
			{
				if(rs.getString("password").equals(password))
				{
					request.getSession().setAttribute("userName", login.getUserName());
					return "sucess";
				}
				else 
				{
					return "failure";
				}
			}
			else
			{
				return "failure";
			}
		} catch( SQLException e)
		{
			e.printStackTrace();
		}
		return "failure";
	}
}
