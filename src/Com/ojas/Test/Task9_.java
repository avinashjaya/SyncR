package Com.ojas.Test;


	
	
		import java.io.FileWriter;
		import java.io.IOException;
		import java.util.Scanner;
		import java.util.concurrent.TimeUnit;

		public class Task9_ {

		    private static final String OUTPUT_FILE_PATH = "Output_";

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter number of rounds: ");
		        int num = sc.nextInt();
		        sc.close();

		        long startTime = System.nanoTime();

		        try (FileWriter writer = new FileWriter((OUTPUT_FILE_PATH)+num+".txt")) {
		            for (int i = 1; i <= num; i++) {
		                generateCombinations(writer, "", i);
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        long endTime = System.nanoTime();
		        long executionTime = endTime - startTime;

		        String formattedTime = formatExecutionTime(executionTime);
		        System.out.println("Execution time: " + formattedTime);
		    }

		    public static void generateCombinations(FileWriter writer, String prefix, int length) throws IOException {
		        if (length == 0) {
		            writer.write(prefix + System.lineSeparator());
		            return;
		        }

		        for (char ch = 'a'; ch <= 'z'; ch++) {
		            generateCombinations(writer, prefix + ch, length - 1);
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
