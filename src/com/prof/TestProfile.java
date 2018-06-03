package com.prof;

public class TestProfile {
public static void printprofile(IProfile profile) {
	profile.myBasicInfo();
	profile.myHobbies();
}
public static void main(String[] args) {
	IProfile myprofile;
	IProfile myprofile1;
	
	myprofile=new MyBasicInfo();
	myprofile1=new KowsalyaProfile();
	printprofile(myprofile);
	printprofile(myprofile1);
	
}
}
