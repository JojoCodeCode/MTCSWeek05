package week05OOPJavaHomework;

//Logger interface is implemented using the "implements" keyword.
public class AsteriskLogger implements Logger {
	
	//log method prints out a message surrounded by astrisks
public void log(String message) {
	System.out.println("***" + message + "***");
}
//error method prints out a message surrounded by asterisks with error in front of it.
public void error(String message) {
	System.out.println("********************");
	System.out.println("***" + "Error: " + message + "***");
	System.out.println("********************");
}
}
