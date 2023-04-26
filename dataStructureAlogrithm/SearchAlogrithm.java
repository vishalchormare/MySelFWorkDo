package dataStructureAlogrithm;

import java.util.Scanner;

public class SearchAlogrithm {

	// present in array find the index element
	
	
	/*
	 *  Data strucute is not a programing language it set of alogritm which in user the algorithm
	 *  Data sturcture have type primte data sturcture nor privter data surcuter
	 *
	 *  privmte data structer 
	 *  int 
	 *  float 
	 *  doble 
	 *
	 *non primteve data strucre 
	 *Two type rahethe 
	 *1
	 *Wrapper data type use krethe hai 
	 *
	 */

	void searChAlogorithm(int ar[], int x) {

		int count = 0;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == x) {
				System.out.println("Eelemt is present  in indext postion" + i);
				count++;
			}

		}
		if (count == 0) {
			System.out.println("Number not fond");
		}
	}

	public static void main(String[] args) {

		SearchAlogrithm searchAlogrithm = new SearchAlogrithm();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please find the ");
		int x = sc.nextInt();
		searchAlogrithm.searChAlogorithm(arr, x);

	}

}
