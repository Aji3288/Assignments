package week1.day1.homework;

public class Mobile {

	private void makecall() {
		System.out.println("Hello");
		
		String mobileModel = "VIVO Y100";
        float mobileWeight = 22.1f;
        
	}
       public void sendMsg() {
   		System.out.println("Hi"); 
         
   		boolean isCharged = true;
   		int mobileCost = 25000;
       }	
	public static void main(String[] args) {
		
		String mobileModel = "VIVO Y100";
        float mobileWeight = 22.1f;
        boolean isCharged = true;
   		int mobileCost = 25000;
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(isCharged);
		System.out.println(mobileCost);
		
		Mobile obj =new Mobile();
		obj.makecall();
		obj.sendMsg();
		
        System.out.println("This is my Mobile");
	}

}
