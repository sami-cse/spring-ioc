package com.sami.spring_ioc.pojo;

import lombok.Getter;
import lombok.Setter;

public class Account {

	@Getter
	@Setter
	private String branchName;

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + "]";
	}
}
