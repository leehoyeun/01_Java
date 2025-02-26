package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{//전기차

	 private int batteryCapacity;

	 public Tesla() {

	 
	 
	 //매개 변수 생성자 + 상속받은것도 포함
		 
	 
	 }

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+"/"+batteryCapacity;
		}
	
}