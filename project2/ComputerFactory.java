package project2;

public class ComputerFactory {
    private static ComputerFactory obj;
    private ComputerFactory() {
    	
    }
    public static ComputerFactory getInstance() {
    	if (obj==null)
    		obj = new ComputerFactory();
    	return obj;
    }
	public Computer getComputer(String com) {
		if(com.equalsIgnoreCase("server")) {
			return new Server();
		}
		else if(com.equalsIgnoreCase("pc")) {
			return new Pc();
		}
		return null;
	}

}
