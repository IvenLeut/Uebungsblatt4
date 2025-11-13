package h1;

public class H1_main {
	public static void main(String[]args) {
		int zone = 45;
		double preis = 1.2;
		switch (zone) {
		case (1):
			preis = 2.00 ;
		break;
		case (2):
			preis = 2.35;
		break;
		case (3): 
			preis = 2.85;
		break;
		case (4):
			preis = 2.85;
		break;
		case (5):
			preis = 3.55;
		break;
		default : 
			preis = 4.00;
		}
		System.out.println(preis);
	}
}
