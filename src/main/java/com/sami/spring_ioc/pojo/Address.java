package com.sami.spring_ioc.pojo;

import lombok.Getter;
import lombok.Setter;

public class Address {

	@Getter
	@Setter
	private String division;

	@Getter
	@Setter
	private String district;

	public Address(String division, String district) {
		this.division = division;
		this.district = district;
	}

	@Override
	public String toString() {
		return "Address [division=" + division + ", district=" + district + "]";
	}

	
}
