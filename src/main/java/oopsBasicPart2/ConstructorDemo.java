package oopsBasicPart2;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println(" I am inside constructor class");
	}
	public void getData() {
		System.out.println(" This is get Data method");
	}
	
	public ConstructorDemo(int a,int b) {
		System.out.println(" integers in parameterized constructor");
		System.out.println(a+b);
	}
	
	public ConstructorDemo(String s) {
		System.out.println(" Strings in parameterized constructor");
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		cd.getData();
		ConstructorDemo cdi = new ConstructorDemo(4,5);
		cdi.getData();
		ConstructorDemo cds = new ConstructorDemo ("string");
		cds.getData();
		
	}
	
	

}
