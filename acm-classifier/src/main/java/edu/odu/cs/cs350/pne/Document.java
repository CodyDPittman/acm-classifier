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

import java.util.logging.Logger;

public class Document extends Scores{
    public Vector<Integer> rawSignatures;
    String signatureFile = ("rawSignatures.txt");

    public Document() {

    }

    public Document(String signatureFile) {

    }
    //private double genLit, hardware, compSysOrg, software, data, theoryComp, mathComp, infSys, compMeth, compApp, compMil;// the scores for each category.
    

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
    
    private static final Logger LOG = Logger.getLogger(Document.class.getName());
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
	}
	

	//Main method  
	
	public String listingReport() //inputs will really be a document class type
	{  
		Scores emptyScore0 =new Scores();
		Scores emptyScore1 =new Scores();
		Scores emptyScore2 =new Scores();
		Scores emptyScore3 =new Scores();
		Scores emptyScore4 =new Scores();
		Scores emptyScore5 =new Scores();
		Scores emptyScore6 =new Scores();
		Scores emptyScore7 =new Scores();
		Scores emptyScore8 =new Scores();
		Scores emptyScore9 =new Scores();
		Scores emptyScore10 =new Scores();
		
		Scores[] reportScores = new Scores[11];
		reportScores[0] = emptyScore0;
		reportScores[1] = emptyScore1;
		reportScores[2] = emptyScore2;
		reportScores[3] = emptyScore3;
		reportScores[4] = emptyScore4;
		reportScores[5] = emptyScore5;
		reportScores[6] = emptyScore6;
		reportScores[7] = emptyScore7;
		reportScores[8] = emptyScore8;
		reportScores[9] = emptyScore9;
		reportScores[10] = emptyScore10;
		
		
		String test = ""+reportScores.length;
		LOG.info(test);
		for (int k=0;k<reportScores.length; k++)
		{
			//reportScores[k].classification = "none";
			//reportScores[k].score =0; 
			reportScores[k].setClassification(k);
			reportScores[k].setScore(Math.random());
		}
		
		//the above is primarily to generate the data, will be removed for final version
		
		for (int i = 0; i < reportScores.length; i++) {
			 
            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < reportScores.length; j++) {
 
                // Checking elements
                Scores temp;
                if (reportScores[j].getScore() >= reportScores[i].getScore()) {
 
                    // Swapping
                    temp = reportScores[i];
                    reportScores[i] = reportScores[j];
                    reportScores[j] = temp;
                }
            }
		}
            
		
		int x=1;
		for (int m=1; m<reportScores.length;m++)
		{
			if (reportScores[m].getScore()>reportScores[0].getScore()-(reportScores[0].getScore()*.05))
			{
				x++;
			}
		}
		
		String reportData="";
		
		for(int l=0; l<x; l++)
		{
			reportData = reportData + reportScores[l].getClassification() + " score: " + reportScores[l].getScore()+"\n";
		}
		LOG.info(reportData);
		return reportData;
	}
	
	public void MultiplelistingReport(int docs) throws Exception //inputs will really be document class types ex: Document Arr[]
	{
		File outFile = new File("C:/Users/admir/git/acm-classifier/acm-classifier/src/test/data/outFile.txt");
		PrintWriter DataOut = new PrintWriter(outFile);
		
		for (int i=0; i< docs; i++)
		{
			DataOut.print(this.listingReport());
			DataOut.print("\n");
		}
		DataOut.close();
	}
    
}
