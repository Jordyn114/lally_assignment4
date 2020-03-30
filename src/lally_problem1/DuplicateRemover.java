package lally_problem1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

public class DuplicateRemover{
	
	static Set<String> uniqueWords = new HashSet<String>();
	
	public static void remove(File dataFile) {
		
	      try{	  
	    	  String line;
	    	  BufferedReader br = new BufferedReader(new FileReader(dataFile));
	    	  while((line = br.readLine()) != null) {    
	              String string[] = line.toLowerCase().split(" ");     
	              for(String s : string){
	            	  uniqueWords.add(s); 
	              }
	          }
	    	  br.close();
	    	  
	      } catch(IOException ie) {
	    	  System.out.println("Error while reading the file");
	      }
	   }
	
	public static void write(File outputFile) {
		try {
			PrintWriter writer = new PrintWriter("unique_words.txt");
			writer.print(uniqueWords);
			writer.close();
			System.out.println("Unique words printed to unique_words.txt");
		} catch(IOException ie) {
			System.out.println("\nError while writing the file");
		}
	}
}