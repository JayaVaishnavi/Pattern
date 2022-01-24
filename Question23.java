package pattern.example.com;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print("  "+i);
			else
			{
				System.out.print("  "+ (1+(i/2)*3));
			}
		}

	}

}
