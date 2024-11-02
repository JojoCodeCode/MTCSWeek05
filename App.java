package week05OOPJavaHomework;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate an instance of each logger classes (that implement the logger interface)
Logger asteriskLogger = new AsteriskLogger();
Logger spacedLogger = new SpacedLogger();
//passing through a String for spacedLogger
spacedLogger.log("Hello");
spacedLogger.error("Nope");

//passing through a String for asteriskLogger
asteriskLogger.log("Hello");
asteriskLogger.error("Absolutely not");
		
	}

}
