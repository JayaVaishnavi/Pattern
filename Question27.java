package pattern.example.com;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			// To find r^n-1
			int r=1;
			for(int j=i;j>1;j--)
				r=r*2;
			System.out.print("  "+(5*r));
			
		}

	}

}
