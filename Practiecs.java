package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practiecs {
	// "^[A-Z][A-Za-z0-9]*$"
	// "^[A-Z][A-Za-z0-9]+$"
	// "^[A-Z][A-Za-z0-9]?$"
	// "^[A-Z][A-Za-z0-9]{2}$"
	// "^[A-Z][A-Za-z0-9]{3,}$"
	// "^[A-Z]{2}[A-Za-z0-9]{3,6}$

	static Pattern pattern = Pattern.compile(("[0-9 a-z][a-z 0-9]*$"));

	public static void main(String[] args) {
		String str1 = "111";
		String str2 = "1aaa";
		String str3 = "aa11";
		String str4 = "bcc";
		String str5 = "1a1aab";
		String str6 = "1abb23a";

		Matcher matcher1 = pattern.matcher(str1);
		Matcher matcher2 = pattern.matcher(str2);
		Matcher matcher3 = pattern.matcher(str3);
		Matcher matcher4 = pattern.matcher(str4);
		Matcher matcher5 = pattern.matcher(str5);
		Matcher matcher6 = pattern.matcher(str6);

		if (matcher1.matches())
			System.out.println("Invalid");
		if (matcher2.matches())
			System.out.println("valid");
		if (matcher3.matches())
			System.out.println("Invalid");
		if (matcher4.matches())
			System.out.println("valid");
		if (matcher5.matches())
			System.out.println("invalid");
		if (matcher6.matches())
			System.out.println("valid");
	}

}
