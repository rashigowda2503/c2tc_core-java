

public class throwtest {
	

	public static void main(String[] args) {
		try {
			ArithmeticException a=new ArithmeticException("hello free thrown");
			throw a;
		}
			catch(ArithmeticException a)
			{
				System.out.println("ArithmeticExceptioncaught:/n"+a);
				System.out.println(a.getMessage());
			}
		}
	}
