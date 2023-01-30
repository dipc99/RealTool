package stringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		
	
	StringBuffer sb=new StringBuffer();
//	StringBuffer sb=new StringBuffer(100);
	
	System.out.println(sb.capacity());
	sb.append("abcdefghijklmnfg");
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.append("h");
    System.out.println(sb.capacity());
    System.out.println(sb.length());
}
}

/*
3)StringBffer sb=new StringBuffer(String s);

creates an equivalent StringBuffer Object with capaity=sb.lengh

()+16.

Example
public class StringBufferDemo {

public static void main(String[] args) {

	String s = new String("Dipali");
	System.out.println(s);

	StringBuffer sb = new StringBuffer(s);
	System.out.println(sb);
	System.out.println(sb.capacity());

}
*/