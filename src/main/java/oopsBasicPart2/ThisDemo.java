package oopsBasicPart2;

public class ThisDemo {
	int a = 2 ;
	public void getData() {
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
		int b = a + this.a ;
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisDemo t = new ThisDemo();
		t.getData();

	}

}
