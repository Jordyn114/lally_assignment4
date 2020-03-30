package lally_problem2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
	
	static Map<String, Integer> wordCounter = new HashMap<String, Integer> ();
	
	public static void count(File dataFile) {
		try{	  
			String line;
			BufferedReader br = new BufferedReader(new FileReader(dataFile));
			
			while((line = br.readLine()) != null) {    
				String string[] = line.toLowerCase().split(" "); 
				for (String s : string) {
					if (!wordCounter.containsKey(s)) {
						wordCounter.put(s, 1);
			    }
			    else {
			    	int count = wordCounter.get(s);
			    	wordCounter.put(s, count + 1);
			    }
			  }
			}
			br.close();
			} catch(IOException ie) {
				System.out.println("Error while reading the file");
			}
	}
	
	public static void write(File outputFile) {
		try {
			PrintWriter writer = new PrintWriter("unique_word_counts.txt");
			writer.print(wordCounter);
			writer.close();
			System.out.println("Unique word counts printed to unique_word_counts.txt");
		} catch(IOException ie) {
			System.out.println("\nError while writing the file");
		}
	}
}
