package differantWaystoCreateThread.runnableInterface;

public class Y {

	public static void main(String[] args) throws InterruptedException {
	 
		X x=new X();
		Thread t=new Thread(x);
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("I want to become java deveoper");
			Thread.sleep(1000);
		}
	}
}
