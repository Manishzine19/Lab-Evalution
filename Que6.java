//6.Wap to swap two numbers

package Assignment1;
import java.util.*;
public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter two numbers: ");
		a=s.nextInt();
		b=s.nextInt(); 
		System.out.println("Numbers before swapping "+a+" "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("Numbers after swapping "+a+" "+b);
	}

}
