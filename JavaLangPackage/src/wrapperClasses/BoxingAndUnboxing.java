package wrapperClasses;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		int a=10;
		System.out.println("Primitive Data Type: "+a);
		
		// Boxing
		Integer i=new Integer(a);		//First way for Declare to Wrapper Object
		System.out.println("Wrapper Object:"+i);
		
		Integer i1=Integer.valueOf(a);	//Second Way for Declare to Wrapper Object 
		System.out.println("Wrapper Object:"+i1);
		
		// Unboxing
		
		int b=20;
		Integer l=new Integer(b);
		System.out.println("Wrapper:"+l);
		
		int l1=l.intValue();	//Create new Variable l1
		System.out.println("Primitive :"+l1);
	}
}

/*
Boxing :  It is process of converting primitive dataType into wrapper object by programmer is called as boxing.


Unboxing:  It is process of converting Wrapper Object into primitive DataType by programmer is called as Unboxing.
*/