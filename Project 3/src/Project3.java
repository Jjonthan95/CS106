import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jonathan
 *
 */
public class Project3 {
		/**
		 * @param Which Nintendo mascot are you?
		 */
	public static void main(String[] args) {
		/**
		 * 4 different characters
		 * Holds the values
		 */
		int mario = 0;
		int kirby = 0;
		int link = 0;
		int pikachu = 0;
	
		Scanner answerMe = new Scanner(System.in); //accepts input
		
		System.out.println("What Nintendo mascot are you? Answer the questions to find out!");
		System.out.println("(Please enter the corresponding letter.)");
		System.out.println("");
		
		questionOne(answerMe, mario, kirby, link, pikachu);	//pass down to first question, will be same with each following question
	}
	
	public static void questionOne(Scanner answerMe, int mario, int kirby, int link, int pikachu) {	
		
		System.out.println("Q1: How do you wake up in the morning?");
		System.out.println("a. Good"); //+1 Mario
		System.out.println("b. Bad"); //+1 Link
		System.out.println("c. Indifferent"); //+1 Kirby
		System.out.println("d. Excited"); //+1 Pikachu
		System.out.println("");
		
		String answerOne = answerMe.nextLine(); //accepts string as values
		
		if (answerOne.equalsIgnoreCase("A")) {
			mario++; //add point to mario variable
		}else if (answerOne.equalsIgnoreCase("B")) {
			link++;  //add point to link
		}else if (answerOne.equalsIgnoreCase("C")) {
			kirby++; // add point to kirby
		}else if (answerOne.equalsIgnoreCase("D")) {
			pikachu++; // add point to pikachu
			//@Prblm: when anything is inputed besides the key inputs, point is given to pikachu variable by default
		}while (!answerOne.equalsIgnoreCase("A")
				&& !answerOne.equalsIgnoreCase("B")
				&& !answerOne.equalsIgnoreCase("C")
				&& !answerOne.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerOne = answerMe.nextLine();
		}
		
		questionTwo(answerMe, mario, kirby, link, pikachu); 
	}
	
	public static void questionTwo(Scanner answerMe, int mario, int kirby, int link, int pikachu) {
		
		System.out.println("");
		System.out.println("Q2: Which color do you prefer?");
		System.out.println("a. Red"); //+1 Mario
		System.out.println("b. Green"); //+1 Link
		System.out.println("c. Pink"); //+1 Kirby
		System.out.println("d. Yellow"); //+1 Pikachu
		System.out.println("");
		
		String answerTwo = answerMe.nextLine();
			
		if (answerTwo.equalsIgnoreCase("A")) {
			mario++;
		}else if (answerTwo.equalsIgnoreCase("B")) {
			link++;
		}else if (answerTwo.equalsIgnoreCase("C")) {
			kirby++;
		}else if (answerTwo.equalsIgnoreCase("D")) {
			pikachu++; 
		}while (!answerTwo.equalsIgnoreCase("A")
				&& !answerTwo.equalsIgnoreCase("B")
				&& !answerTwo.equalsIgnoreCase("C")
				&& !answerTwo.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerTwo = answerMe.nextLine();
		}
		
		questionThree(answerMe, kirby, mario, pikachu, link);
	}
	
	public static void questionThree (Scanner answerMe, int kirby, int mario, int pikachu, int link) {
		
		System.out.println("");
		System.out.println("Q3. Which Nintendo series do you prefer?");
		System.out.println("a. Fire Emblem"); //+1 Link
		System.out.println("b. Star Fox"); //+1 Mario
		System.out.println("c. Animal Crossing"); //+1 Kirby
		System.out.println("d. Earthbound"); //+1 Pikachu
		System.out.println("");
		
		String answerThree = answerMe.nextLine();
		
		if (answerThree.equalsIgnoreCase("A")) {
			link++;
		}else if (answerThree.equalsIgnoreCase("B")) {
			mario++;
		}else if (answerThree.equalsIgnoreCase("C")) {
			kirby++;
		}else if (answerThree.equalsIgnoreCase("D")) {
			pikachu++;
		}while (!answerThree.equalsIgnoreCase("A")
				&& !answerThree.equalsIgnoreCase("B")
				&& !answerThree.equalsIgnoreCase("C")
				&& !answerThree.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerThree = answerMe.nextLine();
		}
		
		questionFour(answerMe, kirby, link, mario, pikachu);
	}
	
