public class Artifacts {

	public static String revString(String theInput) {

		String theOutput = "";
		for(int i = theInput.length()-1; i>=0; i--) {
			theOutput+=theInput.charAt(i);
		}
		return theOutput;

	}

}
