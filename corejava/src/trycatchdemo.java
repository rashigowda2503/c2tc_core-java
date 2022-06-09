
public class trycatchdemo {
	

	public static void main(String[] args) {
		String str=null;
		try {
			str.equals("hello");
		}catch(NullPointerException ne){
			str=new String("hello");
			System.out.println(str.equals("hello"));
		

	}

System.out.println("continu");
}
}