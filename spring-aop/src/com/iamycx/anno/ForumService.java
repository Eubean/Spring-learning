package com.iamycx.anno;

public class ForumService {
    @NeedTest(value=true)
	public void deleteForum(int forumId){
		System.out.println("ɾ����̳ģ�飺"+forumId);
	}
    /**
     * 
     * @param topicId
     */
    @NeedTest(value=false)
    public void deleteTopic(int topicId){
		System.out.println("ɾ����̳���⣺"+topicId);
	}	
}