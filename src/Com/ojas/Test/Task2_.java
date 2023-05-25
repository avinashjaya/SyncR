package Com.ojas.Test;

import java.util.Scanner;

public class Task2_ {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number of rounds");
		int number=sc.nextInt();
		for(int i=0;i<=number;i++) {
			
			for (char c = 'a'; c <= 'z'; c++) {
				System.out.print(c+" ");

			}
		}
		
	}

}
