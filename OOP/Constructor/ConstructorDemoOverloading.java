//constructor overloading

class ConstructorDemoOverloading{
	String accountHolder;
	int balance;
	
	ConstructorDemoOverloading(){
		accountHolder=null;
		balance=0;
		
	}
	
	ConstructorDemoOverloading(String name,int InitialBal){
		this.accountHolder=name;
		this.balance=InitialBal;
		
	}
	
    void display(){
		System.out.println(accountHolder+" "+balance);
	
    }
	
	
	public static void main(String [] arg){
	ConstructorDemoOverloading cs=new ConstructorDemoOverloading("rutuja",234555);
	ConstructorDemoOverloading cs1=new ConstructorDemoOverloading();
	
     cs.display();
	 cs1.display();
		
	}






}

