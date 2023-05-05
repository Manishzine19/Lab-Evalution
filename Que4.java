//wap  that ask two numbers from user and print greater number among two.

package Assignment1;
import java.util.*;
public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a>b?a+" is greter":b+" is grater");
	}

}
