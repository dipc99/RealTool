package threadSchedular;

public class Demo extends Thread{
		@Override
		public void run() {
		
			for(int i=0; i<=10;i++) {
				String name = Thread.currentThread().getName();
				System.out.println(name);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
}
