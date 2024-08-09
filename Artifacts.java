import java.io.*;
import java.util.*;

public class Artifacts {

	public static ArrayList<Object> buildArrayList (Object[] theInput) {
		ArrayList<Object> theOutput = new ArrayList<Object>();
		for(int i = 0; i<theInput.length; i++) {
			theOutput.add(theInput[i]);
		}
		return theOutput;
	}
	
	public static String revdStr(String theInput) {
		
		String theOutput = "";
		for(int i = theInput.length()-1; i>=0; i--) {
			theOutput+=theInput.charAt(i);
		}
		return theOutput;
		
	}
	
	public static Object[] revdArr (Object[] theInput) {
		
		int arraySize = theInput.length;
		Object[] theOutput = new Object[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static boolean[] revdArr (boolean[] theInput) {
		
		int arraySize = theInput.length;
		boolean[] theOutput = new boolean[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static byte[] revdArr (byte[] theInput) {
		
		int arraySize = theInput.length;
		byte[] theOutput = new byte[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static short[] revdArr (short[] theInput) {
		
		int arraySize = theInput.length;
		short[] theOutput = new short[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static int[] revdArr (int[] theInput) {
		
		int arraySize = theInput.length;
		int[] theOutput = new int[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static long[] revdArr (long[] theInput) {
		
		int arraySize = theInput.length;
		long[] theOutput = new long[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static float[] revdArr (float[] theInput) {
		
		int arraySize = theInput.length;
		float[] theOutput = new float[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static double[] revdArr (double[] theInput) {
		
		int arraySize = theInput.length;
		double[] theOutput = new double[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static char[] revdArr (char[] theInput) {
		
		int arraySize = theInput.length;
		char[] theOutput = new char[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
}
