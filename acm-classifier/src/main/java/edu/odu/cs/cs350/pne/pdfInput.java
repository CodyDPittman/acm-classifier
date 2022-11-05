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
/*import java.io.FileInputStream;  
import java.io.File;  
//Importing the required classes of Apache POI   
import org.apache.tika.metadata.Metadata;  
import org.apache.tika.sax.BodyContentHandler;  
import org.apache.tika.parser.pdf.PDFParser;  
import org.apache.tika.parser.ParseContext;  
//main class  
public class ReadPDFFile   
{  
	//Main method  
	public static void pdfInput(String argvs[]) throws Exception  
	{  
		//Creating an object of the BodyContentHandler class  
		BodyContentHandler cHandler = new BodyContentHandler();  
		//Creating a file object  
		File infile = new File("K:/sample.pdf");  
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
		System.out.println("Extracting the contents from the file: \n" + ch.toString());  
		
		
		String[] arr = text.split(" ");
        for ( String ss : arr) {
            System.out.println(ss);//I have it printing right now, but I can have it output these strings pretty easily
        }
        //splitting the text into individual words
	}  
}  */
