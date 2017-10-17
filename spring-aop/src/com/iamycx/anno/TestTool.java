package com.iamycx.anno;

import java.lang.reflect.Method;

public class TestTool {

	public static void main(String[] args) {
		Class clazz = ForumService.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			NeedTest nt = method.getAnnotation(NeedTest.class);
			if (nt != null) {
				if (nt.value()) {
					System.out.println(method.getName() + "()��Ҫ����");
				} else {
					System.out.println(method.getName() + "()����Ҫ����");
				}
			}
		}
	}
}
