package threadSchedular;

public class Test {
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		
		d1.start();
		d2.start();
		d3.start();
		
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
