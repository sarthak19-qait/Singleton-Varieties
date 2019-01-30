package project;
public class Eager  
{ 
  
  public static Eager instance = new Eager(); 
  
  private Eager() 
  { 
	  
  } 
  public void display() {
	  System.out.println("Eager Display");
  }
} 