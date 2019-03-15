public class Student {

	//Java Program to demonstrate the use of parameterized constructor  
	
	    int id;  
	    String name;  
	    
	    //creating a parameterized constructor  
	    
	    
	    Student(int i,String n){  
	    id = i;  
	    name = n;  
	    
	    System.out.println(" ID is "+ id + " AND "+ " NAME IS "+ n);
	    }  

	    public static void main(String[] args) {
		//creating objects and passing values  
	    Student s1 = new Student(111,"Karan");  
	    Student s2 = new Student(222,"Aryan");  
	     
	 
	}

}
