package edu.odu.cs.cs350.pne;

public class Vocabulary{
	
public String subArea;

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
		
	}
	
}