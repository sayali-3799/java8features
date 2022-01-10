package com.te.lambdaexpression;

public class MyClass {
	public int addition(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Test test = new Test() {
			public void message() {
				System.out.println("Namaste Guys...");
			}
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		

	

			


//				Test test=new MyClass()::addition;
//				 System.out.println(test.add(10,20));
//				
			
		
		//test.message();
	//	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		//Test test1 = ()->{
		//	System.out.println("Vanakum Guys");
		//};
		
		//int b=test.message(10,20);
		//System.out.println(b);
		
	  

	
