package anagram;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first string:");
		String string1=input.nextLine();
		System.out.print("Enter second string:");
		String string2=input.nextLine();
		int length1=string1.length();
		int length2=string2.length();
		if(length1==length2)
		{
			char[] characterArray1=string1.toCharArray();
			char[] characterArray2=string2.toCharArray();
			Arrays.sort(characterArray1);
			Arrays.sort(characterArray2);
			boolean result=Arrays.equals(characterArray1,characterArray2);
			if(result)
			{
				System.out.println("The "+string1+" and "+string2+" are anagrams.");
			}
			else
			{
				System.out.println("The "+string1+" and "+string2+" are not anagrams.");
			}
		}
		else
		{
			System.out.println("The "+string1+" and "+string2+" are not anagrams.");
		}
		input.close();
	}
}
