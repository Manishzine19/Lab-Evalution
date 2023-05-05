/*create another class having main method
display menu
1) cube
2) square
3) greater
Ask choice from user and based on choice call above methods
Repeat the menu till choice is not equal to 0*/

package Assignment3_Functions;
import java.util.*;
public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations o=new Operations();
		Scanner s= new Scanner(System.in);
		boolean e=false;
		while(e!=true) {
			System.out.println();
		System.out.println("Menu: ");
		System.out.println("1) Cube"
				+ " 2) square"
				+ " 3) grater");
		System.out.println();
		System.out.println("Enter your choice to perform operations acording to menu: ");
		int d=s.nextInt();
		int a, b, c;
		switch(d) {
		case 1:
			System.out.println();
			System.out.println("Enter a number: ");
			a=s.nextInt();
			System.out.println();
			o.cube(a);
			break;
		case 2:
			System.out.println();
			System.out.println("Enter a numbers: ");
			b=s.nextInt();
			o.square(b);
			System.out.println();
			break;
		case 3:
			System.out.println();
			System.out.println("Enter 3 numbers: ");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			o.grater(a, b, c);
			System.out.println();
			break;
		default:
			System.out.println("Error");
			e=true;
		}
		}
		}
}
