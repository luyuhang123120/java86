package com.fy.demo;
/**
 * 
 * @author lyh
 * @date   2020年4月14日
 *
 */
public class Hospital {

	public static void main(String[] args) {
		int t =4;
		registration(t);
		
		
	}
	public static void registration(int t) {
		String msg = ("本人不能再挂号已经是黑名单");
		switch (t) {
		case 1:
		case 2:
		case 3:	
			System.out.println("次数"+t);
			break;
		default:
			System.out.println("本人不能再挂号已经是黑名单");
		}
	}

}
