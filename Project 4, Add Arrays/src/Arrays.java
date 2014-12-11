import java.util.*;
import java.io.*;

/**
 * 
 */

/**
 * @author Jonathan
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		File inputFile = new File("src/input.txt"); //receives file
		Scanner fileReader = new Scanner(inputFile); //reads file
		
		int lineCounter = 0;
		
		while (fileReader.hasNextLine()) {
			lineCounter++;
			fileReader.nextLine();
		}
		
		fileReader.close();
		
		String[] dates = new String[lineCounter];
		String[] accounts = new String[lineCounter];
		String[] transactions = new String[lineCounter];
		double[] amounts = new double[lineCounter];
		
		int i = 0;
		fileReader = new Scanner (new File ("src/input.txt"));
		while (fileReader.hasNext()) {
			
			//gets date, first element
			dates[i] = fileReader.next();
			
			//gets account type
			accounts[i] = fileReader.next();
			if (accounts[i].equals("Credit")) {
				accounts[i] = accounts[i] + fileReader.next();
			}
			
			//gets transaction type
			transactions[i] = fileReader.next();
			if (transactions[i].equals("Opening")) {
				transactions[i] = transactions[i] + fileReader.next();
			}
			
			//gets amounts
			amounts[i] = fileReader.nextDouble();
			
			//increase index
			i++;
		}
		fileReader.close();
		
		//calculate total
		double checking = 0.0;
		double credit = 0.0;
		double savings = 0.0;
		
		for (i = 0; i < dates.length; i++) {
			if (accounts[i].equals("Checking")) {
				if (transactions[i].equals("Withdrawal")) {
					checking -= amounts[i];
				}else{
					checking += amounts[i];
				}
			}else if (accounts[i].equals("Savings")) {
				if (transactions[i].equals("Withdrawal")) {
					savings -= amounts[i];
				}else{
					savings += amounts[i];
				}
			} else{ accounts[i].equals("Credit"); {
				if (transactions[i].equals("Withdrawal")) {
					credit -= amounts[i];
				}else{
					credit += amounts[i];
				}
			}
			}
		}
		
		System.out.println("Checking Total = $" + checking);
		System.out.println("Savings Total = $" + savings);
		System.out.println("Credit Total = $" + credit);
	}
}
