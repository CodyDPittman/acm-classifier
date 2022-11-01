package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestVocabulary{
	
@Test
public void testVocab() {
	Vocabulary vocab = new Vocabulary("Software");
	assertEquals(vocab.getSubArea(), "Software");
	Vocabulary vocab2 = new Vocabulary();
	assertEquals(vocab2.getSubArea(), "");
}

@Test
public void testAddWord() {
	Vocabulary vocab = new Vocabulary("Software");
	vocab.addWord("program", 1);
	vocab.addWord("package", 1);
	vocab.addWord("compiler",1);
	assertEquals(vocab.vocabMap.get("program"), 1);
	assertEquals(vocab.vocabMap.get("package"), 1);
	assertEquals(vocab.vocabMap.get("compiler"), 1);
	vocab.addWord("program", 1);
	//assertEquals(vocab.vocabMap.get("program"), 2);
	
}


	
	
}