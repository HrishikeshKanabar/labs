import java.util.HashMap;
import java.util.Map;
 
public class HashMapExample {
     
    public static void main(String[] args) {
       
    	Map<String,Integer> vehicles = new HashMap<String,Integer>();
    	
    	vehicles.put("BMW", 5);
    	vehicles.put("RR", 2);
    	vehicles.put("Audi", 1);
    	vehicles.put("Mercides", 3);
    	
    	System.out.println("Total vehicles: " + vehicles.size());
    	
    	
    	// Iterate over all vehicles, using the keySet method.
        for(String key:vehicles.keySet())
        
        System.out.println(key + " - " + vehicles.get(key));
        System.out.println();
    	
        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            
        	System.out.println("Found total " + vehicles.get(searchKey) + " "
                    + searchKey + " cars!\n");
        
        
         
        // Clear all values.
        vehicles.clear();
         
        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
 
        // The next statements throw a NullPointerException, if uncommented.
        // vehicles.put("Nissan", null);
        // vehicles.put(null, 6);
     
        
    }      
       
}