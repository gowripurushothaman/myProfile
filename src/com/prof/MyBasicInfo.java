package com.prof;


public class MyBasicInfo implements IProfile{

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		
			System.out.println(ProfileConstant.FIRST_NAME+"Gowri");
			System.out.println(ProfileConstant.LAST_NAME+"Purushothaman");
			System.out.println("Age=21");
			
		}

	

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("watching tv");
		
	}

	
}
