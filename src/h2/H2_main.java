package h2;

public class H2_main {
	public static void main(String[]args) {
		boolean x = true, y = true ;
		boolean a = true,  b = true , c = true; 
		int input = 10;
		if (input == 10 || input == 11) {
			x = true; 
		}else {
			x = false;
		}
		if (input == 1 || input == 11) {
			y = true; 
		}else {
			y = false;
		}
		a = (x && y);
		b = (x || x != y);
		c= !y;
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
	}
}
