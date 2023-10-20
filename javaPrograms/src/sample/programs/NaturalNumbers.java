package sample.programs;

import java.util.Scanner;

public class NaturalNumbers 
{
	public void Print(int n)
	{
	int i=1;
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner nn=new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int limit=nn.nextInt();
		NaturalNumbers obj1=new NaturalNumbers();
		obj1.Print(limit);
	}

}
