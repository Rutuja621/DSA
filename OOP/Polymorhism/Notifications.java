/*
2. Notification System
Scenario:
An application sends notifications through Email, SMS, and Push Notifications. The process of sending notifications differs for each channel.
Question:
How would you implement sendNotification() using polymorphism?
*/
class Channel{
	public void sendNotification(){
		System.out.println("Channel to send Notification via Email,SMS,Push");
	}

}

class EmailApp extends Channel{
	public void sendNotification(){

      System.out.println(" Notification Send by Email");
	}

}

class SMSApp extends Channel{
	public void sendNotification(){

      System.out.println("Notification Send by SMS");
	}


}

class GitApp extends Channel{
	public void sendNotification(){

      System.out.println("Notification Send by Git Push");
	}

}

public class Notifications{
	public static void main(String [] arg){
		Channel c=new Channel();
		c = new EmailApp();
		c.sendNotification();
		
	}


}