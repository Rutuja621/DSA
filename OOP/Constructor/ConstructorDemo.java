//constructor

class ConstructorDemo{
	String accountHolder;
	int balance;
	
	ConstructorDemo(String name,int InitialBal){
		this.accountHolder=name;
		this.balance=InitialBal;
		
	}
	
    void display(){
		System.out.println(accountHolder+" "+balance);
	
    }
	
	
	public static void main(String [] arg){
	ConstructorDemo cs=new ConstructorDemo("rutuja",234555);
     cs.display();
		
	}






}

