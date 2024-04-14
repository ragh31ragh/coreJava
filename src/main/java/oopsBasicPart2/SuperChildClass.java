package oopsBasicPart2;

public class SuperChildClass extends SuperParentClass {
	String name= "QA CLick academy";
	
	public SuperChildClass() {
		super();
		System.out.println("Child classCONSTRUCTOR ");
		//super();
	}
	
	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void sameMethod() {
		System.out.println("Child class method same method ");
		super.sameMethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildClass sca = new SuperChildClass();
		sca.getData();
		sca.sameMethod();
		

	}

}
