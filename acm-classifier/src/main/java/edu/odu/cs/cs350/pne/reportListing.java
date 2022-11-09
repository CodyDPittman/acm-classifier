package edu.odu.cs.cs350.pne;

import java.util.logging.Logger;

public class reportListing extends Document
{  
	
	
	
	private static final Logger LOG = Logger.getLogger(pdfInput.class.getName());
	//Main method  
	
	public String listingReport() //inputs will really be a document class type
	{  
		
		Scores[] reportScores = new Scores[11];
		for (int k=0;k<11; k++)
		{
			reportScores[k].setClassification(k);
			reportScores[k].setScore(Math.random());
		}
		
		for (int i = 0; i < reportScores.length; i++) {
			 
            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < reportScores.length; j++) {
 
                // Checking elements
                Scores temp;
                if (reportScores[j].getScore() < reportScores[i].getScore()) {
 
                    // Swapping
                    temp = reportScores[i];
                    reportScores[i] = reportScores[j];
                    reportScores[j] = temp;
                }
            }
		}
            
		String reportData="";
		
		for(int l=0; l<11; l++)
		{
			reportData = reportData + reportScores[l].getClassification() + " score: " + reportScores[l].getScore();
		}
		LOG.info(reportData);
		return reportData;
	}
}


