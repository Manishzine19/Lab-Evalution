//8.wap to check is number is even or odd.

package Assignment1;
import java.util.*;
public class Que8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("Enter the number: ");
		a=s.nextInt();
		if(a%2==0) {
			System.out.println("Number is even.");
		}
		else {
			System.out.println("Number is odd.");
		}
	}

}
