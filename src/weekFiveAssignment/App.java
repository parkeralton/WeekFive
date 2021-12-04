package weekFiveAssignment;

public class App {

	public static void main(String[] args) {
		// main method to test log and error methods

		Logger astlogger = new AsteriskLogger();//Asterisk logger method
		Logger spacelogger = new SpacedLogger();//Spaced logger method
		
		astlogger.error("Hello World");
		astlogger.log("Hello World");
		
		spacelogger.log("Hello World");
		spacelogger.error("Hello World");
	}

}
