/*wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price else discount is 7 % of price*/

package Assignment1;
import java.util.*;
public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n;
		double f, new_price;
		System.out.println("User please enter the name of product: ");
		n=s.next();
		System.out.println("User please enter the price of product: ");
		f=s.nextDouble();
		double disscount;
		if(f>2000) {
			disscount=f*0.1;
			new_price=f-disscount;
			System.out.println("Price after disscount of 10%: "+new_price);
		}
		else {
			disscount=f*0.07;
			new_price=f-disscount;
			System.out.println("Price after disscount of 7%: "+new_price);
		}
	}

}
