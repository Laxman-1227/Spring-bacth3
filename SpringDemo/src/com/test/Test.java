package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.test.bean.Employee;

public class Test {

	public static void main(String[] args) {
		
//		Employee empObj = new Employee("Alex", 101, 10000);		
//		empObj.display();
		
		
		//Spring
		
		Resource resource = new ClassPathResource("applicationConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee empObj2 = (Employee) factory.getBean("emp");
		
		System.out.println(empObj2);
		
//		User user = (User)factory.getBean("user");
//		System.out.println(user);
		
		
//		Address add = (Address)factory.getBean("address");
//		System.out.println(add);
//		
		

	}

}
