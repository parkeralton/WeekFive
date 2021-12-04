package weekFiveAssignment;

public class AsteriskLogger implements Logger{
	
	public void log(String log) {
		// puts our log message in between asterisks
		System.out.println("***"+log+"***");
	}

	public void error(String error) {
		// TODO Auto-generated method stub
		String errorLine = "***Error: " + error + "***"; 
		// puts our error message in between asterisk and "Error:
	
		int errorLineLength = errorLine.length();
		//determines length of the error message line to figure out 
		//how many asterisks are needed above and below
		StringBuilder astLine = new StringBuilder();//used to build asterisk lines
		
		for (int i=0; i<errorLineLength; i=i+1) {
			//used to build asterisk line
				astLine.append('*');
		}
		
		System.out.println(astLine);
		System.out.println(errorLine);
		System.out.println(astLine);
	}
	
	
}
