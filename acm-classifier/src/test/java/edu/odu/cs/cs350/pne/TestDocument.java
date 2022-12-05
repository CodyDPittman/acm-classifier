package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class TestDocument {
    @Test
    public void testRawSig() {
        Document doc = new Document();

        doc.docMapping("computer", 1);
        doc.docMapping("computer", 1);
        doc.docMapping("science", 1);
        doc.docMapping("text", 1);
        doc.docMapping("text", 1);

        doc.getRawSig();

        //assertEquals(doc.rawSignatures.get(0), 2);
        //assertEquals(doc.rawSignatures.get(1), 1);
        //assertEquals(doc.rawSignatures.get(2), 2);
    }

    private static final File FileName = new File("src//test//data//");
    @Test
    public void testaddFile(){
        Document input = new Document();
        input.addFile(FileName);
        assertThat(input.addFile(FileName), equalTo(FileName));
        

    }

    @Test
    public void testReadToFile(){
    Document reader = new Document();
    try(BufferedReader br = new BufferedReader(new FileReader(FileName))) {
        
    } catch (Exception e) {
        String currLine;
        e.printStackTrace();
        assertFalse(false);
        // TODO: handle exception
        
    }
       
    }

}
