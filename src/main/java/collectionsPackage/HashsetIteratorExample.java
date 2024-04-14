package collectionsPackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		System.out.println(hs);
		hs.add("INDIA");
		System.out.println(hs);
		hs.add("He");
		hs.add("She");
		hs.add("Latest");
		hs.add("Amit");


		Iterator<String> i = hs.iterator();
		// i.next();
		// i.next();
		//System.out.println(i.next());
		//System.out.println(i.next());
		while ( i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
