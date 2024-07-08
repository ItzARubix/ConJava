import java.io.*;

public class Artifacts {

	public static String revString(String theInput) {

		String theOutput = "";
		for(int i = theInput.length()-1; i>=0; i--) {
			theOutput+=theInput.charAt(i);
		}
		return theOutput;

	}

	public static <T> T[] revArray(T[] theInput) {

		int arraySize = theInput.length;
		T[] theOutput = new T[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i];
		}
		return theOutput;

	}

}
