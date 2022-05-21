// SWASTIK PATTERN.
public class Pattern_Swastik {

	public static void main(String[] args) {
		int n=9; // number of row or column.
		int mid=(n+1)/2;  // To find the mid of the row or column
		//This for loop is used for the row.
		for(int i=1 ; i<=n ; i++) {
			// This is used for the column.
			for(int j=1 ; j<=n ; j++) {
				// Checks the condition for the printing of the swastik pattern 
				if( j==mid || i==mid || (i==1 && j>mid) || (i<= mid && j==1) || (i == n && j<=mid) || (i>= mid && j==n))
					System.out.print("*");
					//prints the astric(*) where there is necessary
				else
					System.out.print(" ");
					//leaves the space where required.
			}
			System.out.println();
		}
		
		

	}

}
