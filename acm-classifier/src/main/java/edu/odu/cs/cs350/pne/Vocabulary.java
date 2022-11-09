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
	
	public void addWord(String word, int wordFrequency) {
		
		//Checking to see if the word exists
		if(vocabMap.get(word) == null)
		{
			vocabMap.put(word, wordFrequency);
		}
		else
		vocabMap.computeIfPresent(word, (k,v) -> v+1); //If word exists then update the word's frequency
	}
	
}