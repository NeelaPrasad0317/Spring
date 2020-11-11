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

}
