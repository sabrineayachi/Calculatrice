package Calculation;

/**
 * Embed HTML directly into the Javadoc.
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
class Calcul  {
	public int addition(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public int soustraction(int a, int b)
	{
		int c = a - b;
		return c;
	}
	
	public int multiplication(int a, int b)
	{
		int c = a * b;
		return c;
	}
	
	public int division(int a, int b)
	{
		int c=0;
		if (b != 0) 
			c = a / b;
		else
			System.out.println("b est 0");
		return c;
	}
	
	public static void main(String[] args) {
		Calcul c1 = new Calcul();
		int a = 1;
		int b = 2;
		System.out.println(c1.addition(a, b) + " " + c1.soustraction(a, b) + " " + c1.multiplication(a, b) + " " + c1.division(a, b) );
	}

}
