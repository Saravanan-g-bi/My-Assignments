package Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=121;
         int reversednumber=0;
         int originalNumber = a;
         for (; a != 0; a /= 10) {
             int digit = a % 10;
             reversednumber = reversednumber * 10 + digit;
         }

         if (originalNumber == reversednumber) {
             System.out.println(originalNumber + " is a palindrome.");
         } else {
             System.out.println(originalNumber + " is not a palindrome.");
         }
	}

}
