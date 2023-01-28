package regular_expression;

public class Split_using_Regex {
	public static void main(String[] args) {
		try {
		String str = "Pankaj Sir Academy";
		String regex="A+";
		if(str.matches(regex)) {
			System.out.println("valid");
			System.out.println(str);
		}else {
			System.out.println("error");
		}
		}catch (Exception e) {
				e.printStackTrace();
		}
	}
}
