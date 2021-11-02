package week1.day2;

public class MyMobile {
	
	String model;
	String subModel;
	boolean isTouch;
	int price;
	
	public void makeCall() {
		System.out.println("Making a call");

	}
	
	public void sendMsg() {
		System.out.println("Sending a msg");

	}
	
	private void payBills()
	{
		System.out.println("Paying the Bill");
	}
	

	public static void main(String[] args) {
	
		MyMobile myMob = new MyMobile ();
		myMob.model = "iPhone";
		System.out.println("My Mobile model is "+ myMob.model);
		myMob.makeCall();
		myMob.sendMsg();
		myMob.payBills();

	}

}
