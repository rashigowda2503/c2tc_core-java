package testpk;
public class polymorphism {
	void add(int x,int y)
	{
		System.out.println("add 2 nos"+(2+5));
		
		}
	void add(int x,int y,int z)
	{
		System.out.println("add 2 nos"+(2+5+9));
		
		
	}

	public static void main(String[] args) {
	polymorphism ob1=new polymorphism();
		ob1.add(3,4);
ob1.add(6,2,3);
	}

}
