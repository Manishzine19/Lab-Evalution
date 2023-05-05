//WAP to ask name ,age and salary of an employee and print on console.

package Assignment1;
import java.util.*;
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of employee: ");
		String n=s.next();
		System.out.println("Enter the age of employee: ");
		int a=s.nextInt();
		System.out.println("Enter the salary of employee: ");
		float f=s.nextFloat();
		System.out.println("Name of employee: "+n+"\nage of employee: "+a+"\nSalary of employee: "+f);
	}

}
