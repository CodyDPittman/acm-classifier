package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.Map;
import java.util.Collection;
import org.apache.tika.metadata.Metadata;  
import org.apache.tika.sax.BodyContentHandler;  
import org.apache.tika.parser.pdf.PDFParser;  
import org.apache.tika.parser.ParseContext;  

import java.util.logging.Logger;

public class Document extends Scores{
	public Collection<Integer> values = vocabMap.values();
    public Vector<Integer> rawSignatures = new Vector<>(values);
    public Vector<Integer> normalizedSigs = new Vector<Integer>();
    String signatureFile = ("rawSignatures.txt");
    Vocabulary docVocab = new Vocabulary();
    
    
    
    public Document() {

    }

    public Document(String signatureFile) {

    }
    //private double genLit, hardware, compSysOrg, software, data, theoryComp, mathComp, infSys, compMeth, compApp, compMil;// the scores for each category.
    

    
    public Vector<Integer> getRawSig() {
        for(Map.Entry<String, Integer> set : vocabMap.entrySet()) {
            rawSignatures.add(set.getValue());
        }

        return rawSignatures;
    }
    
    
    public Vector<Integer> normalizeSignatures(Vector <Integer> unNormalizedRawSigs){
    	
    	for(int i = 0; i < unNormalizedRawSigs.size(); i++) {
    		if(unNormalizedRawSigs.get(i) >= 5) {
    			normalizedSigs.add(1);
    		}
    		else
    			normalizedSigs.add(0);
    	}
    	
    	return normalizedSigs;
    }
    
    //Pdf reader
    private static final Logger LOG = Logger.getLogger(Document.class.getName());
	
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
		text = text.replace(",", "");
		text = text.replace(".", "");
		text = text.replace("!", "");
		text = text.replace("?", "");
		text = text.replace(":", "");
		text = text.replace("-", " ");
		text = text.replace("&", " and ");//replacing bad characters
		
		
		
		String[] arr = text.split(" ");
		String ss;
		//LOG.info("arr length: " + arr.length);
        for (int i=0; i<arr.length; i++ ) {
        	ss= arr[i].trim();
        	ss=ss.toLowerCase();
        	arr[i]=ss;
        	//LOG.info("word: " + ss);//I have it printing right now, but I can have it output these strings pretty easily
        	
        	docVocab.docMapping(ss, 1);
        }
                 
        //splitting the text into individual words
        
        
        return arr;
	}
	

	//Producing a report, uses random scores right now 
	
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
		
		
		//String test = ""+reportScores.length;
		//LOG.info(test);
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
		File outFile = new File("src/test/data/outFile.txt");
		PrintWriter DataOut = new PrintWriter(outFile);
		
		for (int i=0; i< docs; i++)
		{
			DataOut.print(this.listingReport());
			DataOut.print("\n");
		}
		DataOut.close();
	}

	//This is where the AsciiInput function will be called
	private static final String FileName = "C:\\Users\\alber\\OneDrive\\Desktop\\acmClassifier\\acm-classifier\\acm-classifier\\src\\main\\java\\edu\\odu\\cs\\cs350\\pne\\asciinput.txt";
	//params of main function will change based on the other parameters used in the other functions
	//This will be accomplished by using function overloading.
	
	public String addFile(String filename) {
        return FileName;
    }
	public  void readAsciiText(String[] args){
		//used the try catch structure to prevent resource leak
		try(BufferedReader br = new BufferedReader(new FileReader(FileName));) {
			String currentLine;
			while((currentLine = br.readLine()) != null){
				System.out.println(currentLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
}
    

