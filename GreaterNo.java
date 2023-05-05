/*Q 2 create another class having method like  
void greater() --> take 3 input  within function
void greater(int ,int)
void greater(int a,int b,int c)
create main in same class and call all methods*/

package Assignment3_Functions;
import java.util.*;
public class GreaterNo {
	static int a, b, c;
	void greater() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	}
	void greater(int a, int b) {
		if(a>b) {
			System.out.println("a="+a+" is greater than b="+b);
		}
		else if(a<b) {
			System.out.println("b="+b+" is greater than a="+a);
		}
	}
	void greater(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("a="+a+" is grater no.");
		}
		if(b>a && b>c) {
			System.out.println("b="+b+" is grater no.");
		}
		if(c>b && c>a) {
			System.out.println("c="+c+" is grater no.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterNo g=new GreaterNo();
		g.greater();
		g.greater(a, b);
		g.greater(a, b, c);
	}

}
