package pattern.example.com;

import java.util.Scanner;

public class Question2 {
	
/*	if n=5,
			o/p:
				11111
				22222
				33333
				44444
				55555
*/
	
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(""+i);
			}
			System.out.println();
		}
		
	}

}
