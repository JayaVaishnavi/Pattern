package pattern.example.com;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		/* System.out.println("" +n%2); */
		if(n<=4)
			System.out.println("Invalid entry");
		else
		{
			for(int i=0;i<=n/2;i++)
			{
				for(int j=n/2;j>=i;j--)
					System.out.print(" ");
				for(int j=1;i*2>=j;j++) // 2 
					System.out.print("*");
				for(int j=n/2;j>=i;j--)
					System.out.print(" ");
				for(int j=n/2-1;j>=i;j--)
					System.out.print(" ");
				for(int j=1;i*2>=j;j++) // 2 
					System.out.print("*");
				System.out.println();
			}
			for(int i=n;i>=0;i--)
			{
				for(int j=2;j<=n-i+1;j++)
					System.out.print(" ");
				 for(int j=i*2+1;j>=1;j--) 
					 System.out.print("*"); 	 
				System.out.println();
			}
		}

	}

}
