package edu.odu.cs.cs350.pne;

/* does not work, com.spire.pdf is a paid for service, will find a different solution
import com.spire.pdf.*;  
import com.spire.pdf.PdfPageBase;  
import java.io.*;  
public class pdfInput{
	public static void main(String input) {
		//String input = "Sample.pdf";  
        //Load the PDF file  
        PdfDocument pdf = new PdfDocument();  
        pdf.loadFromFile(input);  
        
        PdfPageBase page;  
        for (int i = 0; i < pdf.getPages().getCount(); i++) {  
            page = pdf.getPages().get(i);  
            String text = page.extractText(true); 
            String[] arr = text.split(" ");
            for ( String ss : arr) {
                System.out.println(ss);
            }
        }
	}
}
*/

//Importing the Java FileInputStream & File classes  
import java.io.FileInputStream;
import java.nio.file.Path;
import java.io.File;  


//Importing the required classes of Apache POI   
import org.apache.tika.metadata.Metadata;  
import org.apache.tika.sax.BodyContentHandler;  
import org.apache.tika.parser.pdf.PDFParser;  
import org.apache.tika.parser.ParseContext;  

import java.util.logging.Logger;


/*
import org.apache.tika.exception.TikaException;  
import org.apache.tika.metadata.Metadata;  
import org.apache.tika.parser.ParseContext;  
import org.apache.tika.parser.pdf.PDFParser;  
import org.apache.tika.sax.BodyContentHandler;  
import org.xml.sax.SAXException;  

import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.text.PDFTextStripper; 
import org.apache.pdfbox.text.PDFTextStripperByArea;
*/

//import org.apache.tika.parser.pdf;
//main class  
/*
public class pdfInput   
{  
	private static final Logger LOG = Logger.getLogger(pdfInput.class.getName());
	//Main method  
	public String[] readPDFInput(String argsv) throws Exception  
	{  
		//Creating an object of the BodyContentHandler class  
		BodyContentHandler cHandler = new BodyContentHandler();  
		//Creating a file object  
		File infile = new File(argsv);  
		//Create a FileInputStream object on  
		//the path specified using the created file object file  
		FileInputStream input = new FileInputStream(infile);  
		//Creating an object of the type Metadata  
		Metadata mData = new Metadata();  
		//Creating an object of the ParseContext class  
		ParseContext pContext = new ParseContext();  
		//creating an object of the class PDFParser  
		PDFParser parser = new PDFParser();  
		//calling the parse() method using the   
		//object of the PDFParser class  
		parser.parse(input, cHandler, mData, pContext);  
		//Displaying the contents   
		//of the pdf file by invoking the toString() method  
		String text = cHandler.toString();  
		//LOG.info("Extracting the contents from the file: \n" + cHandler.toString());  
		
		text=text.trim();
		String[] arr = text.split(" ");
		String ss;
		LOG.info("arr length: " + arr.length);
        for (int i=0; i<arr.length; i++ ) {
        	ss= arr[i].trim();
        	arr[i]=ss;
        	LOG.info("word: " + ss);//I have it printing right now, but I can have it output these strings pretty easily
        }
         // this above is my favorite one, cannot get it to work due to issues with imports of rog.apache.tika. I have no idea why it doesn't work.
        
        //splitting the text into individual words
        return arr;
        
        
        /*
        PDDocument document = PDDocument.load(new File("test.pdf"));
        if (!document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            System.out.println("Text:" + text);
        }
        document.close();
         
		String[] fail=new String[1];
		fail[0]="failed";
        return fail;
        */
/*
	}  
	/*
	public static void otherPDFInput(String[] args) throws IOException, SAXException, TikaException {  
        BodyContentHandler handler   = new BodyContentHandler();  
        PDFParser parser             = new PDFParser();  
        Metadata metadata            = new Metadata();  
        ParseContext pcontext        = new ParseContext();  
        try (InputStream stream = AutoDetectParseExample.class.getResourceAsStream("javatpoint.pdf")) {  
               parser.parse(stream, handler, metadata, pcontext);  
        System.out.println("Document Content:" + handler.toString());  
        System.out.println("Document Metadata:");  
        String[] metadatas = metadata.names();   
        for(String data : metadatas) {  
            System.out.println(data + ":   " + metadata.get(data));    
        }  
        }catch(Exception e) {System.out.println("Exception message: "+ e.getMessage());}  
      }  
      */
/*	
}  
*/
