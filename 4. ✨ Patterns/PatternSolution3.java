
public class PatternSolution3 {

	public static void main(String[] args) {
		/*			J0	1	2	3
		 * 		0 I	❤️	❤️	❤️	❤️
		 * 		
		 * 		1	❤️			❤️
		 *      
		 * 		2	❤️			❤️
		 * 			
		 * 		3	❤️	❤️	❤️	❤️
		 * 
		 * 		
		 * 
		 * Let's Print This
   
   * 
		 * 
		 * */
		int n=12;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==0 || j==0 || i==n-1 ||j==n-1) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
		
	}

}
