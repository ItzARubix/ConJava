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
		
		int arraySize = theInput.length;
		Object[] theOutput = new Object[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static boolean[] revArray (boolean[] theInput) {
		
		int arraySize = theInput.length;
		boolean[] theOutput = new boolean[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static byte[] revArray (byte[] theInput) {
		
		int arraySize = theInput.length;
		byte[] theOutput = new byte[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static short[] revArray (short[] theInput) {
		
		int arraySize = theInput.length;
		short[] theOutput = new short[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static int[] revArray (int[] theInput) {
		
		int arraySize = theInput.length;
		int[] theOutput = new int[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static long[] revArray (long[] theInput) {
		
		int arraySize = theInput.length;
		long[] theOutput = new long[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static float[] revArray (float[] theInput) {
		
		int arraySize = theInput.length;
		float[] theOutput = new float[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static double[] revArray (double[] theInput) {
		
		int arraySize = theInput.length;
		double[] theOutput = new double[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
	public static char[] revArray (char[] theInput) {
		
		int arraySize = theInput.length;
		char[] theOutput = new char[arraySize];
		for(int i = 0; i<arraySize; i++) {
			theOutput[i] = theInput[arraySize-i-1];
		}
		return theOutput;
		
	}
	
}
