package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 

public class AsciiInput {

    private static final String FileName = "C:\\test\\test.txt";

    /*May use public Object addFile(String filename) if needed */
    public String addFile(String filename) {
        return FileName;
    }

    public void ReadToFile(){
    try(BufferedReader br = new BufferedReader(new FileReader(FileName))) {
        String  currLine;
        while((currLine = br.readLine()) != null){
            System.out.println(currLine);
        }
        
    } catch (Exception e) {

        // TODO: handle exception
    }


    }

     

    
    
}
