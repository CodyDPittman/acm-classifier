package edu.odu.cs.cs350.pne;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.Metadata;  
import org.apache.tika.sax.BodyContentHandler;  
import org.apache.tika.parser.pdf.PDFParser;  
import org.apache.tika.parser.ParseContext;  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.logging.Logger;

public class Librarian extends Document{
	Vector<Document> docs = new Vector<Document>();
	
	public void main() throws Exception
	{
		boolean running=true;
		//int counting=0;
		Document thisDoc= new Document();
		while (running) {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input file name or type done to end");
		
		
		
		String fileLoc = reader.readLine();
		if(fileLoc.toLowerCase().equals("done"))
		{
			running=false;
			continue;
		}//definitely not the best way to exit this loop, but it should be fine
		String fileType = fileLoc.substring(fileLoc.length()-4, fileLoc.length());
		System.out.println(fileType);
		
		if (fileType.equals(".pdf"))
		{
			thisDoc.readPDFInput(fileLoc);
		}
		else if(fileType.equals(".txt"))
		{
			thisDoc.readAsciiText(fileLoc);
			//for the ascii reader
		}
		docs.add(thisDoc);
		
		//counting++;
		}
		String reportLine;
		File outFile = new File("C:/Users/admir/git/acm-classifier/acm-classifier/src/test/data/outFile.txt");
		PrintWriter DataOut = new PrintWriter(outFile);
		for(int j=0; j<docs.size();j++)
		{
			reportLine= docs.elementAt(j).listingReport();
			
			
				DataOut.print(reportLine);
				DataOut.print("\n");

		}
		DataOut.close();
	}




}