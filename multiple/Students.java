package multiple;

public class Students {
	public void getStudentInfo(int id) {
		
		System.out.println("Student ID  :  " + id);
		
	}

	public void getStudentInfo(int Id,String name) {
		
		System.out.println("Student ID : " + Id);
		System.out.println("Student Name : " + name);
	}
	
	public void getStudentInfo(String email, long phonenumber) {
		
		System.out.println("Student Email : " + email );
		System.out.println("Student Ph.NO : " + phonenumber);
		
	}
	
	public static void main(String[] args) {
		
		Students getStudentInfo = new Students();
		
		getStudentInfo.getStudentInfo(5000002);
		getStudentInfo.getStudentInfo(5000002, "P C AJICHRISTILIN" );
		getStudentInfo.getStudentInfo("ajichristilin@gmail.com", 9884067228L);
				
		
	}
}
