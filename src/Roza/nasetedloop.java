package Roza;

public class nasetedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* print like this
 * 1	2	3	4	
5	6	7	
8	9	
10	
 */
		int k=1;
	for(int i=1;i<=5;i++)
	{
//		System.out.println("p");
		for(int j=1;j<=5-i;j++)
		{
			System.out.print(k);
			System.out.print("\t");
			k++;
		
	}
		System.out.println("");
	
	
	
	}
	
	/*
	 * print like this
	 * 1	
2	3	
4	5	6	
7	8	9	10	
	 */
	
	int h=1;
	for(int i=1;i<5;i++)
	{
//		System.out.println("p");
		for(int j=1;j<=i;j++)
		{
			System.out.print(h);
			System.out.print("\t");
			h++;
		
	}
		System.out.println("");
	
	
}

	/*print like this
	 * 1	
1	2	
1	2	3	
1	2	3	4	
1	2	3	4	5	
	 */
	
	for(int i=1;i<6;i++)
	{
//		System.out.println("p");
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
			System.out.print("\t");
			
		
	}
		System.out.println("");
	
	
}
}
}
