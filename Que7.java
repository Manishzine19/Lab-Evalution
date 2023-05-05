//7. How to swap two numbers without using a third variable?

package Assignment1;
import java.util.*;
public class Que7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a, b;
		System.out.println("Enter a: ");
		a=s.nextInt();
		System.out.println("Enter b: ");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" b="+b);
	}

}
