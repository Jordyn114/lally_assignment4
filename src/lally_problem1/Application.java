package lally_problem1;

import java.io.File;

public class Application {

	public static void main(String[] args) {
		
		File dataFile = new File("problem1.txt");
		File outputFile = new File("unique-words.txt");
		DuplicateRemover.remove(dataFile);
		DuplicateRemover.write(outputFile);

	}

}
