package com.iamycx;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean,
		DisposableBean {
	private String brand;
	private String color;
	private int maxSpeed;
	private String name;
	private BeanFactory beanFactory;
	private String beanName;

	public Car() {
		System.out.println("����Car()���캯����");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("����setBrand()�������ԡ�");
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "brand:" + brand + "/color:" + color + "/maxSpeed:" + maxSpeed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void introduce() {
		System.out.println("introduce:" + this.toString());
	}

	// BeanFactoryAware�ӿڷ���
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("����BeanFactoryAware.setBeanFactory()��");
		this.beanFactory = beanFactory;
	}

	// BeanNameAware�ӿڷ���
	public void setBeanName(String beanName) {
		System.out.println("����BeanNameAware.setBeanName()��");
		this.beanName = beanName;
	}

	// InitializingBean�ӿڷ���
	public void afterPropertiesSet() throws Exception {
		System.out.println("����InitializingBean.afterPropertiesSet()��");
	}

	// DisposableBean�ӿڷ���
	public void destroy() throws Exception {
		System.out.println("����DisposableBean.destory()��");
	}

	public void myInit() {
		System.out.println("����myInit()����maxSpeed����Ϊ240��");
		this.maxSpeed = 240;
	}

	public void myDestory() {
		System.out.println("����myDestroy()��");
	}

}
