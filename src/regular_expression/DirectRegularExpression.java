package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DirectRegularExpression {
		
	public static void main(String[] args) {
	System.out.println("Enter number");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	String regex="[0-9]{9}[6-9]";
	if(str.matches(regex)) {
		System.out.println("A valid number");
	
	}else {
		System.out.println("Invalid");
	}
}
}