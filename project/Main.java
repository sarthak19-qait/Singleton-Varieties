package project;

public class Main {
 public static void main(String[] args) {
	 Eager ob = Eager.instance;
	 ob.display();
	 Lazy ob2 = Lazy.getInstance();
	 ob2.display();
	 Thread ob3 = Thread.getInstance();
	 ob3.display();
 }
}
