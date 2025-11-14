package h3;

public class H3_main {
	public static void main(String[]args) {
		float celsiusFloat = 14.2F;
		float fahrenheitFloat = 13.54F;
		double celsiusDouble = 14.2;
		double fahrenheitDouble = 123.2;
		fahrenheitFloat = celsiusFloat * (9f/5f) + 32f;
		fahrenheitDouble = celsiusDouble * (9d/5d) + 32d;
		//System.out.println(fahrenheitFloat);
		//System.out.println(fahrenheitDouble);
	}
}
