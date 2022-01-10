package com.te.lambdaexpression;

public class MyClass1 {

	public static void main(String[] args) {
		Runnable run=()->{
			for(int i=0;i<=4;i++) {
				System.out.println("child thread"+i);
			}
		};
		
		Thread thread = new Thread(run);
		thread.run();
	}

}

