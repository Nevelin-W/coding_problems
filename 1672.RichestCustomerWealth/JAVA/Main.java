// ONE ARRAY []
/* public class Main {

	public static void main(String[] args){

		int[] arr = { 1, 2, 3 };
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		System.out.println(sum);
	}
} */

//2D ARRAY [][] highest value array 
public class Main {

	public static void main(String[] args){

		int[][] arr = {{1,5},{2,7},{5,8}};
		int 
		
		wealth = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				
			}
			wealth = Math.max(sum, wealth);
			
			
		}
		System.out.println(wealth);
		
	}
}
