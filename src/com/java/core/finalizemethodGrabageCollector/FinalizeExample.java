package com.java.core.finalizemethodGrabageCollector;

public class FinalizeExample {
	   public static void main(String[] args)     
	    {     
	        FinalizeExample obj = new FinalizeExample();        
	        // printing the hashcode   
	        System.out.println("Hashcode is: " + obj.hashCode());           
	        obj = null;    

	        System.gc();     
	        System.out.println("End of the garbage collection"+obj); 
	        
	        
	        
	    }     
	   protected void finalize()     
	    {     
	        System.out.println("Called the finalize() method");     
	    }   
}
