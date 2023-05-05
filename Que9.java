/*A school has following rules for grading system:
 a. Below 25 - F
 b. 25 to 45 - E
 c. 45 to 50 - D
 d. 50 to 60 - C
 e. 60 to 80 - B
 f. Above 80 - A
 Ask user to enter marks and print the corresponding grade*/ 
package Assignment1;
import java.util.*;
public class Que9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks of student: ");
		int m=s.nextInt();
		if(m<25) {
			System.out.println("Grade: F");
		}
		else if(m>=25 && m<45) {
			System.out.println("Grade: E");
		}
		else if(m>=45 && m<50) {
			System.out.println("Grade: D");
		}
		else if(m>=50 && m<60) {
			System.out.println("Grade: C");
		}
		else if(m>=60 && m<80) {
			System.out.println("Grade: B");
		}
		else if(m>=80) {
			System.out.println("Grade: A");
		}
	}

}
