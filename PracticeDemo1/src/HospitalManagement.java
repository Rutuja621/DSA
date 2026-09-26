public class HospitalManagement {
    public void addPatient(String name,int age,String address,int phnNo){
        System.out.println("Name: "+name+"\n"+"age: "+age+"\n"+"Address: "+address+"\n"+"Phone No: "+phnNo);
    }

    public void addPatient(String name,int age,String address,int phnNo,String insuranceInfo,double minAdvance){
        System.out.println("Name: "+name+"\n"+"age: "+age+"\n"+"Address: "+address+"\n"+"Phone No: "+phnNo+"\n"+"Insurance Info: "+insuranceInfo+"Min Advance: "+minAdvance);

    }
    public static void main(String[] args) {
        HospitalManagement hp=new HospitalManagement();
        hp.addPatient("rutuja",23,"sangola",1234567890);

        hp.addPatient("Rutuja", 23, "Sangola", 1234567890,
                "ABC Insurance", 5000.0);
    }
}
