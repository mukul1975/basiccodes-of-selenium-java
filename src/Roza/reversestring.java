package Roza;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="Hello World";
		String q="";
		
		for(int i=p.length()-1;i>=0;i--)
		{
			q=q+p.charAt(i);
		}
		System.out.println(q);
        System.out.println("***********");
		StringBuffer sb=new StringBuffer(p);
		System.out.println(sb.reverse());
		 System.out.println("***********");
		String R="***mn((12&&AM";//to replace the special charecter
		R=R.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(R);

	}

}
