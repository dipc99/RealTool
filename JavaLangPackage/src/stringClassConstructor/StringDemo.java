package stringClassConstructor;

public class StringDemo {
	public static void main(String[] args) {
		
		String s = new String();
		System.out.println(s);

		String s1 = new String("Dipali");
		System.out.println(s1);

		StringBuffer sb=new StringBuffer("Chaudhari");
		System.out.println(sb);
		
		String s2=new String(sb);
		System.out.println(s2);
		
		char ch[]= {'a','b','c','d'};
		System.out.println(ch);
		
		String s3=new String(ch);
		System.out.println(s3);
	}

}
