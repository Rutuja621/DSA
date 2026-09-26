import java.security.spec.RSAOtherPrimeInfo;

class Patient{
    //instance variables
    String paitientID;
    String name;
    int age;
    String diseases;
    int roomNo;

    //static variables
    static String hospitalName="City Hospital";
    static  int totalPatients=0;

    Patient(String paitientID,String name,int age,String diseases,int roomNo){
        this.paitientID=paitientID;
        this.name=name;
        this.age=age;
        this.diseases=diseases;
        this.roomNo=roomNo;

        totalPatients++;
    }

    void disChargePatient(){
        totalPatients--;
        System.out.println("patient removed");
    }

    void updateRoomNo(int newRoomNo){
        roomNo=newRoomNo;
    }

    void display(){
        System.out.println("Patient ID: "+paitientID);
        System.out.println("Patient Name: "+name);
        System.out.println("age: "+age);
        System.out.println("diseases: "+diseases);
        System.out.println("Room No: "+roomNo);
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println();
    }

}

public class HospitalManagementScenario2 {
    public static void main(String[] args) {
        //array of objects
        Patient[] patients=new Patient[500];

        patients[0]=new Patient("P101","Ram",40,"feaver",101);

        patients[1]=new Patient("P102","Sita",30,"HeadAche",102);

        patients[0]=new Patient("P103","Gita",49,"feaver+headache",103);

        //test case 1
        System.out.println("Total patients: "+Patient.totalPatients);

        //test case 2
        patients[1].disChargePatient();


      //test case 3
        patients[0].updateRoomNo(201);

        System.out.println("After updating Ram's Room\n");
        patients[0].display();


    }
}
