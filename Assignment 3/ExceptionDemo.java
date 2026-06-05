package Third;
import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
	ExceptionLineTooLong(String message){
		super(message);
	}
}


public class ExceptionDemo{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	try {
	System.out.println("enter a string:");
	String str = sc.nextLine();
	
	if(str.length()>80)
	{
		throw new ExceptionLineTooLong("String is too long");
	}
	System.out.println("string length:" +str.length());
	}
	catch(ExceptionLineTooLong e) {
		System.out.println(e.getMessage());
	}
	sc.close();
	}
	
}