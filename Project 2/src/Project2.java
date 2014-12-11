import java.util.*;
/**
 * @author Jonathan
 *
 */
public class Project2 {

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
		System.out.println("(You can enter either the word(s) or the letter.)");
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
		
		if (answerOne.equalsIgnoreCase("Good") || answerOne.equalsIgnoreCase("a")) {
			mario++; //add point to mario variable
		}else if (answerOne.equalsIgnoreCase("Bad") || answerOne.equalsIgnoreCase("b")) {
			link++;  //add point to link
		}else if (answerOne.equalsIgnoreCase("Indifferent") || answerOne.equalsIgnoreCase("c")) {
			kirby++; // add point to kirby
		}else if (answerOne.equalsIgnoreCase("Excited") || answerOne.equalsIgnoreCase("d")) {
			pikachu++; // add point to pikachu
			//@Prblm: when anything is inputed besides the key inputs, point is given to pikachu variable by default
		}else{ answerOne.equals(""); //solves the pikachu point problem (to a certain degree)
		}
		
		questionTwo(answerMe, mario, kirby, link, pikachu); 
	}
	
	public static void questionTwo(Scanner answerMe, int mario, int kirby, int link, int pikachu) {
		
		System.out.println("");
		System.out.println("Q2: Which color do you prefer?");
		System.out.println("1. Red"); //+1 Mario
		System.out.println("2. Green"); //+1 Link
		System.out.println("3. Pink"); //+1 Kirby
		System.out.println("4. Yellow"); //+1 Pikachu
		System.out.println("");
		
		String answerTwo = answerMe.nextLine();
			
		if (answerTwo.equalsIgnoreCase("Red") || answerTwo.equalsIgnoreCase("a")) {
			mario++;
		}else if (answerTwo.equalsIgnoreCase("Green") || answerTwo.equalsIgnoreCase("b")) {
			link++;
		}else if (answerTwo.equalsIgnoreCase("Pink") || answerTwo.equalsIgnoreCase("c")) {
			kirby++;
		}else if (answerTwo.equalsIgnoreCase("Yellow") || answerTwo.equalsIgnoreCase("d")) {
			pikachu++; 
		}else{ answerTwo.equals("");
		}
		
		questionThree(answerMe, kirby, mario, pikachu, link);
	}
	
	public static void questionThree (Scanner answerMe, int kirby, int mario, int pikachu, int link) {
		
		System.out.println("");
		System.out.println("Q3. Which Nintendo series do you prefer?");
		System.out.println("1. Fire Emblem"); //+1 Link
		System.out.println("2. Star Fox"); //+1 Mario
		System.out.println("3. Animal Crossing"); //+1 Kirby
		System.out.println("4. Earthbound"); //+1 Pikachu
		System.out.println("");
		
		String answerThree = answerMe.nextLine();
		
		if (answerThree.equalsIgnoreCase("Fire Emblem") || answerThree.equalsIgnoreCase("a")) {
			link++;
		}else if (answerThree.equalsIgnoreCase("Star Fox") || answerThree.equalsIgnoreCase("b")) {
			mario++;
		}else if (answerThree.equalsIgnoreCase("Animal Crossing") || answerThree.equalsIgnoreCase("c")) {
			kirby++;
		}else if (answerThree.equalsIgnoreCase("Earthbound") || answerThree.equalsIgnoreCase("d")) {
			pikachu++;
		}else{ answerThree.equals("");
		}
		
		questionFour(answerMe, kirby, link, mario, pikachu);
	}
	
	public static void questionFour(Scanner answerMe, int kirby, int link, int mario, int pikachu) {
		
		System.out.println("");
		System.out.println("Q4. What type of music do you prefer?");
		System.out.println("1. Classic rock"); //+1 Mario
		System.out.println("2. Electronic"); //+1 Pikachu 
		System.out.println("3. Pop"); //+1 Kirby
		System.out.println("4. Country"); //+1 Link
		System.out.println("");
		
		String answerFour = answerMe.nextLine();
		
		if (answerFour.equalsIgnoreCase("Classic rock") || answerFour.equalsIgnoreCase("a")) {
			mario++;
		}else if (answerFour.equalsIgnoreCase("Electronic") || answerFour.equalsIgnoreCase("b")) {
			pikachu++;
		}else if (answerFour.equalsIgnoreCase("Pop") || answerFour.equalsIgnoreCase("c")) {
			kirby++;
		}else if (answerFour.equalsIgnoreCase("Country") || answerFour.equalsIgnoreCase("d")) {
			link++;
		}else{ answerFour.equals("");
		}
		
		questionFive(answerMe, link, kirby, pikachu, mario);
	}
	
	public static void questionFive(Scanner answerMe, int link, int kirby, int pikachu, int mario) {
		
		System.out.println("");
		System.out.println("Q5: If you were deserted on an island, what would you bring?");
		System.out.println("1. Sword"); //+1 Link
		System.out.println("2. Significant other"); //+1 Mario
		System.out.println("3. Fishing pole"); //+1 Kirby
		System.out.println("4. Ketchup"); //+1 Pikachu
		System.out.println("");
		
		String answerFive = answerMe.nextLine();
		
		if (answerFive.equalsIgnoreCase("Sword") || answerFive.equalsIgnoreCase("a")) {
			link++;
		}else if (answerFive.equalsIgnoreCase("Significant other") || answerFive.equalsIgnoreCase("b")) { 
			mario++;
		}else if (answerFive.equalsIgnoreCase("Fishing pole") || answerFive.equalsIgnoreCase("c")) {
			kirby++;
		}else if (answerFive.equalsIgnoreCase("Ketchup") || answerFive.equalsIgnoreCase("d")) {
			pikachu++;
		}else{ answerFive.equals("");
		}
		
		questionSix(answerMe, pikachu, mario, link, kirby);
	}
	
	public static void questionSix(Scanner answerMe, int pikachu, int mario, int link, int kirby) {
		
		System.out.println("");
		System.out.println("Q6: What is your favorite subject?");
		System.out.println("1. Programming"); //+1 Pikachu
		System.out.println("2. Metal Works"); //+1 Mario
		System.out.println("3. Mythology"); //+1 Link
		System.out.println("4. Culinary"); //+1 Kirby
		System.out.println("");
		
		String answerSix = answerMe.nextLine();
		
		if (answerSix.equalsIgnoreCase("Programming") || answerSix.equalsIgnoreCase("a")) {
			pikachu++;
		}else if (answerSix.equalsIgnoreCase("Metal Works") || answerSix.equalsIgnoreCase("b")) {
			mario++;
		}else if (answerSix.equalsIgnoreCase("Mythology") || answerSix.equalsIgnoreCase("c")) {
			link++;
		}else if (answerSix.equalsIgnoreCase("Culinary") || answerSix.equalsIgnoreCase("d")) {
			kirby++;
		}else{ answerSix.equals("");
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
		
		if (answerSeven.equalsIgnoreCase("Dreamland") || answerSeven.equalsIgnoreCase("a")) {
			kirby++;
		}else if (answerSeven.equalsIgnoreCase("Cinnabar Island") || answerSeven.equalsIgnoreCase("b")) {
			pikachu++;
		}else if (answerSeven.equalsIgnoreCase("Isle Delfino") || answerSeven.equalsIgnoreCase("c")) {
			mario++;
		}else if (answerSeven.equalsIgnoreCase("Death Mountain") || answerSeven.equalsIgnoreCase("d")) {
			link++;
		}else{ answerSeven.equals("");
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
		
		if (answerEight.equalsIgnoreCase("Eat") || answerEight.equalsIgnoreCase("a")) {
			kirby++;
		}else if (answerEight.equalsIgnoreCase("Work") || answerEight.equalsIgnoreCase("b")) {
			link++;
		}else if (answerEight.equalsIgnoreCase("Party") || answerEight.equalsIgnoreCase("c")) {
			mario++;
		}else if (answerEight.equalsIgnoreCase("Sleep") || answerEight.equalsIgnoreCase("d")) {
			pikachu++;	
		}else{answerEight.equals("");
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
		
		if (answerNine.equalsIgnoreCase("Morning") || answerNine.equalsIgnoreCase("a")) {
			mario++;
		}else if (answerNine.equalsIgnoreCase("Twilight") || answerNine.equalsIgnoreCase("b")) {
			link++;
		}else if (answerNine.equalsIgnoreCase("Night") || answerNine.equalsIgnoreCase("c")) {
			kirby++;
		}else if (answerNine.equalsIgnoreCase("Afternoon") || answerNine.equalsIgnoreCase("d")) {
			pikachu++;
		}else{answerNine.equals("");
		}
		
		results(answerMe, mario, kirby, link, pikachu);
	}
	
	public static void results(Scanner answerMe, int mario, int kirby, int link, int pikachu) {

  //Prints final results of questionnaire
 
		answerMe.close(); //close scanner
		if (mario > link && mario > kirby && mario > pikachu) { //mario has highest points
			System.out.println("You are Mario from the Super Mario series!");
		}else if (link > mario && link > kirby && link > pikachu) { //link has highest points
			System.out.println("You are Link from the Legend of Zelda series!");
		}else if (kirby > link && kirby > mario && kirby > pikachu) { //kirby has highest points
			System.out.println("You are Kirby from the Kirby series!");
		}else if  (pikachu > mario && pikachu > link && pikachu > kirby) { //pikachu has highest points
			System.out.println("You are Pikachu from the Pokemon series!");
		}else if (pikachu == kirby && mario == link) { //in case of unforeseen input error
			System.out.println("ERROR: YOU broke this survey.");
		}else if (pikachu == link && mario == kirby) {
			System.out.println("ERROR: YOU broke this survey.");
		}else if (kirby == pikachu && mario == link) {
			System.out.println("ERROR: YOU broke this survey.");
		}else{ pikachu = mario = link = kirby;
			System.out.println("ERROR: YOU broke this survey."); }
	}
}

		