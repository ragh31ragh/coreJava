package oopsBasicPart2;


public class StaticNonStaticDemo {
	
	String name ;//instance 
	String address ;
	static String city = " Bangalore ";//static variables 
	static int i = 0 ;
	//int i = 0 ;
	
	public StaticNonStaticDemo(String name1,String address1 ){
		this.name = name1;
		this.address= address1;
		i++;
		System.out.println(i);
		//this.city = city1;
	}
	
	public void getAddress() {
		System.out.println(address+"-"+city);
	}
	
	public static void getCity() {
		System.out.println("-"+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticNonStaticDemo obj1 = new StaticNonStaticDemo("Bob","Marathalli");
		StaticNonStaticDemo obj2 = new StaticNonStaticDemo("Ram","Jayanagar");
		StaticNonStaticDemo obj3 = new StaticNonStaticDemo("Raj","Hebbal");
		obj1.getAddress();
		obj2.getAddress();
		StaticNonStaticDemo.getCity();
		obj1.getAddress();
		StaticNonStaticDemo.getCity();
		obj3.getAddress();

	}

}
