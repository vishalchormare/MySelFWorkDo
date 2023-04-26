package practiescDoWhileLoop;

import java.util.StringTokenizer;

public class ArrayObject {

	static void arrayofObjectImplimation(StudentC[] obj2) {

		System.out.println("Product Object 1:");
		obj2[0].display();
		System.out.println("Product Object 2:");
		obj2[1].display();
		System.out.println("Product Object 3:");
		obj2[2].display();
		System.out.println("Product Object 4:");
		obj2[3].display();
		System.out.println("Product Object 5:");
		obj2[4].display();
		passValueOfthemethod(obj2);
	}

	static void passValueOfthemethod(StudentC[] boj3) {

		boj3[3].display();

	}

	void paasvoidMethod(StudentC[] obj2) {
		System.out.println("Product Object 1:");
		obj2[0].display();
		System.out.println("Product Object 2:");
		obj2[1].display();
		System.out.println("Product Object 3:");
		obj2[2].display();
		System.out.println("Product Object 4:");
		obj2[3].display();
		System.out.println("Product Object 5:");
		obj2[4].display();
		passMethodVleu(obj2);

	}

	void passMethodVleu(StudentC[] obj4) {
		obj4[4].display();

	}

	void stringArray(String[] str) {

		for (int i = 0; i < str.length; i++) {

			if (i != str.length - 1) {
				System.out.print(str[i] + ",");
			}
			if (i == str.length - 1) {
				System.out.print(str[i] + ".");
			}

		}
	}

	public static void main(String[] args) {

		StudentC[] obj1 = new StudentC[10];
		ArrayObject arrayObject = new ArrayObject();

		obj1[0] = new StudentC(01, "Vishal", "Chormare");

		obj1[1] = new StudentC(02, "Rahul", "Chormare");

		obj1[2] = new StudentC(03, "Rupali", "Chormare");

		obj1[3] = new StudentC(04, "Santoshi", "Chormare");

		obj1[4] = new StudentC(05, "Kabir", "Chormare");

//		arrayofObjectImplimation(obj1);
//		arrayObject.paasvoidMethod(obj1);

		String[] str = { "red", "Yellow", "Green", "Whilte" };

		arrayObject.stringArray(str);
	}

}
