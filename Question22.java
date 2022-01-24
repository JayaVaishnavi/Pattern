package pattern.example.com;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+sum );
			sum=sum+2;
		}


	}

}
