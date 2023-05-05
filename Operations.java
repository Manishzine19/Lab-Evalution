/*Q 1) create a class three methods
a) void cube(int a)
b) void square (int b)
c) void greater(int a,int b,int c)*/

package Assignment3_Functions;
public class Operations {
	public void cube(int a) {
		System.out.println(a*a*a);
	}
	public void square(int b) {
		System.out.println(b*b);
	}
	public void grater(int a, int b, int c) {
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
}
