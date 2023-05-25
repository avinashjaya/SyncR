package Com.ojas.Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task8_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rounds: ");
		int num = sc.nextInt();
		sc.close();

		long startTime = System.nanoTime();

		for (int i = 1; i <= num; i++) {
			generateCombinations("", i);
		}

		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;

		String formattedTime = formatExecutionTime(executionTime);
		System.out.println("Execution time: " + formattedTime);
	}

	public static void generateCombinations(String prefix, int length) {
		if (length == 0) {
			// Uncomment the line below to store the combinations in a file
			// writeCombinationsToFile(prefix);
			return;
		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			generateCombinations(prefix + ch, length - 1);
		}
	}

	public static String formatExecutionTime(long executionTime) {
		if (executionTime < TimeUnit.MILLISECONDS.toNanos(1)) {
			return executionTime + " nanoseconds";
		} else if (executionTime < TimeUnit.SECONDS.toNanos(1)) {
			return TimeUnit.NANOSECONDS.toMillis(executionTime) + " milliseconds";
		} else if (executionTime < TimeUnit.MINUTES.toNanos(1)) {
			return TimeUnit.NANOSECONDS.toSeconds(executionTime) + " seconds";
		} else {
			return TimeUnit.NANOSECONDS.toMinutes(executionTime) + " minutes";
		}
	}
}
