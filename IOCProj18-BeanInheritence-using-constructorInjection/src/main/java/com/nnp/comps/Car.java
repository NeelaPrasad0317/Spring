package com.nnp.comps;

public class Car {
	private String regNo;
	private String engineNo;
	private String model;
	private String company;
	private String type;
	private int engineCC;
	private String color;
	private String onwer;
	private String fuelType;

	
	public Car(String regNo, String engineNo, String model, String company, String type, int engineCC, String color,
			String onwer, String fuelType) {
		super();
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.model = model;
		this.company = company;
		this.type = type;
		this.engineCC = engineCC;
		this.color = color;
		this.onwer = onwer;
		this.fuelType = fuelType;
	}
	

	/*
		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}
	
		public void setEngineNo(String engineNo) {
			this.engineNo = engineNo;
		}
	
		public void setModel(String model) {
			this.model = model;
		}
	
		public void setCompany(String company) {
			this.company = company;
		}
	
		public void setType(String type) {
			this.type = type;
		}
	
		public void setEngineCC(int engineCC) {
			this.engineCC = engineCC;
		}
	
		public void setColor(String color) {
			this.color = color;
		}
	
		public void setOnwer(String onwer) {
			this.onwer = onwer;
		}
	
		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}
	*/
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engineNo=" + engineNo + ", model=" + model + ", company=" + company
				+ ", type=" + type + ", engineCC=" + engineCC + ", color=" + color + ", onwer=" + onwer + ", fuelType="
				+ fuelType + "]";
	}
	
	

}
