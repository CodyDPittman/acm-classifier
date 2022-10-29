package edu.odu.cs.cs350.pne;
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