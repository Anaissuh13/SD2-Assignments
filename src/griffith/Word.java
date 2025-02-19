package griffith;

public class Word {
	private char[] letters;

	// Constructor that initializes the 'letters' array, ensuring it's never null
    public Word(char[] letters) {
    	this.letters = (letters != null) ? letters : new char[]{};
    }

    // Method to check if a specific character is present in the word
    public boolean contains(char symbol) {
    	for (char c : letters) {
            if (c == symbol) return true;
        }
        return false;
    }

    // Method to get the length of the word
    public int length() {
    	return letters.length;
    }

    // Method to retrieve the character array representing the word
    public char[] getLetters() {
        return letters;
    }
}
