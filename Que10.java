//10.wap to check greater number among three numbers.

package Assignment1;
import java.util.*;
public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter three numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c) {
			System.out.println("Grater number is "+a);
		}
		else if(a<b && b>c) {
			System.out.println("Grater number is "+b);
		}
		else if(c>a && c>b) {
			System.out.println("Grater number is "+c);
			
		}
	}

}
