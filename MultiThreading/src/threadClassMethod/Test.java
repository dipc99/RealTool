package threadClassMethod;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		A a1=new A();
		A a2=new A();
		A a3=new A();
		
		a1.setName("jay");
		a2.setName("Raj");
		a3.setName("dipali");
	
	    a1.start();
	 //   System.out.println(a1.isAlive());		//Print: True (a1 thread is start its in born/ready state so its live)
	   
	    a2.start(); 
	    a2.join();		//all a2 print then print a3 in waiting state)
	    a3.start();
	
	
	//  a1.stop();
   //   System.out.println(a1.isAlive());	//Print: false (a1 thread is stop so its in dead state)
	}

}
