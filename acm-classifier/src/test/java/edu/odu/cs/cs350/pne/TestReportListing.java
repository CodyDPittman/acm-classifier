package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.logging.Logger;

public class TestReportListing{
	private static final Logger LOG = Logger.getLogger(Document.class.getName());
	
@Test
public void testReportsInput() throws Exception {
	
	Document input= new Document(); 
	String output = input.listingReport();
	assertEquals(output, output);
	
	
}
@Test
public void testMultipleReportsInput() throws Exception {
	
	Document input= new Document(); 
	String output = "Abba";
	input.MultiplelistingReport(10);
	assertEquals(output, output);
	
	
}
	
}