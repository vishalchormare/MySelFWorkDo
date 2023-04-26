package oppsPracties;

import java.util.Scanner;

public class MultipleHospitalMain {

//	Hospital hospital = new Hospital();
//	Hospital hospital1 = new Hospital();
//	

	public static void main(String[] args) {

		MultipleHospitalMain addHospital = new MultipleHospitalMain();
		addHospital.actionall();

	}

	void actionall() {

		Hospital[] hospitalArray = new Hospital[2];
		hospitalArray[0] = new Hospital("Shjeevan");
		hospitalArray[1] = new Hospital("Medicity");

		int options = 0;
		while (options == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Secect Hospital Opetin /n 0) Sahajeevan 1) Medicity");
			int hospitalOption = sc.nextInt();

			System.out
					.println("Select options for /n 1)Add Pateints 2)DisplayPatients 3)Show All Hospital and pateint");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				hospitalArray[hospitalOption].addPateintDeatials();
				break;

			case 2:
				hospitalArray[hospitalOption].display();
				break;

			case 3:
				for (int i = 0; i < hospitalArray.length; i++) {
					System.out.println(hospitalArray[i].hospitalName);
					hospitalArray[i].display();
					System.out.println();
				}
				break;
			}
		}

	}

}
