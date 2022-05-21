// SWASTIK PATTERN.
public class Pattern_Swastik {

	public static void main(String[] args) {
		int n=9;
		int mid=(n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if( j==mid || i==mid || (i==1 && j>mid) || (i<= mid && j==1) || (i == n && j<=mid) || (i>= mid && j==n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		

	}

}
