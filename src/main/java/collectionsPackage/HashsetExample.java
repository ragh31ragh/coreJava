package collectionsPackage;

import java.util.HashSet;

//Hashset ,Treeset , Linked Hashset implements set interface.
//Set Interface does not accept duplicate values.
//There is no guarantee , elements are stored in sequential.- Random order .

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		System.out.println(hs);
		hs.add("INDIA");
		System.out.println(hs);
		hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		

	}

}
