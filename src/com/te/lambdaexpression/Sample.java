package com.te.lambdaexpression;

public class Sample {
	public static void main(String[] args) {
		Runnable run=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(run);
		Thread thread1 = new Thread(run);
		thread.start();
		thread1.start();
		
	}

}
