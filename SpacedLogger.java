package week05OOPJavaHomework;

//Logger interface is implemented using the "implements" keyword.
public class SpacedLogger implements Logger{
	
//log method prints out a message with spaces in between each character.	
public void log(String message) {
	//instantiate an empty string
	String spacedMessage = "";
	//this loop cycles through each letter for the length of the word 
	//and adds a space in between each character.
	for (int i=0; i<message.length(); i++) {
		spacedMessage += message.charAt(i);
		if (i< message.length()-1);
		//here is the added space
		spacedMessage += " ";
	}

System.out.println(spacedMessage);
}


public void error(String message) {
	String spacedMessage2= "";
	for (int j=0; j<message.length(); j++) {
		spacedMessage2 += message.charAt(j);
		if (j<message.length()-1);
		spacedMessage2 += " ";
	}
//this one does the same as above but adds "ERROR: " in front of the message.
	System.out.println("ERROR: " + spacedMessage2);
}
}
