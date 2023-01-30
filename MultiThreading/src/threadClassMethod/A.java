package threadClassMethod;

public class A extends Thread{
 
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0;i<=2;i++) {
			System.out.println(name);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
