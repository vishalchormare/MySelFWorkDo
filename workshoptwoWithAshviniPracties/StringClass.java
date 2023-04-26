package workshoptwoWithAshviniPracties;

import java.util.Scanner;

public class StringClass {

	/*
	 * -able to write logic for check occuerence of character in string -unable to
	 * write logic for handle cases in string -unable to make changes to code -need
	 * to get clear with constructor -needs to learn about string class method
	 * 
	 * -needs to follow indentation -needs to learn static variable -able to write
	 * logic for occurance of char in string -communication is good -learnabilty is
	 * good -needs to practice while loop
	 * 
	 * -explanation is good -needs to learn about abstract class -needs to learn
	 * object class concept -unable to create array of object -unable to pass
	 * arguments to method -unable to call method -unable to write logic for print
	 * string array in method -unable to write logic to print string in given format
	 * 
	 * 
	 * 
	 */

	void occuerenceOfString(String strName) {

		char inputcharray[] = { 'A', 'I', 'o', 'u', 'S' };

		for (int i = 0; i < inputcharray.length; i++) {
			char chtemp = inputcharray[i];
			int count = 0;
			for (int j = 0; j < strName.length(); j++) {
				if (chtemp == strName.toUpperCase().charAt(j) || chtemp == strName.toLowerCase().charAt(j)) {
					count++;

				}
			}

			System.out.println("The Char Element is " + " " + chtemp + " " + "Ocuuence" + " " + count);
		}

	}

	/*
	 * 1)char charAt(int index) It returns char value for the particular index 2)int
	 * lenght() It returns string length 3)Uppear Cases 4)Lower Cases 5)Strin trim
	 * 6)String substring(int beginindex) 7)String substring(int beginidex
	 * inendIndex) 8)equal 9)toString 10)
	 */
	
	/*
	 * Constructor block smilar like method  is class name same
	 * consturcto return type nahi krta even void 
	 * constructor modifer public private default protected acces krtha hai static or final ko nahi 
	 * constructo use for insiliaze object
	 * constructor are three type default constructor without argument userdefine with argument and userdefine withprametere
	 *
	 * 
	 * 
	 */
	

	public static void main(String[] args) {
		/*
		 * write logic for check occuerence of character in string
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name");
		String name;
		name = sc.next();
		StringClass stringClass = new StringClass();
		stringClass.occuerenceOfString(name);
	}
}
