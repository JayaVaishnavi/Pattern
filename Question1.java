package pattern.example.com;

import java.util.Scanner;

//	Enter the Limit :  
//					4
//				****
//				****
//				****
//				****


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Limit :  ");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
