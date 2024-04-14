package collectionsPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Zero");
		hm.put(2, "java");
		hm.put(6, "test");
		hm.put(3, "rahul");
		hm.put(31, "Zdfa");
		System.out.println(hm.get(3));
		Set s =hm.entrySet();
		Iterator i =s.iterator();
		
		//Set<Entry<Integer, String>>  sm = hm.entrySet();
		//Iterator<Entry<Integer, String>> it = sm.iterator();
		while (i.hasNext()) {
			Map.Entry mp = (Map.Entry) i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			//System.out.println(it.next());
			
		}
		
	}

}
