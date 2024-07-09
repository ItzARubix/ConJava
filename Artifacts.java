import java.io.*;

public class Artifacts {

	public static String revString(String theInput) {

		String theOutput = "";
		for(int i = theInput.length()-1; i>=0; i--) {
			theOutput+=theInput.charAt(i);
		}
		return theOutput;

	}

	public static Object[] revArray (Object[] theInput) {

		//Method only works with objects, arrays like int[] won't work, unfortunately
		int arraySize = theInput.length;
		Object[] theOutput = new Object[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;

	}

}
