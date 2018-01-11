
public class pig_latin {

	public void pig_latin(String word) {
		char[] pig = new char[word.length() + 2];
		// Add all characters from original 
		// second character onwards
		for (int i = 0; i < word.length()-1; i++) {
			pig[i] = word.charAt(i+1);
		}
		pig[word.length()-1] = word.charAt(0);
		pig[word.length()] = 'a';
		pig[word.length()+1] = 'y';
		
		String answer = new String(pig);
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		pig_latin pig = new pig_latin();
		String test = "James";
		pig.pig_latin(test);
	}

}
