package edu.odu.cs.cs350.pne;

import java.util.HashMap;

public class Vocabulary{
	
public String subArea;

HashMap<String,Integer> vocabMap = new HashMap<>();

	Vocabulary(){
		subArea = "";
	}

	Vocabulary(String subjectArea){
		subArea = subjectArea;
	}
	
	public String getSubArea() {
		return(subArea);
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