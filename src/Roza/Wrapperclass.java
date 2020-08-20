package Roza;

public class Wrapperclass {

	public static void main(String[] args) {

		//Integer,Double,Flote, Boolean are the Wrapper class
		String p="200";
		System.out.println(p+20);
		int q=Integer.parseInt(p);
		System.out.println(q+20);
		//by using value of method we can convert the int to string
		int a=200;
		int b=200;
		System.out.println(a+b);
		String c=String.valueOf(a);
		System.out.println(c+b);
		
	}

}
