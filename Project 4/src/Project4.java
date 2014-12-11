import java.util.*;
import java.io.*;
/**
 * @author Jonathan
 *
 */
public class Project4 {

	/**
	 * @param read file, group amounts in proper category, & add and subtract where needed to find three different totals
	 * Print results as output.txt file
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		double checkingAccount = 0;
		double savingsAccount = 0;
		double creditAccount = 0;
		//starting values
		
		File inputFile = new File("src/input.txt"); //receives file
		Scanner inputReader = new Scanner(inputFile); //reads file
		
		
		while (inputReader.hasNextLine()) { 
			String line = inputReader.nextLine(); //separates each line
			
		    if (line.contains("Checking")) { //goes to checking method
		    	processChecking(line, checkingAccount);
		    }else if (line.contains("Savings")) { //goes to savings method
		    	processSavings(line, savingsAccount);
		    }else{ line.contains("Credit Card"); //goes to credit method
		    	processCredit(line, creditAccount);	
		    }   
		}
		
		inputReader.close(); //close scanner
	}
	
	public static void processChecking (String line, double checkingAccount) throws FileNotFoundException {
		
		
		Scanner lineReader = new Scanner(line); //reads line by line
		
		while(lineReader.hasNext()
				&& !lineReader.hasNextDouble()) { 
			lineReader.next();
		} //continues to read line until double
		
		if (line.contains("Opening Balance") 
				|| line.contains("Deposit")) {
			checkingAccount += lineReader.nextDouble(); //add
		}else{ line.contains("Withdrawal");
			checkingAccount -= lineReader.nextDouble(); //subtract
		}
		
		totals(checkingAccount, checkingAccount, checkingAccount); //sends to separate method to get totaled and printed
		lineReader.close(); //close scanner
	}
	
	public static void processSavings (String line, double savingsAccount) throws FileNotFoundException {
		
		Scanner lineReader = new Scanner(line); //reads line by line
		
		while(lineReader.hasNext()
				&& !lineReader.hasNextDouble()) {
			lineReader.next();
		} //continues to read line until double
		
		if (line.contains("Opening Balance") 
				|| line.contains("Deposit")) {
			savingsAccount += lineReader.nextDouble(); //add 
		}else{ line.contains("Withdrawal");
			savingsAccount -= lineReader.nextDouble(); //subtract
		}
		
		totals(savingsAccount, savingsAccount, savingsAccount); //sends to separate method to get totaled and printed
		lineReader.close(); //close scanner
	}

	public static void processCredit (String line, double creditAccount) throws FileNotFoundException {
	
		Scanner lineReader = new Scanner(line); //reads line by line
	
		while(lineReader.hasNext()
				&& !lineReader.hasNextDouble()) {
			lineReader.next();
		} //continues to read line until double
		
		if (line.contains("Withdrawal")) {
		creditAccount -= lineReader.nextDouble(); //subtract 
		}else{ 
			creditAccount += lineReader.nextDouble(); //add
		}
			
		System.out.println(creditAccount);
		totals(creditAccount, creditAccount, creditAccount); //sends to separate method to get totaled and printed
		lineReader.close(); //close scanner
	}
	
	public static void totals(double checkingAccount, double savingsAccount, double creditAccount) throws FileNotFoundException {
		
		PrintStream output = new PrintStream(new File("src/output.txt"));
		output.println("Total Checking Balance : $" + checkingAccount);
		output.println("");
		output.println("Total Savings Balance : $" + savingsAccount);
		output.println("");
		output.println("Total Credit Balance : $" + creditAccount);
		
		output.close();
	}
}
