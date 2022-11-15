package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.logging.Logger;

public class testPDF{
	private static final Logger LOG = Logger.getLogger(Document.class.getName());
	
@Test
public void testPDFInput() throws Exception {
	
	
	String argsIn, chocIn;
	//String choco[] = new String[1];
	//choco[0]="chocolate";
	argsIn = "C:/Users/admir/git/acm-classifier/acm-classifier/src/test/data/sample.pdf";
	//chocIn = "C:/Users/admir/git/acm-classifier/acm-classifier/src/test/data/chocolate.pdf";
	Document input = new Document();
	
	
	String  waterlooTest="My, my, at Waterloo, Napoleon did surrender "
			+ "Oh-yeah (oh-yeah), and I have met my destiny in quite a similar way "
			+ "The history book on the shelf "
			+ "Is always repeating itself "
			+ "Waterloo, I was defeated, you won the war "
			+ "Waterloo, promise to love you forever more "
			+ "Waterloo, couldn't escape if I wanted to "
			+ "Waterloo, knowing my fate is to be with you "
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo "
			+ "My, my, I tried to hold you back but you were stronger "
			+ "Oh-yeah (oh-yeah), and now it seems my only chance is giving up the fight "
			+ "And how could I ever refuse? "
			+ "I feel like I win when I lose "
			+ "Waterloo, I was defeated, you won the war "
			+ "Waterloo, promise to love you for ever more "
			+ "Waterloo, couldn't escape if I wanted to "
			+ "Waterloo, knowing my fate is to be with you "
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo "
			+ "So how could I ever refuse? "
			+ "I feel like I win when I lose "
			+ "Waterloo, couldn't escape if I wanted to "
			+ "Waterloo, knowing my fate is to be with you "
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo "
			+ "Ooh-ooh-ooh, waterloo, knowing my fate is to be with you "
			+ "Wa-wa-wa-wa, waterloo, finally facing my waterloo "
			+ "Ooh-ooh-ooh, waterloo";
	String[] arr = waterlooTest.split(" ");
	
	String ss;
	for (int i=0; i<arr.length; i++ ) {
    	ss= arr[i].trim();
    	arr[i]=ss;
    }

	String[] ark = input.readPDFInput(argsIn);
	LOG.info("test1: " + ark.length);
	for (int j=0; j<arr.length;j++)
	{
		assertEquals(ark[j], arr[j]);// the issue with this test is that it compares containers there
	}
	//assertEquals(ark, arr); //you cannot directly compare arrays, I tested and tried
	//assertEquals(input.readPDFInput(chocIn), choco);
	//assertEquals(input.readPDFInput(argsIn), arr);// the issue with this test is that it compares containers there
	
	
}
@Test
public void test1wordPDFInput() throws Exception {
	
	
	String argsIn, chocIn;
	String choco[] = new String[1];
	String out[] = new String[1];
	choco[0]="chocolate";
	
	chocIn = "C:/Users/admir/git/acm-classifier/acm-classifier/src/test/data/chocolate.pdf";
	Document input = new Document();
	out = input.readPDFInput(chocIn);
	String ss;
	for (int i=0; i<choco.length; i++ ) {
    	ss= choco[i].trim();
    	choco[i]=ss;
    }
	//LOG.info("test1: " + choco[0]);
	String test= "chocolate";
	String output = choco[0];
	
	assertEquals(test, output);
	
	
}


	
	
}