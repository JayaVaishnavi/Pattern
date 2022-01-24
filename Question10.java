package pattern.example.com;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			 for(int j=1;j<=i*2+1;j++) 
			 { 
				 System.out.print("*"); 
				 
			 } 
			 System.out.println();
			 
		}
	}

}

