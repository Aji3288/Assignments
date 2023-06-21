package week1.day1;

public class Mobile {

			public void sendSms() {
				System.out.println("Hi Team");
			}
			
		    protected void allowVoiceCall() {
				System.out.println("Hey Hi");
            }
		    
			private void takeVideo() {
				System.out.println("Take Video - smile");
			}
			
			public static void main(String[] args) {
			
				Mobile obj = new Mobile ();
				
				obj.sendSms();
				obj.allowVoiceCall();
				obj.takeVideo();				
				
			}	
}

