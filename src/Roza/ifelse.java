package Roza;

public class ifelse {

	public static void main(String[] args) {
		for (int i=0;i<5;i++)
				{
				if(3>2)
					System.out.println("I m bigger");
				else
					System.out.println("I m smaller");
				}
		
		String am="asraful";
		String pm="";
		for(int i=am.length()-1;i>=0;i=i-1)
		{
			pm=pm+am.charAt(i);
		}
		System.out.println(pm);
		
		int p=am.length()-1;
		while(p>=0)
		{
			pm=pm+am.charAt(p);
			p=p-1;	
		}

		
		
		
	}

}
