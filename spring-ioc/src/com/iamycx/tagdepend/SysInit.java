package com.iamycx.tagdepend;

public class SysInit {
   public SysInit(){  
	   System.out.println("SysInit");
	   //ģ������ݿ��м���ϵͳ������Ϣ
	   SystemSettings.REFRESH_CYCLE = 100;
	   SystemSettings.SESSION_TIMEOUT = 10;
   }
}
