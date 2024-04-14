package collectionsPackage;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("tesing");
		a.add("java");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.contains("java"));
		System.out.println(a.contains("dd"));
		
		
	}

}
