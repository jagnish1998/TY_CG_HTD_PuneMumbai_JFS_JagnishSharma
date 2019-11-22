package com.capgeminin.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgeminin.jdbc.beans.Userbean;

public class UserDAOJDBCimpl implements UserDAO {
	FileReader reader = null;
	Properties prop = null;
	Userbean user;
	List<Userbean> userList = new ArrayList<Userbean>();

	public UserDAOJDBCimpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Userbean getInfo(int userid) {
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
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new Userbean();
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

	@Override
	public Userbean login(int userid, String password) {
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
			pstmt.setString(2, password);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new Userbean();
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

	@Override
	public List<Userbean> getAllInfo() {
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))) {

			while (rs.next()) {
				user = new Userbean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				userList.add(user);

			}
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
