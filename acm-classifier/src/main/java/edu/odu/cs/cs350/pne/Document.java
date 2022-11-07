package edu.odu.cs.cs350.pne;

import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

public class Document extends Vocabulary{
    public Vector<Integer> rawSignatures;
    String signatureFile = ("rawSignatures.txt");

    public Document() {

    }

    public Document(String signatureFile) {

    }

    public Vector<Integer> getRawSig() {
        Map<String, Integer> rawSig = new HashMap<String, Integer>();

        for(Map.Entry<String, Integer> set : rawSig.entrySet()) {
            rawSignatures.add(set.getValue());
        }

        /*Iterator<Entry<String, Integer>> new_iIterator = vocabMap.entrySet().iterator();

        while(new_iIterator.hasNext()) {
            rawSignatures.add(new_iIterator.getValue());
        }*/

        return rawSignatures;
    }
    
}
