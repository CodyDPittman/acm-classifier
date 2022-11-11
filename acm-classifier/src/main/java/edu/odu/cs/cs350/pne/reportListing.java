package edu.odu.cs.cs350.pne;

import java.util.logging.Logger;

public class reportListing extends Document
{  
	
	
	
	private static final Logger LOG = Logger.getLogger(pdfInput.class.getName());

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
}


