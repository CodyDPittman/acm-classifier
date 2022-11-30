package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class AsciiInput {

    private static final String FileName ="C:\\Users\\alber\\OneDrive\\Desktop\\acmClassifier\\acm-classifier\\acm-classifier\\src\\main\\java\\edu\\odu\\cs\\cs350\\pne\\example.txt";

    /*May use public Object addFile(String filename) if needed */
    public String addFile(String filename) {
        return FileName;
    }

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader(FileName))) {
        String  currLine;
        while((currLine = br.readLine()) != null){
            System.out.println(currLine);
        }
        
    } catch (Exception e) {
        e.printStackTrace();

        // TODO: handle exception
    



    }
}

     

    
    
}
