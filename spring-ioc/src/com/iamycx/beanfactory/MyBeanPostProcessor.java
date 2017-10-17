package com.iamycx.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.iamycx.Car;

public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {		
		if(beanName.equals("car")){
			Car car = (Car)bean;
			if(car.getMaxSpeed() >= 200){
				System.out.println("����MyBeanPostProcessor.postProcessAfterInitialization()����maxSpeed����Ϊ200��");
				car.setMaxSpeed(200);
			}
		}
		return bean;

	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {		
		if(beanName.equals("car")){
			Car car = (Car)bean;
			if(car.getColor() == null){
				System.out.println("����MyBeanPostProcessor.postProcessBeforeInitialization()��colorΪ�գ�����ΪĬ�Ϻ�ɫ��");
				car.setColor("��ɫ");
			}
		}
		return bean;
	}
}
