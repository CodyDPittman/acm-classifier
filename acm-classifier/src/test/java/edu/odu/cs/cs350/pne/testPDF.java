package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class testPDF{
	
@Test
public void testPDFInput() throws Exception {
	
	
	String argsIn, chocIn;
	String choco[] = new String[1];
	choco[0]="chocolate";
	argsIn = "C:/Users/admir/git/acm-classifier/acm-classifier/src/main/java/edu/odu/cs/cs350/pne/sample.pdf";
	chocIn = "C:/Users/admir/git/acm-classifier/acm-classifier/src/main/java/edu/odu/cs/cs350/pne/chocolate.pdf";
	pdfInput input = new pdfInput();
	
	
	String  waterlooTest="My, my, at Waterloo, Napoleon did surrender"
			+ "Oh-yeah (oh-yeah), and I have met my destiny in quite a similar way"
			+ "The history book on the shelf"
			+ "Is always repeating itself"
			+ "Waterloo, I was defeated, you won the war"
			+ "Waterloo, promise to love you forever more"
			+ "Waterloo, couldn't escape if I wanted to"
			+ "Waterloo, knowing my fate is to be with you"
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo"
			+ "My, my, I tried to hold you back but you were stronger"
			+ "Oh-yeah (oh-yeah), and now it seems my only chance is giving up the fight"
			+ "And how could I ever refuse?"
			+ "I feel like I win when I lose"
			+ "Waterloo, I was defeated, you won the war"
			+ "Waterloo, promise to love you for ever more"
			+ "Waterloo, couldn't escape if I wanted to"
			+ "Waterloo, knowing my fate is to be with you"
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo"
			+ "So how could I ever refuse?"
			+ "I feel like I win when I lose"
			+ "Waterloo, couldn't escape if I wanted to"
			+ "Waterloo, knowing my fate is to be with you"
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo"
			+ "Ooh-ooh-ooh, waterloo, knowing my fate is to be with you"
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo"
			+ "Ooh-ooh-ooh, waterloo";
	String[] arr = waterlooTest.split(" ");
	
	//assertEquals(input.readPDFInput(chocIn), choco);
	assertEquals(input.readPDFInput(argsIn), arr);
	
	
}
@Test
public void test1wordPDFInput() throws Exception {
	
	
	String argsIn, chocIn;
	String choco[] = new String[1];
	String out[] = new String[1];
	choco[0]="chocolate";
	
	chocIn = "C:/Users/admir/git/acm-classifier/acm-classifier/src/main/java/edu/odu/cs/cs350/pne/chocolate.pdf";
	pdfInput input = new pdfInput();
	out = input.readPDFInput(chocIn);
	
	for ( String ss : out) {
        System.out.println(ss);//I have it printing right now, but I can have it output these strings pretty easily
    }
	
	assertEquals(out, choco);
	
	
}


	
	
}