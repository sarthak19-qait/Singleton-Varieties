package project;

public class Lazy  
{ 
  
  private static Lazy instance; 
  
  private Lazy()  
  { 
    
  } 
  
  public void display() {
	  System.out.println("Lazy Display");
  }
  
  
  public static Lazy getInstance()  
  { 
    if (instance == null)  
    { 
        instance = new Lazy(); 
    } 
    return instance; 
  } 
} 
