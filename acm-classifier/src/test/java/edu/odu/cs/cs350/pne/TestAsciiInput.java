package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Currency;

public class TestAsciiInput{

    private static final String FileName = "C:\\test\\test.txt";

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
    }

    

