package pattern.example.com;

import java.util.Scanner;

public class question26 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int first, ans=1, iteration=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+ans);
			iteration++;
			ans=ans+iteration;
			
			
		} 
	}

}
