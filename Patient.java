/**
 * Stores the information for a given patient in the system
 * @author Cole
 *
 */
import java.util.*;
public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies = new ArrayList<>();
	
	/**
	 * Sets the parameters for the patients data
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Adds an allergy to the list for the patients
	 * @param allergy
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	
	/**
	 * Displays the data for all the patients
	 */
	@Override
	public String toString() {
		String allergyData = allergies.size() > 0?("  Allergies: " + allergies):"";
		return "Patient " + (id+1) + ": " + firstName + " " + lastName + "\n" + allergyData + "\n";
	}
}
