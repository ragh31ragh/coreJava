package oopsBasicPart2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		//d.toString()
		System.out.println("Printing in String format");
		System.out.println(d.toString());
		System.out.println("Printing in String format");
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		//sdf.format(d);
		System.out.println(sdf.format(d));
		
		//dd-MMM-yyyy
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(sdf2.format(d));
		//E, MMM dd yyyy
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("E, MMM dd yyyy");
		System.out.println(sdf3.format(d));

	}

}
