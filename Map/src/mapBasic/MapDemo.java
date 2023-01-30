package mapBasic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(111, "dip");					//1) Object put(Object key,Object value);
		map.put(222, "jay");
		map.put(333, "swa");
		map.put(111, "dipali");
		System.out.println(map);
		
		Map<Integer, String> map1=new HashMap<>();
		map1.put(444, "dishu");
		map1.put(555, "raj");
		map1.put(666, "chirag");
		map1.putAll(map);						//2) void putAll(Map m);
		System.out.println(map1);
		
		System.out.println(map1.get(555));		//3)Object get(Object key);
		System.out.println(map1.get(666));
		
		System.out.println(map.remove(111));	//4)Object remove(Object key);
		System.out.println(map);
		
		System.out.println(map.containsKey(222));	//5)boolean containsKey(Object key);
		System.out.println(map.containsKey(999));
		System.out.println(map);
		
		System.out.println(map.containsValue("bhushan"));	//6)boolean containsValue(Object value);
		System.out.println(map.containsValue("swa"));

		System.out.println(map.isEmpty());			//7)boolean isEmplty();
	
//		map.clear();					//8)void clear();
		System.out.println(map);
	
		Set<Integer> keySet=map.keySet();		//9)Set KeySet();
		System.out.println(keySet);
	
		Collection<String> values=map.values();		//10)Collection values();
		System.out.println(values);
	
		Set<Entry<Integer,String>> entrySet = map.entrySet();		//11)Set EntrySet();
		System.out.println(entrySet);
	
	}
}
