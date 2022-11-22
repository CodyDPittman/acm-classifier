package edu.odu.cs.cs350.pne;

import java.util.HashMap;

public class Vocabulary {
	
public String docVocab;

HashMap<String,Integer> vocabMap = new HashMap<>();

	Vocabulary(){
		docVocab = "";
	}

	Vocabulary(String docVocabName){
		docVocab = docVocabName;
	}
	
	public String getDocVocab() {
		return(docVocab);
	}
	
	/* This function creates an individual document 
	 * mapping that collects the words of the document
	 * along with their frequencies. This is NOT the collective
	 * vocabulary.
	 */
	public void docMapping(String word, int wordFrequency) {
		
		//Checking to see if the word exists
		if(vocabMap.get(word) == null)
		{
			vocabMap.put(word, wordFrequency);
		}
		else
		vocabMap.computeIfPresent(word, (k,v) -> v+1); //If word exists then update the word's frequency
	}
	
	/* This function creates a collective alphabetically sorted
	 * vocabulary for all documents that have been processed.
	 * 
	 */
	public void addWord(String word){
		
		
		
	}
}
