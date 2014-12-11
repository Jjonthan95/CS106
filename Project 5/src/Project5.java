import java.util.Scanner;
/**
 * 
 * Program reads file will all pokemon data, reorganizes in order with the request of User
 * @author Jonathan
 *
 */
public class Project5 {

	/**
	 * @param takes in User input for organization
	 * Main method.
	 */
	public static void main(String[] args) {
		
		Scanner userRequest = new Scanner(System.in);
		//ask for and accepts User input
		System.out.println("How would you like the pokemon organized?");
		System.out.println("(Enter: Pokedex, name, HP, Attack, Defense, Sp Attack, Sp Defense, Speed, Type 1, or Type 2)");
		String orderRequest = userRequest.nextLine();
		
		userRequest.close();
	}
}
