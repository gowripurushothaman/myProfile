package com.prof;

public class KowsalyaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstant.FIRST_NAME+"Kowsalya");
		System.out.println(ProfileConstant.LAST_NAME+"Chinraj");
		System.out.println("Age=21");
		
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("watching movie");
		
	}
	

}
