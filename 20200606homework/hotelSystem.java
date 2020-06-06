package com.fy.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fy.model.hotel;
import com.fy.until.DBUtil;
import com.sun.org.apache.regexp.internal.recompile;

import sun.net.www.content.text.plain;

/**
 * 
 * @author lenovo
 * @date   2020年6月6日
 *
 */
public class hotelSystem {
	static Connection connection = null;
	static PreparedStatement preparedStatement = null;
	static ResultSet resultSet = null;
	 
	public static void main(String[] args) {
		//insert();
		//delete();
		//update();
		/*String sql = "select * from hotel";
		List<hotel> hotels = hotelAll(sql);
		for (hotel hotel : hotels) {
			System.out.println(hotel);
		}*/
		selectInner();
	}
	public static void insert() {
		connection = DBUtil.getConnection();
		String sql = "insert into hotel(id,hotelName,address,telephone) values(?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 104);
			preparedStatement.setString(2, "万怡酒店");
			preparedStatement.setString(3, "苏州园区");
			preparedStatement.setInt(4, 145662332);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}
		
	}
	public static void delete() {
		connection = DBUtil.getConnection();
		String sql = "delete from hotel where id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 104);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}
	}
	public static void update() {
		connection = DBUtil.getConnection();
		String sql = "update hotel set address = ? where id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "苏州相城区");
			preparedStatement.setInt(2, 103);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}
	}
	public static List<hotel> hotelAll(String sql) {
		List<hotel> hotels = new ArrayList<>();
		connection = DBUtil.getConnection();
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				hotel hotel = new hotel(resultSet.getInt("id"),
						resultSet.getString("hotelName"),
						resultSet.getString("address"),
						resultSet.getInt("telephone"));
				hotels.add(hotel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}
		return hotels;	
	}
	public static void selectInner() {
		connection = DBUtil.getConnection();
		String sql = "SELECT *,h.id hId from manager m INNER JOIN hotel h on hotelId = h.id;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("管理者编号:"+resultSet.getInt("id")
								+",密码:"+resultSet.getInt("password")
								+",酒店id编号:"+resultSet.getString("hotelId")
								+",酒店名称:"+resultSet.getString("hotelName")
								+",酒店地址:"+resultSet.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}
	}

}
