package com.fy.demo;
/**
 * 
 * @author lyh
 * @date   2020年4月14日
 *
 */
public class Hospital3 {

	public static void main(String[] args) {
		//第三次挂号
		double loginTime3=17.00;
		//第二次挂号
		double loginTime2=17.00;
		//第一次挂号
		double loginTime1=8.00;
		time(loginTime1, loginTime2,loginTime3);
				
	}
	public static double time(double loginTime1,double loginTime2,double loginTime3) {
		if (8.00<=loginTime1 & loginTime1<=19.00) {
			System.out.println("你已经成功在"+loginTime1+"挂号");
		} else {
			System.out.println("现在不是工作时间，请明天8:00到19:00登记");
		}if (loginTime2==loginTime1) {
			System.out.println("你不能在同一时间登记两次");
		} if ((loginTime2-loginTime1)<0.3) {
			System.out.println("您挂号时间不超过三十分钟，请稍后再来");			
		}else{
			System.out.println("你已经成功挂号，第二次挂号时间为"+loginTime2);
		}if (loginTime3==loginTime2) {
			System.out.println("你不能在同一时间登记两次");
		} if ((loginTime3-loginTime2)<0.3) {
			System.out.println("您挂号时间不超过三十分钟，请稍后再来");			
		}else{
			System.out.println("你已经成功挂号，第三次挂号时间为"+loginTime3);
		}
		return loginTime1;
		
	}
}
