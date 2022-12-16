package exception;

public class ExceptionHanding {

	public static void main(String[] args) {
		int num=10;
		try
		{
		
		System.out.println(num/0);
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();	
		}
		//System.out.println(num);
		finally {
			System.out.println("Eception is occured or not but finally always executed");
		}
		System.out.println(num);

	}

}
