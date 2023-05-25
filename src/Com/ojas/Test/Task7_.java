package Com.ojas.Test;

import java.util.Scanner;

public class Task7_ {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of rounds: ");
	        int num = sc.nextInt();
	        sc.close();

	        long startTime = System.currentTimeMillis();
	        
	        for (int i = 1; i <= num; i++) {
	            generateCombinations("", i);
	        }

	        long endTime = System.currentTimeMillis();
	        long executionTime = endTime - startTime;
	        System.out.println("Execution time: " + executionTime + " milliseconds");
	    }

	    public static void generateCombinations(String prefix, int length) {
	        if (length == 0) {
	            System.out.println(prefix);
	            return;
	        }
//	        char startChar = (prefix.isEmpty()) ? 'a' : prefix.charAt(prefix.length() - 1);

	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            generateCombinations(prefix + ch, length - 1);
	        }
	    }
	}



