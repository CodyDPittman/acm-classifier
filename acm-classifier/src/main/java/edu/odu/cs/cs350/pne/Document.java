package edu.odu.cs.cs350.pne;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class Document extends Vocabulary{
    //public Document() throws Exception {

    //}
    Document() {

    }
    // A vector of the values from the HashMap
    Vector<Integer> rawSignature;

    // File to write the raw signatures to
   

    /*public Vector<Integer> rawSignatures() throws IOException {
        // "Iterates" through the HashMap values and writes them to the text file
        for(Enumeration<Integer> e = rawSignature.elements(); e.hasMoreElements();) {
            writeToFile.write(e.nextElement());
            writeToFile.close();
        }
        return rawSignature;
    }*/
}
