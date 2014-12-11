import java.util.*;
import java.io.*;
/*
 * 
 * Reads info in pokemon_list.txt and separates like info into respective array
 * 
 * 
 */
public class PokemonReader {

	protected File pokemonList;
	//reads the file
	public PokemonReader(String filePath){
		this.pokemonList = new File (filePath);
	}
	
	//counts number of lines
	Scanner fileReader = new Scanner("src/pokemon_list.txt");
	int lineCount = 0;{
	while (fileReader.hasNextLine()) {
		lineCount++;
		fileReader.nextLine();
	}
	fileReader.close();
	//creates array based on number of lines
	String[] pokeDex = new String[lineCount];
	String[] name = new String[lineCount];
	String[] hp = new String[lineCount];
	String[] attack = new String[lineCount];
	String[] defense = new String[lineCount];
	String[] spAttack = new String[lineCount];
	String[] spDefense = new String[lineCount];
	String[] speed = new String[lineCount];
	String[] typeOne = new String[lineCount];
	String[] typeTwo = new String[lineCount];

	//separates line into different arrays 
	int i = 0;
	try {
		fileReader = new Scanner (this.pokemonList);
		
		while(fileReader.hasNextLine()){
			
			pokeDex[i] = fileReader.next();
			
			name[i] = fileReader.next();
			
			hp[i] = fileReader.next();
			
			attack[i] = fileReader.next();
			
			defense[i] = fileReader.next();
		
			spAttack[i] = fileReader.next();
			
			spDefense[i] = fileReader.next();
			
			speed[i] = fileReader.next();
			
			typeOne[i] = fileReader.next();
			
			typeTwo[i] = fileReader.next();
			
			i++;
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	fileReader.close();
	
	}
}