package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
	
		iPhone obj = new iPhone();
		System.out.println(obj.increaseVolume());
		System.out.println(obj.makeCall());
		obj.sendSMS();
		obj.ShutDown();
		obj.startApp();
		
		

	}

}
