package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.logging.Logger;

public class TestReportListing{
	private static final Logger LOG = Logger.getLogger(pdfInput.class.getName());
	
@Test
public void testPDFInput() throws Exception {
	
	reportListing input= new reportListing(); 
	String output = input.listingReport();
	assertEquals(output, output);
	
	
}
	
	
}