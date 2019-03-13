import java.util.Scanner;

public class Rectangle {


	public static void main(String[] args) {
	        
	        double length, width, area, perimeter;

	        // Create scanner class object
	        Scanner in = new Scanner(System.in);


	        // Input length and width of rectangle
	        System.out.print("Enter length of rectangle: ");
	        length = in.nextDouble();
	        
	        System.out.print("Enter width of rectangle: ");
	        width  = in.nextDouble();

	        
	        // making object 
	        
	        Rectangle obj = new Rectangle();
	        
	        // calling method
	        
	        double p = obj.perimeter(length, width);
	        double a =  obj.area(length, width);
	        
	        System.out.println("PERIMETER IS:"+ p);
	        System.out.println("AREA IS:"+ a);
	      
	    }
	

	   
	 // function to Calculate perimeter  of rectangle
	
       public double perimeter(double l , double w){
    	   
    	   double perimeter;       // double permieter =2*(l+w);
    	   
    	   perimeter= 2 * (l + w);
    	   
    	   return  perimeter;
    	   
       }

      
       // Calculate area of rectangle 
       
      public double area(double l, double w){
    	  
    	  double area =  l* w;       // double area = l*w;
   	   
    	  
    	  return area;
    	  
      }




}
