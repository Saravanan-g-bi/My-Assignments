package Week1.day2;

public class Fibbonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=8, a=0,b=1;
            System.out.println("numbers"+n+"terms");
            for(int i=0;i<8;i++) {
            	System.out.print(a + ", ");
                int nextTerm = a + b;
                a = b;
                b = nextTerm;
            }
	}

}
