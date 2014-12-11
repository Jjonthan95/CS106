
/*
 * extends PokemonReader. uses orderRequest from Project5.java to sort and print out file
 * 
 * 
 */
public class Output extends PokemonReader{
	
	
	public Output(String filePath) {
		super(filePath);
		
	}


	String orderRequest;{
		
	
	if (orderRequest.equalsIgnoreCase("pokedex")){
		System.out.println(pokeDex[].sort());
	}else if (orderRequest.equalsIgnoreCase("name")){
		System.out.println(name[].sort());
	}else if (orderRequest.equalsIgnoreCase("hp")){
		System.out.println(hp[].sort());
	}else if (orderRequest.equalsIgnoreCase("attack")){
		System.out.println(attack[].sort());
	}else if (orderRequest.equalsIgnoreCase("defense")){
		System.out.println(defense[].sort());
	}else if (orderRequest.equalsIgnoreCase("sp attack")){
		System.out.println(spAttack[].sort());
	}else if (orderRequest.equalsIgnoreCase("sp defense")){
		System.out.println(spDefense[].sort());
	}else if (orderRequest.equalsIgnoreCase("speed")){
		System.out.println(speed[].sort());
	}else if (orderRequest.equalsIgnoreCase("Type 1")){
		System.out.println(typeOne[].sort());
	}else{ orderRequest.equalsIgnoreCase("Type 2");
		System.out.println(typeTwo[].sort());
	}
}
}