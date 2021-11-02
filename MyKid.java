package week1.day2;

public class MyKid {
	
	
	public static void main(String[] args) {
		
		MyMobile mob = new MyMobile();
		mob.model = "Samsung";
		mob.isTouch = true;
		mob.price = 25000;
		
		System.out.println("Model: " + mob.model);
		System.out.println("TouchScreen: " + mob.isTouch);
		
		
		mob.makeCall();
		mob.sendMsg();
		//mob.payBill();
		
		
		
		

	}

}
