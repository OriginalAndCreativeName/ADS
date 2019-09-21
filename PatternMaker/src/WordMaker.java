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
				word=Character.toString(newChar);
			}
		}
		else {
			if(makingWord) {
				makingWord=false;
				word+=newChar;
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
}
