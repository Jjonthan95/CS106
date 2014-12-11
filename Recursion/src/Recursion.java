/**
 * 
 */

/**
 * @author Jonathan
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		numberLine(0, 1, 10);
		countSum(10, total);
	}
	
	public static void numberLine(int current, int next, int max){
		
		if (next <= max) {
			
			next++;
			current++;
			System.out.print(current + " ");
			numberLine(current, next, max);
			
		}else{
			System.out.println();
		}
		
		
	}
	
	
	public static void countSum (int max, int total) {
		
		if (max > 0) {
			
			total = total + max;
			
			countSum(max-1, total);
			System.out.print(total);
			
		}else{
				
		}
		
		
	}
}
