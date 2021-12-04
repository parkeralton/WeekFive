package weekFiveAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		// method to add spaced between characters
		int strLength = log.length();
		StringBuilder space = new StringBuilder();
		
		for (int i = 0; i < strLength; i=i+1) {
			//loop adds space after each char.
			space.append(log.charAt(i));
			space.append(' ');
		}
		
		space.deleteCharAt(space.length()-1);
		//delete last space added in loop
		
		System.out.println(space);
	}

	@Override
	public void error(String error) {
		// adds space between each character and also adds "error" in front
		
		int strLength = error.length();
		StringBuilder space = new StringBuilder();
		
		for (int i = 0; i < strLength; i=i+1) {
			//loop adds space after each character
			space.append(error.charAt(i));
			space.append(' ');
		}
		
		space.deleteCharAt(space.length()-1);//delete last space
		
		System.out.println("ERROR: " + space);
	
	}

	

}
