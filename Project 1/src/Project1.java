import java.util.Scanner;
/**
 * @author jhernand
 *
 */
public class Project1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in); 
		//allows for input of credit debt and interest rate
		
		System.out.println("Program computes desired monthy payment plan.");
		System.out.println("Please only enter whole numbers or decimal numbers.");
		
		System.out.println("Enter credit debt amount       : ");
		double credit = console.nextDouble(); //credit debt
		
		System.out.println("Enter interest rate            : ");
		double interestRate = console.nextDouble(); //interest rate in decimal format
		
		System.out.println("Enter desired number of months : ");
		int xx = console.nextInt(); //months

		xxMonthPlan(credit, interestRate, xx); //pass input variables to second method
		
		console.close(); //closes scanner; found on stackoverflow.com
	}
	private static void xxMonthPlan(double credit, double interestRate, int xx) {
		double interest = credit * interestRate;
		/* interest is added monthly fee */ 
		
		double payment = Math.round((interest + credit)/xx);
		/* Found "Math.round()" on page 154 in book Building Java Programs*/
		
		double finalPayment = Math.round(credit % payment);
		/* To find final month payment*/
		
			System.out.println("");	 /* Line Break when played */
		 	System.out.println(xx + "-Month Payment Plan: $" + payment + " per month");
		 	System.out.println("Last payment: $" + finalPayment);
	}
}
