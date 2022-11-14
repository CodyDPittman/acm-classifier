package edu.odu.cs.cs350.pne;

import java.util.logging.Logger;

public class Scores extends Vocabulary  
{  
	String classification="none";
	double score=0;
	public Scores()
	{
		classification="none";
		score=0;
	}
	public void setClassification(int input)
	{
		switch (input)
		{
		case 0:
			classification = "General Literature";
			break;
		case 1:
			classification = "Hardware";
			break;
		case 2:
			classification = "Computer systems organization";
			break;
		case 3:
			classification = "Software";
			break;
		case 4:
			classification = "Data";
			break;
		case 5:
			classification = "Theory of Computation";

			break;
		case 6:
			classification = "Mathematics of Computing";
			break;
		case 7:
			classification = "Information Systems";
			break;
		case 8:
			classification = "Computing and Methodologies";
			break;
		case 9:
			classification = "Computer Applications";
			break;
		case 10:
			classification = "Computing Milieux";
			break;
		}
		
	}
	public void setScore(double inScore)
	{score = inScore;}
	
	public String getClassification() {return classification;}
	public double getScore() {return score;}
	}