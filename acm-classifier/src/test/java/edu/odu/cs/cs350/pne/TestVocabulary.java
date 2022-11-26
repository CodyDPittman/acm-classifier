package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

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
public void testdocMapping() {
	Vocabulary vocab = new Vocabulary("Document X's Vocab");
	vocab.docMapping("program", 1);
	vocab.docMapping("package", 1);
	vocab.docMapping("compiler",1);
	assertEquals(vocab.vocabMap.get("program"), 1);
	assertEquals(vocab.vocabMap.get("package"), 1);
	assertEquals(vocab.vocabMap.get("compiler"), 1);
	vocab.docMapping("program", 1);
	assertEquals(vocab.vocabMap.get("program"), 2);
	
}

@Test
public void testaddWord() {
	
	Vocabulary vocab = new Vocabulary();
	vocab.addWord("program");
	vocab.addWord("computer");
	vocab.addWord("apple");
	assertEquals(vocab.collectiveVocab.toArray()[0], "apple");
	assertEquals(vocab.collectiveVocab.toArray()[1], "computer");
	assertEquals(vocab.collectiveVocab.toArray()[2], "program");
	
}

	
	
}