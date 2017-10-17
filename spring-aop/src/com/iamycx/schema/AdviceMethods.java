package com.iamycx.schema;

import org.aspectj.lang.ProceedingJoinPoint;


public class AdviceMethods {
	public void preGreeting(String name) {
		System.out.println("--how are you!--");
		System.out.println(name);
	}

    //������ǿ��Ӧ����
	public void afterReturning(int retVal){
	   System.out.println("----afterReturning()----");
	   System.out.println("returnValue:"+retVal);
	   System.out.println("----afterReturning()----");
	}

    //������ǿ��Ӧ����
	public void aroundMethod(ProceedingJoinPoint pjp){
	   System.out.println("----aroundMethod()----");
	   System.out.println("args[0]:"+pjp.getArgs()[0]);
	   System.out.println("----aroundMethod()----");
	}

    //�׳��쳣��ǿ
	public void afterThrowingMethod(IllegalArgumentException iae){
	   System.out.println("----afterThrowingMethod()----");
	   System.out.println("exception msg:"+iae.getMessage());
	   System.out.println("----afterThrowingMethod()----");
	}

    //final��ǿ
	public void afterMethod(){
	   System.out.println("----afterMethod()----");
	}
	

	
      //------------�����ӵ����----------//
	public void bindParams(int num,String name){
	   System.out.println("----bindParams()----");
	   System.out.println("name:"+name);
	   System.out.println("num:"+num);
	   System.out.println("----bindParams()----");
	}
}
