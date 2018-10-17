package com.sami.spring_ioc.pojo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Student {

	@Getter
	@Setter
	private String studentName;

	@Getter
	@Setter
	private Integer age;

	@Getter
	@Setter
	private String university;

	public Student(String studentName, Integer age) {
		this.studentName = studentName;
		this.age = age;
	}

	@Getter
	@Setter
	private Address address;

	@Getter
	@Setter
	private List<Account> accounts;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", age=" + age + ", university=" + university + ", address="
				+ address + ", accounts=" + accounts + "]";
	}

}
