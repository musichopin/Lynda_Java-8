package org.example.java8;

public class UseRunnable {

	public static void main(String[] args) {
		
//		Runnable r1 = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Running Thread 1");
//			}
//		};
//		
//		Runnable r2 = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Running Thread 2");
//			}
//		};
		
//		we use lambda expressions to replace inner/anonymous classes above
		Runnable r1 = () -> {
			try {
				Thread.sleep(1000); 
				// uyuma zamanýný belirtmeseydik threadler ayný anda yürüyeceðinden 
				// dolayý hangi threadin önce baþlayacaðý belli olmayacaktý
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Running Thread 1");
		};
		Runnable r2 = () -> System.out.println("Running Thread 2");
		// using lambda expressions in this context doesn't give us
		// any performance benefit, but it is a simpler way of coding
		
		new Thread(r1).start();
//		alt:
//		Thread x = new Thread(r1);
//		x.start();
		new Thread(r2).start();
		
	}

}
/*
Running Thread 2
Running Thread 1 
 */
