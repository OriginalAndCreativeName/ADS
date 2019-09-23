import java.util.ArrayList;

public class PatternMaker {
	private final static String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String makePattern(String in) {
		ArrayList<Character> prevChars = new ArrayList<Character>();
		String out="";
		for(int i=0; i<in.length(); i++) {
			Character currentCharacter = in.charAt(i);
			if(!prevChars.contains(currentCharacter)) {
				prevChars.add(currentCharacter);
				out+= LETTERS.charAt(prevChars.size()-1);
			}
			else {
				out += LETTERS.charAt(prevChars.indexOf(currentCharacter));
			}
		}
		return out;
	}
	public static void main(String args[]) {
		System.out.println(makePattern("cat"));
		System.out.println(makePattern("moon"));
		System.out.println(makePattern("where"));
		System.out.println(makePattern("baboon"));
		System.out.println(makePattern("mississippi"));

		System.out.println(makePattern("Cat"));
		System.out.println(makePattern("Moon"));
		System.out.println(makePattern("Where"));
		System.out.println(makePattern("Baboon"));
		System.out.println(makePattern("MIssissippi"));
		
		System.out.println(makePattern("CATEcate"));
		System.out.println(makePattern("Moon"));
		System.out.println(makePattern("Where"));
		System.out.println(makePattern("Baboon"));
		System.out.println(makePattern("MIssissippi"));

	}
}
