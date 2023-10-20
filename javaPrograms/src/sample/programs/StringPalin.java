package sample.programs;
import java.util.*;

public class StringPalin
{
	public void Palindrome(String str)
	{
		StringBuilder rsp1 = new StringBuilder(str);
        rsp1.reverse();
		
			if (rsp1.toString().equalsIgnoreCase(str)) 
			{
				System.out.println(str+" is Palindrome");
			} 
			else 
			{
				System.out.println(str+" is Not Palindrome");
			}
	}

    public static void main(String[] args) 
	{
		Scanner pd=new Scanner(System.in);
		
		System.out.println("Enter the Word");
		 String sp1 = pd.next();
		 
		StringPalin obj1=new StringPalin();
		 obj1.Palindrome(sp1);
        
    }
}
