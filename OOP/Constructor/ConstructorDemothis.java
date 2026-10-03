//constructor overloading

class ConstructorDemothis{

	String accountHolder;
	int balance;
	
	
	
	ConstructorDemothis(String name,int InitialBal){
		this.accountHolder=name;
		this.balance=InitialBal;
		
	}
	
	ConstructorDemothis(String accountHolder){
		this("rutuja",23444);
		System.out.println("called");
		
	}
	
    void display(){
		System.out.println(accountHolder+" "+balance);
	
    }
	
	
	public static void main(String [] arg){
	ConstructorDemothis cs=new ConstructorDemothis("rutuja",234555);
	ConstructorDemothis cs1=new ConstructorDemothis("account");
	
     cs.display();
	 cs1.display();
		
	}






}

