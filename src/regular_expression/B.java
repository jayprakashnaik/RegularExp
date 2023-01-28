package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		
		System.out.println("Enter Mobile number");
		Scanner scan = new Scanner(System.in);
		Long number = scan.nextLong(); // wrapper Class 
		String str = number.toString();
		Pattern p = Pattern.compile("[^6-9][0-9]{9}");
		Matcher m = p.matcher(str);
		int count =0;
		
		while(m.find()) {
			count++;
			System.out.println(count);
		}
		if(count!=0) {
			System.out.println("error");
		}
		if(str.length()==10 ){
			System.out.println("Input Accepted");
		}else {
			System.out.println("Invalid");
		}
	
	}
}
