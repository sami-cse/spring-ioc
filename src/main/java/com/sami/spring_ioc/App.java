package com.sami.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sami.spring_ioc.pojo.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
		Student student = (Student) applicationContext.getBean("student");

		System.out.println(student);

		((FileSystemXmlApplicationContext) applicationContext).close();
	}
}
