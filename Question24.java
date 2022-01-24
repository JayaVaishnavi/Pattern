package pattern.example.com;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		
		int first=1, second=1 , third;
		
		
		for(int i=1 ;i<=n;i++)
		{
			if(i==1|| i==2)
				System.out.print(" 1");
			else
			{
				third=first+second;
				System.out.print(" "+ third);
				first=second;
				second=third;
			}
		}
	}

}
