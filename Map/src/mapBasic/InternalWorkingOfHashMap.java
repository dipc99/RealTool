package mapBasic;

import java.util.HashMap;

public class InternalWorkingOfHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(1, "dipali");
		hm.put(2, "dip");
		hm.put(3, "jay");
		System.out.println(hm.put(1, "chaudhari"));
		hm.put(4, "ash");
		System.out.println(hm);
		
		String value = hm.get(1);
		System.out.println(value);
		String value1 = hm.get(4);
		System.out.println(value1);
	}

}
