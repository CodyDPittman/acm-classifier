package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;


public class TestDocument {
    @Test
    public void testRawSig() throws IOException {
        Document doc = new Document();

        doc.addWord("computer", 1);
        doc.addWord("computer", 1);
        doc.addWord("science", 1);
        doc.addWord("text", 1);
        doc.addWord("text", 1);

        assertEquals(doc.rawSignatures().get(0), 2);
    }
}
