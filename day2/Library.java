package Week1.day2;

public class Library {
	
	public void addbook() {
		System.out.println("Book added successfully");
		
	}
	public void issuebook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Library lb=new Library();
        lb.addbook();
        Library lb1=new Library();
        lb1.issuebook();
	}

}
