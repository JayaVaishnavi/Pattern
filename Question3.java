package pattern.example.com;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int lt=scanner.nextInt();
		
		for(int i=0;i<=lt;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
