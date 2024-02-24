
public class PatternSolution4 {

	public static void main(String[] args) {
				
		/*			j=0
		 * 		i=0	* * * * *
		 * 			*		*
		 * 			* *	* * *n-1/2
		 * 			*		*
		 * 			*		*
		 * 
		 * */
		
		
		int n=10;
		for(int i=0; i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(i==0 || j==0 || i==(n-1)/2|| j==(n-1)/2) {
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
