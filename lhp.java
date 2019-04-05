import java.util.Scanner;

public class lhp {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want:");
	    int rows = sc.nextInt();
		
	    // Lower half

		
				 for (int i= rows-1; i >= 1; i--) 
			     {
			
					 for (int j = 1; j <= i; j++)
			         {
			             System.out.print(j+"");
			         }
					 System.out.println();
			     }
	}

}
