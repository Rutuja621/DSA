public class ScenarioHospitalMgtSys {
    //Case 1: The patient provides **name, age, address, and phone number**.
    public void addPatient(String name,int age,String address,String PhnNo){
        System.out.println("Enter Registred PatientDetails");
        System.out.println(" name: "+name);
        System.out.println(" age: "+age);
        System.out.println(" address: "+address);
        System.out.println(" phone number: "+PhnNo);


    }

    //Case 2: The patient is admitted with complete details such as **name, age, address, phone number, and insurance information, min advance amount
    public void addPatient(String name,int age,String address,String PhnNo,String insuranceInfo,double minAdvanceAmount){
        System.out.println("\nEnter Registred PatientDetails for Case2");
        System.out.println(" name: "+name);
        System.out.println(" age: "+age);
        System.out.println(" address: "+address);
        System.out.println(" phone number: "+PhnNo);
        System.out.println(" insurance information: "+insuranceInfo);
        System.out.println(" min advance amount: "+minAdvanceAmount);

    }
    public static void main(String [] arg){

        ScenarioHospitalMgtSys scenario=new ScenarioHospitalMgtSys();
        scenario.addPatient("rutuja",22,"Sangola123","1234567890");
        scenario.addPatient("sakshi",24,"Sangola123","1234567890","star health insurance",5000.0);


    }
}
