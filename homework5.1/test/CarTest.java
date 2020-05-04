package com.fy.test;

import com.fy.model.Car;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("奔驰", "SUV", 1600000.5, 6.5, 2000.5, 500);
		System.out.println("品牌："+car.getBrand()+",车型："+car.getCarType()
		+",价格:"+car.getPrice()
		+",百公里油耗："+car.getFuelConsumptionn()
		+",里程数："+car.getMileage()
		+",油箱容量"+car.getFuelTankVolume());
		car.RemainFuel();

	}

}
