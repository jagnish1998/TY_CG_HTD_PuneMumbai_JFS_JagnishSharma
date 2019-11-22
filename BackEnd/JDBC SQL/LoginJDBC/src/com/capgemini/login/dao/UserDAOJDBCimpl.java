package com.capgemini.login.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.login.bean.UserBean;

public class UserDAOJDBCimpl implements UserDAO {
	FileReader reader = null;
	Properties prop = null;
	UserBean user;

	public UserDAOJDBCimpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public UserBean getInfo(int userid , String password) {
		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"));) {
			pstmt.setInt(1, userid);
			pstmt.setString(2,password);
			try (ResultSet rs = pstmt.executeQuery())
			{
				if (rs.next())
				{
					user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				}

				return user;
			}
		} catch (Exception e) {

		}
		return null;
	}

}
