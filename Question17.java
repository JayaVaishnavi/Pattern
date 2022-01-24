package pattern.example.com;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<n+n;i++)
		{
			for(int j=1;j<n+n;j++)
			{
				int k=1;
				while(k<=n)
				{
					if(i==k||j==k||i==n*2-1||j==n*2-1)
						System.out.print(" "+ (n-k));
					break;
				}
			}
			System.out.println();
		}
		
		
	}

}
