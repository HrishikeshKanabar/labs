package test;
import test.class_1;

public class class_2 {

	public static void main(String[] args) {
	  
      // Making object of class 1 
		
	  class_1 obj_1 =new class_1();
	  obj_1.printClass1();
	   
	  // Making object of class 2
	  
	  class_2 obj_2 = new class_2();
	  obj_2.printClass2();
			  

	}

   public void printClass2(){
	   
	   System.out.println("I am class 2");
   }


}
