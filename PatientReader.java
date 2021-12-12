package readingFiles;
import java.io.*;
import java.util.*;

public class PatientReader {
	
	
	//initialize an array list, for storing the patients
    private static ArrayList<Patient> patientsList = new ArrayList<Patient>();
	
	public static void readPatients() throws IOException {
        
		//connect the program with the text file for reading.
		File file = new File("patients.txt");
		Scanner readFile = new Scanner(file);
		
		
		StringTokenizer token = null;
		 
		 //initialize the variables that you will need to instantiate the object (Patient)
		 String fullName="";
		 int age=0; 
		 double weight=0;
		 String illness="";
		
		while(readFile.hasNextLine()) {
			 token  = new StringTokenizer(readFile.nextLine(), ",");
		     
			 //use the information from one line to initialize the variables needed to instatiate the object
			 fullName = token.nextToken();
			 age = Integer.parseInt(token.nextToken()); 
			 weight = Double.parseDouble(token.nextToken());
			 illness = token.nextToken();
			 
			 
			 Patient patient = new Patient( fullName, age,  weight, illness);
			 
			 patientsList.add(patient);
			 
			 //System.out.println(patient.toString());	 
		}
    }
	
	public static void main(String[] args) throws IOException {
		readPatients();
		
		for(Patient patient: patientsList) {
			System.out.println(patient);
		}
	}
}
