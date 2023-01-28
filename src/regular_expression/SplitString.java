package regular_expression;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString{
	 static int count =0;
	public static void main(String[] args) {
		
		// Method 1 String Array
		String str2 = "Pankaj sir Academy"; // split method counts the space at the beginning of each word
		String[] split = str2.trim().split(" "); // inside double quoteit can be space /anything.
		for(String x: split) {
			System.out.println(x);
			
		}System.out.println(count);
		
		
		// Method 2 String Tokenizer
		StringTokenizer str = new StringTokenizer("Pankaj Sir Academy", "-");// hasMoreTokens() search for words present in string
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			
		}System.out.println(count);
		
	
	}

}