	public static void questionFour(Scanner answerMe, int kirby, int link, int mario, int pikachu) {
		
		System.out.println("");
		System.out.println("Q4. What type of music do you prefer?");
		System.out.println("a. Classic rock"); //+1 Mario
		System.out.println("b. Electronic"); //+1 Pikachu 
		System.out.println("c. Pop"); //+1 Kirby
		System.out.println("d. Country"); //+1 Link
		System.out.println("");
		
		String answerFour = answerMe.nextLine();
		
		if (answerFour.equalsIgnoreCase("A")) {
			mario++;
		}else if (answerFour.equalsIgnoreCase("B")) {
			pikachu++;
		}else if (answerFour.equalsIgnoreCase("C")) {
			kirby++;
		}else if (answerFour.equalsIgnoreCase("D")) {
			link++;
		}while (!answerFour.equalsIgnoreCase("A")
				&& !answerFour.equalsIgnoreCase("B")
				&& !answerFour.equalsIgnoreCase("C")
				&& !answerFour.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerFour = answerMe.nextLine();
		}
		
		questionFive(answerMe, link, kirby, pikachu, mario);
	}
	
	public static void questionFive(Scanner answerMe, int link, int kirby, int pikachu, int mario) {
		
		System.out.println("");
		System.out.println("Q5: If you were deserted on an island, what would you bring?");
		System.out.println("a. Sword"); //+1 Link
		System.out.println("b. Significant other"); //+1 Mario
		System.out.println("c. Fishing pole"); //+1 Kirby
		System.out.println("d. Ketchup"); //+1 Pikachu
		System.out.println("");
		
		String answerFive = answerMe.nextLine();
		
		if (answerFive.equalsIgnoreCase("A")) {
			link++;
		}else if (answerFive.equalsIgnoreCase("B")) { 
			mario++;
		}else if (answerFive.equalsIgnoreCase("C")) {
			kirby++;
		}else if (answerFive.equalsIgnoreCase("D")) {
			pikachu++;
		}while (!answerFive.equalsIgnoreCase("A")
				&& !answerFive.equalsIgnoreCase("B")
				&& !answerFive.equalsIgnoreCase("C")
				&& !answerFive.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerFive = answerMe.nextLine();
		}
		
		questionSix(answerMe, pikachu, mario, link, kirby);
	}
	
	public static void questionSix(Scanner answerMe, int pikachu, int mario, int link, int kirby) {
		
		System.out.println("");
		System.out.println("Q6: What is your favorite subject?");
		System.out.println("a. Programming"); //+1 Pikachu
		System.out.println("b. Metal Works"); //+1 Mario
		System.out.println("c. Mythology"); //+1 Link
		System.out.println("d. Culinary"); //+1 Kirby
		System.out.println("");
		
		String answerSix = answerMe.nextLine();
		
		if (answerSix.equalsIgnoreCase("A")) {
			pikachu++;
		}else if (answerSix.equalsIgnoreCase("B")) {
			mario++;
		}else if (answerSix.equalsIgnoreCase("c")) {
			link++;
		}else if (answerSix.equalsIgnoreCase("d")) {
			kirby++;
		}while (!answerSix.equalsIgnoreCase("A")
				&& !answerSix.equalsIgnoreCase("B")
				&& !answerSix.equalsIgnoreCase("C")
				&& !answerSix.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerSix = answerMe.nextLine();
		}
		
		questionSeven (answerMe, kirby, pikachu, mario, link);	
	}
	
