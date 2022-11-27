package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
}
