package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SystemTest{

    @Test
    public void testsystem() throws Exception{
    	
        Librarian libby = new Librarian();
        
        libby.main();
        
        
        //testing pdfs
        String argsIn, chocIn;
    	argsIn = "src/test/data/sample.pdf";
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
    	waterlooTest = waterlooTest.replace(",", "");
    	waterlooTest = waterlooTest.replace(".", "");
    	waterlooTest = waterlooTest.replace("!", "");
    	waterlooTest = waterlooTest.replace("?", "");
    	waterlooTest = waterlooTest.replace(":", "");
    	waterlooTest = waterlooTest.replace("-", " ");
    	waterlooTest = waterlooTest.replace("&", " and ");//replacing bad characters
    	
    	String[] arr = waterlooTest.split(" ");
    	
    	
    	String ss;
    	for (int i=0; i<arr.length; i++ ) {
        	ss= arr[i].trim();
        	ss=ss.toLowerCase();
        	arr[i]=ss;
        }

    	String[] ark = input.readPDFInput(argsIn);
    	for (int j=0; j<arr.length;j++)
    	{
    		assertEquals(ark[j], arr[j]);
    	}
        
    }

}
    
    