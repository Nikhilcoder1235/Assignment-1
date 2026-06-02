package First;

class Calculator{

	public void display(int a, int b) {
		System.out.println("Multiplication of A and B:"+ a*b);
	}


	public void display(int a, int b, int c) {
		System.out.println("Multiplication of A,B,C:"+ a*b*c);
	}


	public void display(double a , double b) {
		System.out.println("Multiplication of A AND B:"+ a*b);
	}
}
public class Math {
public static void main(String[] args)
{
	Calculator ref = new Calculator();
	ref.display(2,5);
	ref.display(4,5,6);
	ref.display(34,34);
}
}
