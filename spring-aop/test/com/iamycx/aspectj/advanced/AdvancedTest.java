package com.iamycx.aspectj.advanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iamycx.aspectj.example.Waiter;

public class AdvancedTest {
	public static void main(String[] args) {
		String configPath = "com/iamycx/aspectj/advanced/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
//		naiveWaiter.greetTo("John");
//		naiveWaiter.serveTo("John");
//		naughtyWaiter.greetTo("Tom");
//		naughtyWaiter.serveTo("Tom");
		
        //--ͨ��joinPoint�ӿڷ������ӵ���������Ϣ
//		naiveWaiter.greetTo("John");
		
		//--�����ӵ����
//		((NaiveWaiter)naiveWaiter).smile("John",2);
		
		//--�󶨴������
		naiveWaiter.greetTo("John");
		
		//--����ע��
//		((NaiveWaiter)naiveWaiter).greetTo("John");

		//�󶨷���ֵ
//		SmartSeller seller = (SmartSeller) ctx.getBean("seller");
//		seller.sell("Beer","John");	
		
		//���쳣
//		SmartSeller seller = (SmartSeller) ctx.getBean("seller");
//		seller.checkBill(2);
//		seller.checkBill(1);
	}
}
