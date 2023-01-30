package objectCreationOfString;

public class ByUsingStringLiteral {
	
	public static void main(String[] args) {
		String s="Dipali";
		System.out.println(s);
	}
			// 1)String literal.
}



/*
String:
=======
String Ids predefined class available in java.lang package.
String is nothing but collection of characters.
we can store alphabets and numbers in String.

Note : Garbage collector is not responsible to access scp(String constant pool) area .
hence garbage collector will destroy only heap area object.


There are two ways to create String Object.

1)String literal.
2)By Using new Keyword.
*/