/* 2. using ternary check if number entered by user is positive or negative .
In case number is positive store "Positive number" else store negative number 
to Result variable*/

package Assignment1;
import java.util.*;
public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		System.out.println(a!=0?(a>0?"Positive number.":"Negative number."):"Neither positive nor negative.");
	}

}
