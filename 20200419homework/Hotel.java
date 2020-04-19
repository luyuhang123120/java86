package com.fy.demo;
/**
 * 
 * @author lyh
 * @date   2020年4月17日
 *
 */
public class Hotel {

	public static void main(String[] args) {
		char voucher = 'N';	
		hotel(voucher);
	}
	public static char hotel(char voucher) {
		String hotel1 = "格林豪泰苏州火车站南广场拙政园商务酒店:江苏省苏州市姑苏区人民路2156号";
		String hotel2 = "格雅苏州工业园区金鸡湖东方之门酒店:江苏省苏州工业园区星海街169号";
		String hotel3 = "格林豪泰苏州漕湖工业园智选酒店:江苏省苏州市相城区黄畦路3号";
		String[] roomType = {"大床房","标间","豪华双床房","豪华双床房","高级大床房"};
		
		int[] price1 = {189,161,20};
		int[] price2 = {169,149,10};
		int[] price3 = {209,190,30};
		int[] price4 = {399,399,20};
		int[] price5 = {189,161,10};
		//[0]为门市价，[1]为会员价，[2]为代金券
		if (voucher=='Y') {
			System.out.print(hotel1+"  房型:"+roomType[1] + "  价格："+ price1[0]);
		} else {
			System.out.print(hotel1+"  房型:"+roomType[1] + "  价格："+ (price1[0]-price1[2]));
		}
		return voucher;
		
	}

}
