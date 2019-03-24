// Example of overridding


public class Method_loading {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Method_loading obj = new Method_loading();
		
		
		
		// int
		
		obj.add(2, 3);
		
		// double
		obj.add(2.5, 3.5);
		
		//strings
		
		obj.add("HELLO","STUDENT");
	
	
	}


   public void add (int a, int b){
	   
	   System.out.println("OUTPUT:  "+(a+b));
	   
   }

   public void add (double a, double b){
	   
	   System.out.println("OUTPUT:  "+(a+b));
	   
   }

   public void add (String a , String b){
	   
	   System.out.println("OUTPUT: "+(a+b));
	   
   }
   





}
