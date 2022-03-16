package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("김재현");
		strSet.add("김재이");
		strSet.add("김재삼");
		strSet.add("김재사");
		
		System.out.println(strSet);
		strSet.remove("김재삼");
		
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("김재사")) {				
				System.out.println(str);
			}
		}
	}

}
