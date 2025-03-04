package com.toyfactory.model.dto;

import java.util.Objects;

public class Toy {
	private String name ;
	private int age ;
	private int price;
	private String collor;
	private String modelNum;
	private String material;
	
	public Toy() {}

	public Toy(String name, int age, int price, String collor, String modelNum, String material) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.collor = collor;
		this.modelNum = modelNum;
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCollor() {
		return collor;
	}

	public void setCollor(String collor) {
		this.collor = collor;
	}

	public String getModelNum() {
		return modelNum;
	}

	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, collor, material, modelNum, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(collor, other.collor) && Objects.equals(material, other.material)
				&& Objects.equals(modelNum, other.modelNum) && Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + ", price=" + price + ", collor=" + collor + ", modelNum="
				+ modelNum + ", material=" + material + "]";
	}
	
}
