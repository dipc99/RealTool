package differantWaystoCreateThread;

public class D extends Thread {
	@Override
	public void run() {

		for(int i=0;i<5;i++) {
			System.out.println("MultiThread for demo");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
