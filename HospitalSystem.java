/**
 * 
 * @author Cole
 *
 */
import java.util.*;
public class HospitalSystem {
	private ArrayList<Patient> patients = new ArrayList<>();
	private static HospitalSystem hospitalSystem;
	
	/**
	 * returns the instance of the class
	 */
	private HospitalSystem() {}
	
	/**
	 * returns an instance of the class
	 * @return
	 */
	public static HospitalSystem getInstance() {
		if(hospitalSystem == null) {
			hospitalSystem = new HospitalSystem();
		}
		return hospitalSystem;
	}
	
	/**
	 * Will create a new patient with the given first and last name
	   It then returns the id of the patient, which is it's numerical place in the ArrayList
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public int addPatient(String firstName, String lastName) {
		int id = patients.size();
		Patient patient = new Patient(id, firstName, lastName);
		patients.add(patient);
		return id;
	}
	
	/**
	 * Will return the patient which corresponds with the given id
	 * @param id
	 * @return
	 */
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	
	/**
	 * Will add the allergy to the patient specified by the id
	 * @param id
	 * @param allergy
	 */
	public void addAllergy(int id, String allergy) {
		Patient patient = patients.get(id);
		patient.addAllergy(allergy);
	}
	
	/**
	 * Returns a string representation of all the patients data. Utilizes each patients toString().
	 * @return
	 */
	public String getAllPatientsData() {
		StringBuilder str=new StringBuilder();
	       for(Patient patient:patients)
	       {
	           str.append(patient.toString().replace("[", "").replace("]", "")+"\n");
	       }
	       return str.toString();
		/*String str = "";
		for(Patient patient : patients) {
			str += patient.toString() + "\n";
		}
		return str;*/
	} 
}
