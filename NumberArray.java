package exception;

public class NumberArray {

	public static void main(String[] args) {
		int[] nums= {10,20,30,-52,25};
		try {
			System.out.println(nums[10]);
		}
		/*catch(ArithmeticException a) {
			System.out.println(a+"is an Arithmatic exception");
			a.printStackTrace();
		}*/
		catch(NullPointerException n) {
			System.out.println(n+" is an Null pointer Exception");
			n.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println(i+"is outof array boundary");
			i.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
