package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestVocabulary{
	
@Test
public void testVocab() {
	Vocabulary vocab = new Vocabulary("Document X's Vocab");
	assertEquals(vocab.getDocVocab(), "Document X's Vocab");
	Vocabulary vocab2 = new Vocabulary();
	assertEquals(vocab2.getDocVocab(), "");
}

@Test
public void testAddWord() {
	Vocabulary vocab = new Vocabulary("Document X's Vocab");
	vocab.addWord("program", 1);
	vocab.addWord("package", 1);
	vocab.addWord("compiler",1);
	assertEquals(vocab.vocabMap.get("program"), 1);
	assertEquals(vocab.vocabMap.get("package"), 1);
	assertEquals(vocab.vocabMap.get("compiler"), 1);
	vocab.addWord("program", 1);
	assertEquals(vocab.vocabMap.get("program"), 2);
	
}


	
	
}