package com.te.lambdaexpression;

public class Sample2 {
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
	thread.start();
	Runnable run1=()->{
		for (int i = 0; i < 5; i++) {
			System.out.println("i am from thread two:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
};
	Thread thread2 = new Thread(run1);
	thread2.start();

}
}
