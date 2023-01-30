package stringClassMethod;

public class StringDemo {
	public static void main(String[] args) {
		
		String s = new String("Dipali");
		System.out.println(s);

		// charAt()
		System.out.println(s.charAt(3));
		//System.out.println(s.charAt(6));
		// System.out.println(s.charAt(15));

		// concat()
		s = s.concat("Chaudhari");
		System.out.println(s);

		String s1 = "Jay";
		String s2 = "Jay";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String s3 = "DipaliShri";
		System.out.println(s3.length());

		String s4 = "DipaliChaudhariPune";
		System.out.println(s4.substring(7));
		System.out.println(s4.substring(7, 13));

		String s5 = "Dipali";
		System.out.println(s5.replace('i', 'v'));
		
		String s6="chaudhari";
		System.out.println(s6);
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		String s7="DipaliChaudhari";
		System.out.println(s7.indexOf('a'));
		System.out.println(s7.lastIndexOf('a'));
		
		
		String s8="      Dipali      ";
		System.out.println(s8);
		System.out.println(s8.trim());

	}

}
