package com.fy.model;

public class Car {
	private String brand;
	private String carType;
	private double price;
	private double fuelConsumptionn;
	private double mileage;
	private double fuelTankVolume;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getFuelConsumptionn() {
		return fuelConsumptionn;
	}
	public void setFuelConsumptionn(double fuelConsumptionn) {
		this.fuelConsumptionn = fuelConsumptionn;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getFuelTankVolume() {
		return fuelTankVolume;
	}
	public void setFuelTankVolume(double fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
		
	public Car(String brand, String carType, double price, double fuelConsumptionn, double mileage,
			double fuelTankVolume) {
		super();
		this.brand = brand;
		this.carType = carType;
		this.price = price;
		this.fuelConsumptionn = fuelConsumptionn;
		this.mileage = mileage;
		this.fuelTankVolume = fuelTankVolume;
	}
	public Car() {
	}
	
	public void RemainFuel(){
		double kilomRe = (mileage/100)*fuelConsumptionn;
		double remainFuel = (double) (fuelTankVolume - kilomRe);
		System.out.println("剩余油量为"+remainFuel);
	}
}
