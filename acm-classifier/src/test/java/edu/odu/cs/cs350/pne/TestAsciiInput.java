package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Currency;
import java.util.Scanner;

public class TestAsciiInput{

    private static final String FileName = "C:\\Users\\alber\\OneDrive\\Desktop\\acmClassifier\\acm-classifier\\acm-classifier\\src\\main\\java\\edu\\odu\\cs\\cs350\\pne\\example.txt";

    @Test
    public void testaddFile(){
        AsciiInput input = new AsciiInput();
        input.addFile(FileName);
        assertThat(input.addFile(FileName), equalTo(FileName));
        

    }

    @Test
    public void testReadToFile(){
    AsciiInput reader = new AsciiInput();
    try(BufferedReader br = new BufferedReader(new FileReader(FileName))) {
        
    } catch (Exception e) {
        String currLine;
        e.printStackTrace();
        assertFalse(false);
        // TODO: handle exception
        
    }
       
    }

    @Test
    public void testUserInput(){
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       assertThat(input.toString(), contains("Enter your name:") != null);
    }

    @Test
    public void testReadTxt() throws FileNotFoundException{
        AsciiInput read = new AsciiInput();
        read.ReadTxt();
        try (Scanner keyboard = new Scanner(System.in)) {
            String fileName = keyboard.nextLine();
            assertEquals(keyboard.nextLine(), keyboard.nextLine());
        }
        AsciiInput notNull = new AsciiInput();
        assertNotNull(notNull);
        
    
    }

}

    

