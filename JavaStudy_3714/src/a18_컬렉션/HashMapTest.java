package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "김재일");
		hashMap.put("나", "김재이");
		hashMap.put("다", "김재삼");
		hashMap.put("라", "김재사");
		hashMap.put("마", "김재오");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("김재사"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "김준육"));
		System.out.println(hashMap);
	}

}
