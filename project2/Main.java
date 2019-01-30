package project2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int c=0;
		Scanner scan = new Scanner(System.in);
		ComputerFactory cfactoy = ComputerFactory.getInstance(); 
		do {
		 try {
			 System.out.println("Enter type of Computer");
				String ctype = scan.next();
				Computer computer=cfactoy.getComputer(ctype);
				computer.createComputer();
		 }
		 catch(NullPointerException e) {
			 System.out.println("Entered Type is not supported..");
			 
		 }
		 finally{
			 System.out.println("Press 1 to continue..");
			 c=scan.nextInt();
		 }
		}while(c==1);
		scan.close();

	}

}
