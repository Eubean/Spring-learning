package com.iamycx.aspectj.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Aspectע�⽫�����ʶΪһ������
@Aspect
public class PreGreetingAspect{
	@Before("execution(* greetTo(..))") //�е����ǿ����
	public void beforeGreeting(){
		System.out.println("How are you");
	}
}