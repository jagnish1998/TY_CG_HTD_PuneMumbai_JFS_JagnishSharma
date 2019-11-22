package com.caogemini.JDBCProjectPattern.DAO;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.caogemini.JDBCProjectPattern.bean.Bean;

public class UserDAOImp implements UserDAO {
	FileReader reader = null;
	Properties prop = null;
	Bean user = null;

	public UserDAOImp() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("jdbc.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Bean getInfo(int userid) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query"))) {
			pstmt.setInt(1, userid);

			try (ResultSet resultSet = pstmt.executeQuery()) {
				if (resultSet.next()) {
					user = new Bean();
					user.setUserid(resultSet.getInt(1));
					user.setUsername(resultSet.getString(2));
					user.setEmail(resultSet.getString(3));
					return user;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean insertUser(Bean user) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))) {
			pstmt.setInt(1, user.getUserid());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPassword());

			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Bean> getAllUser() {
		List<Bean> l = new ArrayList<Bean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query3"))) {
			while (rs.next()) {
				user = new Bean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				l.add(user);
			}
			return l;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password")); PreparedStatement stmt = conn.prepareStatement(prop.getProperty("query4"));) 
			
		{
			stmt.setInt(1,userid);
			stmt.setString(2,password);
			int count = stmt.executeUpdate();
			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
