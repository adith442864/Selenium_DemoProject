package collectionsFramework;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("dbhost", "tyx.ut.testing.com");
		map.put("dbusername", "testinguser");
		map.put("dbpassword", "welcome123");
		map.put("url", "https://www.fb.com");
		
		System.out.println(map);
		System.out.println(map.get("url"));
		System.out.println(map.get("dbhost"));
		
		//iterate
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key +" ==> " +map.get(key));
		}
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(100, "Test");
		
		

	}

}
