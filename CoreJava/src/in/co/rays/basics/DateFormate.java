package in.co.rays.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
 public static void main(String[] args) {
	 Date d= new Date();
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	String s= sdf.format(d);
			System.out.println(s);

}
}
