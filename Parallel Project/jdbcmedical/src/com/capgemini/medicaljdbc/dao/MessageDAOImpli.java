package com.capgemini.medicaljdbc.dao;

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

import com.capgemini.medicaljdbc.bean.MessageBean;
import com.capgemini.medicaljdbc.exception.MedicalException;

public class MessageDAOImpli implements MessageDAO {

	FileReader reader = null;
	Properties prop = null;
	ResultSet rs = null;
	MessageBean message;

	public MessageDAOImpli() {
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
	public boolean sendMessage(String message, int uId, String type) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("sendmessage"))) {
			{
				pstmt.setString(1, message);
				pstmt.setInt(2, uId);
				pstmt.setString(3, type);

				// pstmt.execute();
				int rs = pstmt.executeUpdate();
				if (rs != 0) {
					return true;
				} else {
					return false;
				}
			}
		} catch (Exception e) {
			throw new MedicalException("Unable to Send Message");
		}
	}

	@Override
	public List<MessageBean> viewResponse(int uId) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("viewresponse"))) {
			pstmt.setInt(1, uId);
			ResultSet rs = pstmt.executeQuery();
			List<MessageBean> list = new ArrayList<MessageBean>();
			if (rs != null) {
				while (rs.next()) {
					message = new MessageBean();
					message.setMsid(rs.getInt(1));
					message.setMessage(rs.getString(2));
					message.setUid(rs.getInt(3));
					message.setType(rs.getString(4));
					list.add(message);
				}
				return list;
			} else {
				return null;
			}
		} catch (SQLException e) {
			throw new MedicalException("No Message Found");
		}
	}

	@Override
	public List<MessageBean> viewMessage() {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("viewmessage"))) {
			List<MessageBean> list = new ArrayList<MessageBean>();
			if (rs != null) {
				while (rs.next()) {
					message = new MessageBean();
					message.setMsid(rs.getInt(1));
					message.setMessage(rs.getString(2));
					message.setUid(rs.getInt(3));
					message.setType(rs.getString(4));
					list.add(message);
				}
				return list;
			} else {
				return null;
			}
		} catch (Exception e) {
			throw new MedicalException("No Message Found");
		}
	}

	@Override
	public boolean sendResponse(String message, String type, int uId) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("sendresponse"))) {
			{
				pstmt.setString(1, message);
				pstmt.setString(2, type);
				pstmt.setInt(3, uId);

				// pstmt.execute();
				int rs = pstmt.executeUpdate();
				if (rs != 0) {
					return true;
				} else {
					return false;
				}
			}
		} catch (Exception e) {
			throw new MedicalException("Enter Valid User Id");
		}
	}

}
