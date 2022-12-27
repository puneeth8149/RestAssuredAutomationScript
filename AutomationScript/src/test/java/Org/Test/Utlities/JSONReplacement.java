package Org.Test.Utlities;

import java.util.regex.Pattern;

// input --> body data ( that is containing variable also), variableName, Variablevalue
// purpose --> replace the variablname with variablevaluein the body data string
// output --> after replacement this method will return the latest string that is contail variablevalue 
public class JSONReplacement {

	public static String JSONDataValidationReplacement(String completeBody, String variableName, String variableValue) {
		
		completeBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return completeBody;
	} 
}
