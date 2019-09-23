public class WordMaker {
	private String word= "";
	private boolean makingWord=true;
	public void reset() {
		word = "";
		makingWord=true;
	}
	public void addChar(char newChar) {
		
		if(Character.isAlphabetic(newChar)) {
			if(makingWord) {
				word+=newChar;
			}
			else {
				makingWord=true;
				word=Character.toString(newChar);
			}
		}
		else {
			if(makingWord&&newChar!='\'') {
				makingWord=false;
			}
		}
	}
	public boolean wordReady() {
		return !makingWord;
	}
	public String getWord(){
		if(wordReady()) {
			return word;
		}
		else {
			return "that wasn't supposed to happen";
		}
	}
	public static void main(String args[]) {
		WordMaker test = new WordMaker();
		test.addChar('A');
        test.addChar('A');
        test.addChar('A');
        test.addChar(' ');
        test.addChar('A');
        test.addChar('S');
        test.addChar('S');
        test.addChar('.');
        System.out.println(test.wordReady());
        test.addChar(' ');
        test.addChar(' ');
        test.addChar(' ');
        test.addChar(' ');
        test.addChar('A');
        test.addChar('S');
        test.addChar('S');
        test.addChar('\'');
        System.out.println(test.wordReady());
        test.addChar('\'');
        System.out.println(test.wordReady());
        System.out.println(test.getWord());

        test.addChar('.');
        System.out.println(test.getWord());
	}
}
