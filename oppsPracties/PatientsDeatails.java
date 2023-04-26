package oppsPracties;

public class PatientsDeatails {
	int patientId;
	String patientName;
	String patientDepartment;
	String patientAddress;
	String patientDeseas;

	public PatientsDeatails(int patientId, String patientName, String patientDepartment, String patientAddress,
			String patientDeseas) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientDepartment = patientDepartment;
		this.patientAddress = patientAddress;
		this.patientDeseas = patientDeseas;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientDepartment() {
		return patientDepartment;
	}

	public void setPatientDepartment(String patientDepartment) {
		this.patientDepartment = patientDepartment;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientDeseas() {
		return patientDeseas;
	}

	public void setPatientDeseas(String patientDeseas) {
		this.patientDeseas = patientDeseas;
	}

	@Override
	public String toString() {
		return "Deatails [patientId=" + patientId + ", patientName=" + patientName + ", patientDepartment="
				+ patientDepartment + ", patientAddress=" + patientAddress + ", patientDeseas=" + patientDeseas
				+ ", getPatientId()=" + getPatientId() + ", getPatientName()=" + getPatientName()
				+ ", getPatientDepartment()=" + getPatientDepartment() + ", getPatientAddress()=" + getPatientAddress()
				+ ", getPatientDeseas()=" + getPatientDeseas() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
