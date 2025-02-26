package edu.kh.poly.ex1.model.dto;

public class Car /*extends Object*/ {

	//속성
	private String engine;
	private String fuel;
	private int wheel;
	//기능
	
	public Car() {}
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}
	//Object.toStiromg
	//오버라리이
	
	@Override
	public String toString() {
		
		return engine + "/" + fuel+"/" + wheel ;
	}
}
