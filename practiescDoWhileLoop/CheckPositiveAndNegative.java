package practiescDoWhileLoop;

import java.util.Scanner;

public class CheckPositiveAndNegative {

	void chekcPositvieandNegativeNumber(int num) {

		if (num > 0) {
			System.out.println("The Number is Postive" + " " + num);
		} else if (num < 0) {
			System.out.println("The Number is Negative" + " " + num);
		} else {
			System.out.println("The Number is " + " " + num);
		}
	}

	void EvenoddNumber(int num) {
		if (num % 2 == 0) {
			System.out.println("The even number is " + " " + num);
		} else {
			System.out.println("The odd number is " + " " + num);
		}
	}

	void sumofNaturalNumber(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of natural number :" + " " + sum);
	}

	void sumofGivenNumber(int x, int y) {
		int i, sum = 0;
		for (i = x; i <= y; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	void greatesofTwoNumber(int x, int y) {

		if (x < y) {
			System.out.println("The Y is greates Number   " + y);
		} else {
			System.out.println("The X is greates Number   " + x);
		}

	}

	void greatesOfThreeNumber(int x, int y, int z) {

		if (x > y && x > z) {
			System.out.println("The Greaset Number of X  " + x);
		} else if (y > x && y > z) {
			System.out.println("The Greaset Number of Y  " + y);
		} else {
			System.out.println("The Greaset Number of Z" + z);
		}
	}

	void leapYearOrNot(int leapYear) {
		if (leapYear % 4 == 00 || leapYear % 100 == 00 || leapYear % 400 == 00) {
			System.out.println("Leap Year" + leapYear);
		} else {
			System.out.println("Not Leap year" + leapYear);
		}
	}

	void primeNumber(int primeNum) {

		int count = 0;
		int i, j = 0;
		for (i = 1; i <= primeNum; i++) {

			for (j = 2; j <= i; j++) {
				if (i % j == 0) {

					count++;
					break;
				}
			}
			// Mutilple value pritn
			if (i == j) {

				System.out.println("The  Prime Number " + j);
			} else {
				System.out.println("The not prime number " + i);
			}
		}

		// single value print
		if (count > 0) {

			System.out.println("The not Prime Number " + primeNum);
		} else {
			System.out.println("The  prime number " + i);
		}

	}

	void givenPrimeNumber(int lower, int higer) {
		int i, j;
		for (i = lower; i <= higer; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {

					break;
				}
			}

			if (i == j) {
				System.out.println(j);
			}
		}

	}

	void sumOfDigitNumber(int num) {

		int temp1 = 0;
		while (num != 0) {
			temp1 = temp1 + num % 10;
			num = num / 10;
		}
		System.out.println(temp1);

		for (int i = 0; i <= num; i++) {
			temp1 = temp1 + num % 10;
			num = num / 10;
		}
		System.out.println(temp1);
	}

	void revireseNumber(int num, String str) {
		int reves = 0;
		int rem = 0;
		for (; num != 0; num = num / 10) {
			rem = num % 10;
			reves = reves * 10 + rem;

		}
		System.out.println(reves);

		while (num != 0) {
			rem = num % 10;
			reves = reves * 10 + rem;
			num /= 10;
		}
		;
		System.out.println(reves);

		for (int i = str.length() - 1; i >= 0; i--) {
			char temp = str.charAt(i);
			System.out.print(temp);
		}
	}

	void palindoreNumber(int num, String str) {

		int revers = 0;
		int reverss = 0;
		int rem = 0;

//		for (; num != 0; num = num / 10) {
//			rem = num % 10;
//			reverss = reverss * 10 + rem;
//		}
//		System.out.println(reverss);

		int tempnum = num;
		while (num != 0) {
			rem = num % 10;
			revers = revers * 10 + rem;
			num = num / 10;
		}
		System.out.println(revers);

		if (tempnum == revers) {
			System.out.println("Palidorem" + " " + tempnum);
		} else {
			System.out.println("not Palidorem" + " " + tempnum);
		}

		int strLenght = str.length();

		int i = 0;
		char chtemp = 0;
		while (strLenght > 0) {
			chtemp = str.charAt(strLenght - 1);
			strLenght--;
			System.out.print(chtemp);
		}

		if (str.charAt(i) == chtemp) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}

	}

	void amsrongNumber(int num) {

		int temp1 = num;
		int length = 0;

		while (temp1 != 0) {
			length = length + 1;
			temp1 = temp1 / 10;
		}

		int temp2 = num;
		int arm = 0;
		int rem = 0;

		while (temp2 != 0) {
			int mul = 1;
			rem = temp2 % 10;
			for (int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			temp2 = temp2 / 10;
		}

		if (arm == num) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	void givenRangeAmstrongNumber(int low, int high) {

		for (int i = low; i <= high; i++) {

			int sum = 0, temp = 0, digit, len;
			len = getOrder(i);
			temp = i;

			while (temp != 0) {
				// extract digit
				digit = temp % 10;

				// add power to sum
				sum = sum + (int) Math.pow(digit, len);
				temp /= 10;
			}
			;

			if (sum == i)
				System.out.print(i + " ");

		}
	}

	int getOrder(int i) {
		int len = 0;
		while (i != 0) {
			len++;
			i = i / 10;
		}
		return len;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cheacking the postive or neagative :");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
//		sc.close();
//		int num3 = sc.nextInt();
//		String str = sc.next();

		CheckPositiveAndNegative che = new CheckPositiveAndNegative();
//		che.chekcPositvieandNegativeNumber(num);
//		che.chekcPositvieandNegativeNumber(num);
//		che.sumofNaturalNumber(num);
//		che.sumofGivenNumber(num, num2);
//		che.greatesofTwoNumber(num, num2);
//		che.greatesOfThreeNumber(num, num2, num3);
//		che.chekcPositvieandNegativeNumber(num);
//		che.primeNumber(num);
//		che.givenPrimeNumber(num, num2);
//		che.sumOfDigitNumber(num);
//		che.revireseNumber(num, str);
//		che.palindoreNumber(num, str);
//		che.amsrongNumber(num);
		che.givenRangeAmstrongNumber(num, num2);
	}
}
