package differantWaystoCreateThread;

public class B {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		A a=new A();
		a.start();
		
		D d=new D();
		d.start();
	
//		public void show() throws InterruptedException {
			for(int i=0;i<5;i++) {
				System.out.println("Batch 6");
				Thread.sleep(1000);
			}
		}
	}


