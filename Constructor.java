
public class Constructor {

	int num; 
	
	// This is constructor which assigns value to num
	   
	 Constructor() { 
	            
	    num = 100; 

	 } 
	 
	// Main function which calls printNum method

	 public static void main(String args[]) {
	        
		 Constructor obj = new Constructor();
		 obj.printNum();
		 
         
	                   
	 }
	 
	 // Method to print num variable

	public void printNum(){
		
		System.out.println(num);
		
	}	

}
