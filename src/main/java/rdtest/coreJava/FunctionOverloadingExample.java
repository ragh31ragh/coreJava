package rdtest.coreJava;

public class FunctionOverloadingExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloadingExample f = new FunctionOverloadingExample();
		f.getData(3);
		f.getData("rd");
	}
	
	public void getData(int i) {
		System.out.println(i);
		//steps
	}
	
	public void getData(String a ) {
		System.out.println(a);
	}

}
