import java.util.*;

public class MainClass {

   public static void main(String[] args){
   
	 Scanner sc = new Scanner(System.in);

	 System.out.println("How many rows you want:");
	 int rows = sc.nextInt();
	 
	 for (int i = 1; i <= rows; i++) 
     {
         for (int j = 1; j <= i; j++)
         {
             System.out.print(j+"");
         }
          
         System.out.println();
     }
   
   
   
   
   }
	
	
   
  
   
   
   
    
   
   
   
   

}
