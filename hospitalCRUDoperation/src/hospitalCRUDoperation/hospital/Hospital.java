package hospitalCRUDoperation.hospital;

public class Hospital {
	// declaring and initilizing the array
	public int[] arr = new int[2];
	public PatientsDTO[] patients = new PatientsDTO[2];
	int index;

	public void addPatients(PatientsDTO patientsDTO) {
		patients[index++] = patientsDTO;
	}

	public void getPatientDetails() {
		for (int i = 0; i < patients.length; i++) {
			System.out.println(
					patients[i].getPatientID() + "\t" + patients[i].getName() + "\t" + patients[i].getAddress());
		}
	}

	public void getPatientsByName(String name1) {
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getName().equals(name1)) {
				System.out.println(patients[i].getName() + "" + patients[i].getPatientID() + "" + patients[i].getAddress());
			}
		}
	}

	public boolean updatepatientAddressByPatientName(String name, String address) {
		boolean check = false;
		for (PatientsDTO patientsDTO : patients) {
			if (patientsDTO.getName().equals(name)) {
				patientsDTO.setAddress(address);
				check = true;
				System.out.println("succesfully updated the address");
			} else {
				System.out.println("no patients found");
			}
		}
		return check;
	}
}