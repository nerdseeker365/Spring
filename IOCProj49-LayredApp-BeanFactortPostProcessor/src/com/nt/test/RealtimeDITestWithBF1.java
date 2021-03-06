package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealtimeDITestWithBF1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		MainController controller=null;
		XmlBeanDefinitionReader reader=null;
		Scanner sc=null;
		String name=null,m1=null,m2=null,m3=null;
		StudentVO vo=null;
		BeanFactoryPostProcessor processor=null;
		//create IOc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get BeanFactoryPostPRocessor class object
		processor=factory.getBean("pphc",BeanFactoryPostProcessor.class);
		//register BeanFactoryPostProcessor
		processor.postProcessBeanFactory(factory);
		//get Controller
		controller= factory.getBean("controller",MainController.class);
		//read inputs from enduser
		sc=new Scanner(System.in);
		System.out.println("Enter sname::");
		name=sc.next();
		System.out.println("Enter m1::");
		m1=sc.next();
		System.out.println("Enter m2::");
		m2=sc.next();
		System.out.println("Enter m3::");
		m3=sc.next();
		//create StudentVO class obj
		vo=new StudentVO();
		vo.setSname(name);
		vo.setM1(m1);vo.setM2(m2); vo.setM3(m3);
		
		//invoking method
		try{
			System.out.println("Result::::"+controller.process(vo));
		}
		catch(Exception e){
			System.out.println("Internal Problem::"+e.getMessage());
		}

	}//main
}//class
