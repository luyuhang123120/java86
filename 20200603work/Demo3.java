package com.fy.test;
/**
 * 
 * @author lyh
 * @date   2020年6月3日
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.2:3306/data86_3", "root", "root");
		Statement statement = con.createStatement();
		/*
		 * 商品系统
		 */
		String sql = "insert into user(id,userName,address,role) values('8','张九龄','杭州','会员')";
		//statement.execute(sql);
		String sql1 ="update productlist set productName ='美的空调' where productId = 100008";
		//statement.executeUpdate(sql1);
		String sql2 = "delete from user where id = '8'";
		//statement.execute(sql2);
		String sql3 = "select * from productlist";
		//ResultSet set = statement.executeQuery(sql3);
		/*while (set.next()) {
			System.out.println("productId="+set.getInt(1)+",productName="+set.getString("productName")
			+",productType="+set.getString("productType")
			+",productPrice="+set.getString("productPrice"));
		}*/
		
		/*
		 * 医院系统
		 */
		String s = "insert into doctor(id,name,docLevel,depart,hospital) values('1005','华佗','主任医师','外科','北京协和医院')";
		String s1 = "insert into doctor(id,name,docLevel,depart,hospital) values('1006','张倩','主任医师','儿科','北京大学人民医院')";
		//statement.execute(s);
		//statement.execute(s1);
		String s2 = "delete from doctor where id = '1005'";
		//statement.execute(s2);
		String s3 = "update regis set dapart = '外科' where name ='小红'";
		//statement.executeUpdate(s3);
		String s4 = "select * from regis";
		ResultSet set = statement.executeQuery(s4);
		while (set.next()) {
			System.out.println("regisId:"+set.getInt(1)
			+",socialId:"+set.getString("name")
			+",name:"+set.getInt(1)
			+",registime:"+set.getString("registime")
			+",inquryTime:"+set.getString("inquryTime")
			+",doctor:"+set.getString("doctor")
			+",hospital:"+set.getString("hospital")
			+",dapart:"+set.getString("dapart"));
		}
	}

}
