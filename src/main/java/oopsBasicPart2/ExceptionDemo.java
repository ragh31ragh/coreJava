package oopsBasicPart2;



public class ExceptionDemo {
	
	//int b = 7 ;
	//int c = 0 ;
	//int k= b/c ;
	
	//public void getData() {
	//	System.out.println(k);
	//}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExceptionDemo ed = new ExceptionDemo();
		//ed.getData();
		int b = 7 ;
		int c = 0 ;
		try {
			int k= b/c ;
			System.out.println(k);
		}catch (Exception e) {
			System.out.println("identified error ");
		}
		
	}

}
