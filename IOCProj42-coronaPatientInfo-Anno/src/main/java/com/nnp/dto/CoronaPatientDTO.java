package com.nnp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CoronaPatientDTO implements Serializable{
	private Integer serialNo;
	private String pName;
	private String loc;
	private Integer pAge;
	private String status;
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Integer getpAge() {
		return pAge;
	}
	public void setpAge(Integer pAge) {
		this.pAge = pAge;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
