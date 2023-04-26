package oppsPracties;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

	String hospitalName;
	
	public Hospital(String hospital) {
		super();
		this.hospitalName = hospital;
	}

	ArrayList<PatientsDeatails> listAddPateint = new ArrayList<>();

	void addPateintDeatials() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the patient Id");
		int patientId = sc.nextInt();

		System.out.println("Enter the patient Name");
		String patientName = sc.next();

		System.out.println("Enter the patient Department");
		String patientDepartment = sc.next();

		System.out.println("Enter the patient Address");
		String patientAddress = sc.next();

		System.out.println("Enter the patient Desase");
		String patientDeseas = sc.next();

		listAddPateint.add(new PatientsDeatails(patientId, patientName, patientDepartment, patientAddress, patientDeseas));

	}

	void display() {
		for (PatientsDeatails d : listAddPateint) {
			System.out.println(d.getPatientId());
			System.out.println(d.getPatientName());
			System.out.println(d.getPatientDepartment());
			System.out.println(d.getPatientAddress());
			System.out.println(d.getPatientDeseas());
		}
	}

}
