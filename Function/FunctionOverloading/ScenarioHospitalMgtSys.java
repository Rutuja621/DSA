/*
1.	Hospital Management System
In a hospital management application, you need to create an addPatient() method. Sometimes the receptionist enters only the patient's name and age, while in other cases they also enter address, phone number, and insurance details. How would you use method overloading to design the addPatient() functionality?
Scenario:
A hospital receptionist may have different amounts of information when registering a patient.
Case 1: The patient provides **name, age, address, and phone number**.
Case 2: The patient is admitted with complete details such as **name, age, address, phone number, and insurance information, min advance amount
*/

public class ScenarioHospitalMgtSys{
	//Case 1: The patient provides **name, age, address, and phone number**.
	public void addPatient(String name,int age,String address,String PhnNo){
		System.out.println("Enter Registred PatientDetails");
		System.out.println("Enter name: "+name);
		System.out.println("Enter age: "+age);
		System.out.println("Enter address: "+address);
		System.out.println("Enter phone number: "+PhnNo);
		
		
	}
	
	//Case 2: The patient is admitted with complete details such as **name, age, address, phone number, and insurance information, min advance amount
	public void addPatient(String name,int age,String address,String PhnNo,String insuranceInfo,double minAdvanceAmount){
		System.out.println("Enter Registred PatientDetails");
		System.out.println("Enter name: "+name);
		System.out.println("Enter age: "+age);
		System.out.println("Enter address: "+address);
		System.out.println("Enter phone number: "+PhnNo);
		System.out.println("Enter insurance information: "+insuranceInfo);
		System.out.println("Enter min advance amount: "+minAdvanceAmount);
		
	}
	public static void main(String [] arg){

		ScenarioHospitalMgtSys scenario=new ScenarioHospitalMgtSys();
		scenario.addPatient("rutuja",22,"Sangola123","1234567890");
		scenario.addPatient("sakshi",24,"Sangola123","1234567890","star health insurance",5000.0);
		
		
	}

}
