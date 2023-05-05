/* 1. wap to demonstrate ternary operator .Define a variable marks. 
Ask its value from user and using ternary operator check if 
marks > 40 store "Pass" in result variable else store "Fail"*/

package Assignment1;
import java.util.*;
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		System.out.println(marks>40?"Pass":"Fail");
	}

}
