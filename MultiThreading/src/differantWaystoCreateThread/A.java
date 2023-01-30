package differantWaystoCreateThread;

public class A extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Welcome to BikkadIT");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
	
	
	
	
	
	
	
	
	
//	public void fun() throws InterruptedException {
//		for(int i=0;i<5;i++) {
//			System.out.println("Welcome to BikkadIT");
//		
//		Thread.sleep(1000);
//		}
//	}

}
