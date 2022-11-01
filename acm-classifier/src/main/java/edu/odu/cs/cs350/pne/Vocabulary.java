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
		vocabMap.put(word, wordFrequency);
	}
	
}