package pattern.example.com;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		int ans=1,iteration=3;
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+ans );
			ans+=iteration;
			iteration+=2;
		}
	}

}
