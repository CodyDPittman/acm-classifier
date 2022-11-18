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
        
    }
    //create an asci reader
    //create a file withh known content
    // and assert that you have the files in the known content.

}
    
    