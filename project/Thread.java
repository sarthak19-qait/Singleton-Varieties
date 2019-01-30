package project;

public class Thread  
{ 
  
  private static Thread instance; 
  
  private Thread()  
  { 
    
  } 
  public void display() {
	  System.out.println("Thread display");
  }

  synchronized public static Thread getInstance()  
  { 
    if (instance == null)  
    { 
       
      instance = new Thread(); 
    } 
    return instance; 
  } 
} 
