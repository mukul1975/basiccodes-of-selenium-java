package polymorphism;

public class overloading {
	
	
	public void mukul(int a,String b)
	{
		System.out.println(10);
	}
	public void mukul(String b,int a)
	{
		System.out.println(12);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading od=new overloading();
		od.mukul("mukul",6);
		
	}

}
