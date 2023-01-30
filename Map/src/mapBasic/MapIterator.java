package mapBasic;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterator {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		System.out.println(map.put(11, "Dipali"));
		System.out.println(map.put(22, "dip"));
		System.out.println(map.put(33, "jay"));
		System.out.println(map);

//		Set<Entry<Integer,String>> entrySet = map.entrySet();
//		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
//		while(iterator.hasNext()) {
//			Entry<Integer, String> entry = iterator.next();
//			System.out.println(entry);
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		
			
			Set<Integer> keySet = map.keySet();
			
			Iterator<Integer> iterator = keySet.iterator();
			
			while(iterator.hasNext()) {
				Integer key = iterator.next();
				String value = map.get(key);
				System.out.println(key+" "+value);
			}
		}
	}