	public static void questionSeven (Scanner answerMe, int kirby, int pikachu, int mario, int link) {
		
		System.out.println("");
		System.out.println("Q7: Which is your ideal vacation location?");
		System.out.println("a. Dreamland"); //+1 Kirby
		System.out.println("b. Cinnabar Island"); //+1 Pikachu
		System.out.println("c. Isle Delfino"); //+1 Mario
		System.out.println("d. Death Mountain"); //+1 Link
		System.out.println("");
		
		String answerSeven = answerMe.nextLine();
		
		if (answerSeven.equalsIgnoreCase("A")) {
			kirby++;
		}else if (answerSeven.equalsIgnoreCase("B")) {
			pikachu++;
		}else if (answerSeven.equalsIgnoreCase("C")) {
			mario++;
		}else if (answerSeven.equalsIgnoreCase("D")) {
			link++;
		}while (!answerSeven.equalsIgnoreCase("A")
				&& !answerSeven.equalsIgnoreCase("B")
				&& !answerSeven.equalsIgnoreCase("C")
				&& !answerSeven.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerSeven = answerMe.nextLine();
		}
		
		questionEight(answerMe, kirby, link, mario, pikachu);
	}
	
	public static void questionEight (Scanner answerMe, int kirby, int link, int mario, int pikachu) {
		
		System.out.println("");
		System.out.println("Q8: What do you prefer to do in your free time?");
		System.out.println("a. Eat"); //+1 Kirby
		System.out.println("b. Work"); //+1 Link
		System.out.println("c. Party"); //+1 Mario
		System.out.println("d. Sleep"); //+1 Pikachu
		System.out.println("");
		
		String answerEight = answerMe.nextLine();
		
		if (answerEight.equalsIgnoreCase("A")) {
			kirby++;
		}else if (answerEight.equalsIgnoreCase("B")) {
			link++;
		}else if (answerEight.equalsIgnoreCase("C")) {
			mario++;
		}else if (answerEight.equalsIgnoreCase("D")) {
			pikachu++;	
		}while (!answerEight.equalsIgnoreCase("A")
				&& !answerEight.equalsIgnoreCase("B")
				&& !answerEight.equalsIgnoreCase("C")
				&& !answerEight.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerEight = answerMe.nextLine();
		}
		
		questionNine(answerMe, mario, link, kirby, pikachu);
	}
	
	public static void questionNine(Scanner answerMe, int mario, int link, int kirby, int pikachu) {
		
		System.out.println("");
		System.out.println("Q9: What general time of day do you prefer?");
		System.out.println("a. Morning"); //+1 Mario
		System.out.println("b. Twilight"); //+1 Link
		System.out.println("c. Night"); //+1 Kirby
		System.out.println("d. Afternoon"); //+1 Pikachu
		System.out.println("");
		
		String answerNine = answerMe.nextLine();
		
		if (answerNine.equalsIgnoreCase("A")) {
			mario++;
		}else if (answerNine.equalsIgnoreCase("B")) {
			link++;
		}else if (answerNine.equalsIgnoreCase("C")) {
			kirby++;
		}else if (answerNine.equalsIgnoreCase("D")) {
			pikachu++;
		}while (!answerNine.equalsIgnoreCase("A")
				&& !answerNine.equalsIgnoreCase("B")
				&& !answerNine.equalsIgnoreCase("C")
				&& !answerNine.equalsIgnoreCase("D")) {
				System.out.print("Enter A, B, C, or D: ");
				answerNine = answerMe.nextLine();
		}
		
		results(answerMe, mario, kirby, link, pikachu);
	}
	
	public static void results (Scanner answerMe, int mario, int kirby, int link, int pikachu) {
		//prints results
		
		answerMe.close();
		
		if (mario > kirby
				&& mario > link
				&& mario > pikachu) {
			System.out.println("You are Mario from the Super Mario series!");
		}else if (pikachu > mario
				&& pikachu > link
				&& pikachu > kirby) {
			System.out.println("You are Pikachu from the Pokemon series!");
		}else if (kirby > pikachu
				&& kirby > mario
				&& kirby > link) {
			System.out.println("You are Kirby from the Kirby series!");
		}else{ System.out.println("You are Link from the Legend of Zelda series!");
		}
	}
}
