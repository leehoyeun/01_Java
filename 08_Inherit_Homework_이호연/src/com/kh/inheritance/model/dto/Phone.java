package com.kh.inheritance.model.dto;

public class Phone {
	private String brand;
	private String model;
	private int year;
	private int price;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;//브랜드
		this.model = model;//모델명
		this.year = year;//출시년도
		this.price = price;//가격
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return brand + "/"+model +"/"+year+ "/"+ price ;
	}
	
}
