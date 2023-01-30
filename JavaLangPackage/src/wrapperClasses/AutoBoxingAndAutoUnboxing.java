package wrapperClasses;

public class AutoBoxingAndAutoUnboxing {
	
	public static void main(String[] args) {
		
		// AutoBoxing
		int a=100;
		System.out.println("Primitive:"+a);
		Integer i=a;	//Integer.valueOf(a);
		System.out.println("Wrapper Object:"+i);
		
		//AutoUnboxing
		
		int b=20;	
		Integer l=Integer.valueOf(b);
		System.out.println("Wrapper Object:"+l);
		
		int c=l;	//l.intValue();
		System.out.println("Primitive:"+c);
	}

}
