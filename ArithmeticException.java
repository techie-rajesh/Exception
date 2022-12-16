package exception;

public class ArithmeticException 
{
	public static void main(String[] args) 
	
	{
		int a=10,b=0;
		int add=a+b;
		//System.out.println(add);
		int sub=a-b;
		//System.out.println(sub);
		int mult=0;
		try {
			 int div=a/b;
			  mult=a*b; //it will not execute bec div is exception so mult will not execute
			 
		}
		catch(Exception e)
		{
			System.out.println(e+" give valid Number");
		}
		//int mult=a*b;
		System.out.println(mult); // it show temp value
		System.out.println(add);
		System.out.println(sub);
		System.out.println("hello");
		
	}

}
