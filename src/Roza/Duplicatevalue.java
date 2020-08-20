package Roza;

import java.util.Arrays;

public class Duplicatevalue {

	public static void main(String[] args) {

		String text[]= {"Selenium","Java","Python","Ruby","Java","Ruby"};
		for(int i=0;i<text.length;i++)
		{
			for(int j=i+1;j<text.length;j++)
				if(text[i].equals(text[j]))
				{
					System.out.println("Duplicate value is::"+text[j]);
				}
				{
					
				}
		}
		
		//how to print largest number/smallest number in a array
		
		int num[]= {-6,7,9,12,407,60};
		int sum=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>sum)
			{
				sum=num[i];
			}
		}
		
		System.out.println(sum);
	}

}
