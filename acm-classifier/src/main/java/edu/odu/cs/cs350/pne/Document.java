package edu.odu.cs.cs350.pne;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

public class Document extends Vocabulary{
    Vector<Integer> rawSignatures;
    String signatureFile = ("rawSignatures.txt");

    public Document() {

    }

    public Document(String signatureFile) {

    }

    public Vector<Integer> getRawSig() {

        return rawSignatures;
    }
    
}
