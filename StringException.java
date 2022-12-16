package exception;

public class StringException 
{
	public static void main(String[] args) 
	{
		
		String name="";
		try {
			System.out.println(name.charAt(5));
		}
		/*catch(ArithmeticException a)
		{
			System.out.println(a+" is an Arithmatic exception");
			a.printStackTrace();
		}*/
		//catch(NumberFormatException c){
		//	System.out.println(c+" is class cast Exception");
		//	c.printStackTrace();
		//}
		catch(ArrayIndexOutOfBoundsException i) {
			System.out.println(i+" is array index out of Exception");
			i.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println(s+" is String index out of Exception");
			s.printStackTrace();
		}
		catch(NullPointerException n) {
			System.out.println(n+" null Exception");
			n.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("it will execute always ");
		}
		
	}

}
