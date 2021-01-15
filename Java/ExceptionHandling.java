import java.util.Scanner;
class ExceptionHandling
{
	public static void main(String[] args)
	{
		try{
			int a,b,c;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter first number:");
			a=s.nextInt();
			System.out.print("Enter second number:");
			b=s.nextInt();
			c=a+b;
			System.out.println("Sum :"+c);
			c=a-b;
			System.out.println("Subtract :"+c);
			c=a*b;
			System.out.println("Multiply :"+c);
			c=a/b;
			System.out.println("Divide :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception catched:"+e);
		}
		finally
		{
			System.out.println("Program Executed successfully");
		}
	}
}