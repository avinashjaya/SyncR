package Com.ojas.Test;

import java.util.Scanner;


public class Task3_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rounds: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			generateCombinations("", i);
		}
		sc.close();
	}

	public static void generateCombinations(String prefix, int length) {
		if (length == 0) {
			System.out.println(prefix);
			return;
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			generateCombinations(prefix + ch, length - 1);
		}
	}
}