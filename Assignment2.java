
public class Assignment2

{
	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int c = a + b;

		for (int i = 1; i <= 12; i++)

		{
			System.out.println(a + " ");

			c = (a + b);
			a = b;
			b = c;
		}

	}

}
