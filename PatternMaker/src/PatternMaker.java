import java.util.ArrayList;

public class PatternMaker {
	private final static String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String makePattern(String in) {
		ArrayList<Character> prevChars = new ArrayList<Character>();
		String out="";
		for(int i=0; i<in.length(); i++) {
			Character currentCharacter = Character.toLowerCase(in.charAt(i));
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



	}
}
