package pattern.example.com;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
			System.out.print(" "+i);
	}

}
