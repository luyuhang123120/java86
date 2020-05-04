package com.fy.test;

public class HighSpRail {

	public static void main(String[] args) {
		String endStation = "苏州";
		String seat = "二等座";
		String[][] price1 = {{"镇江"},{"44.5","29.5"}};
		String[][] price2 = {{"丹阳"},{"64.5","39.5"}};
		String[][] price3 = {{"常州"},{"94.5","69.5"}};
		String[][] price4 = {{"无锡"},{"129.5","79.5"}};
		String[][] price5 = {{"苏州"},{"159.5","99.5"}};
		String[][] price6 = {{"上海"},{"219.5","139.5"}};
		if (endStation.equals("镇江") && seat.equals("一等座")) {
			System.out.println("终站："+price1[0][0]+",一等座："+price1[1][0]);
		} else if (endStation.equals("镇江") && seat.equals("二等座")){
			System.out.println("终站："+price1[0][0]+",二等座："+price1[1][1]);
		} else if (endStation.equals("丹阳") && seat.equals("一等座")) {
			System.out.println("终站："+price2[0][0]+",一等座："+price2[1][0]);
		} else if (endStation.equals("丹阳") && seat.equals("二等座")){
			System.out.println("终站："+price2[0][0]+",二等座："+price2[1][1]);
		} else if (endStation.equals("常州") && seat.equals("一等座")) {
			System.out.println("终站："+price3[0][0]+",一等座："+price3[1][0]);
		} else if (endStation.equals("常州") && seat.equals("二等座")){
			System.out.println("终站："+price3[0][0]+",二等座："+price3[1][1]);
		} else if (endStation.equals("无锡") && seat.equals("一等座")) {
			System.out.println("终站："+price4[0][0]+",一等座："+price4[1][0]);
		} else if (endStation.equals("无锡") && seat.equals("二等座")){
			System.out.println("终站："+price4[0][0]+",二等座："+price4[1][1]);
		} else if (endStation.equals("苏州") && seat.equals("一等座")) {
			System.out.println("终站："+price5[0][0]+",一等座："+price5[1][0]);
		} else if (endStation.equals("苏州") && seat.equals("二等座")){
			System.out.println("终站："+price5[0][0]+",二等座："+price5[1][1]);
		} else if (endStation.equals("上海") && seat.equals("一等座")) {
			System.out.println("终站："+price6[0][0]+",一等座："+price6[1][0]);
		} else if (endStation.equals("上海") && seat.equals("二等座")){
			System.out.println("终站："+price6[0][0]+",二等座："+price6[1][1]);
		}

	}

}
