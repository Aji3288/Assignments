package org.system;

public class Desktop extends Computer  {
 
	public void desktopSize() {
		
		System.out.println("Desktop Size is 20 inches");
	}
 
 public static void main(String[] args) {
	
	 Desktop com = new Desktop();
	 com.computerModel();
	 com.desktopSize();
}

}


