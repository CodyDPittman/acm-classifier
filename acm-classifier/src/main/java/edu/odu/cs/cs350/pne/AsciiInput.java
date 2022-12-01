package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
 

public class AsciiInput {

    private static final String FileName ="C:\\Users\\alber\\OneDrive\\Desktop\\acmClassifier\\acm-classifier\\acm-classifier\\src\\main\\java\\edu\\odu\\cs\\cs350\\pne\\asciinput.txt";

    
    /*May use public Object addFile(String filename) if needed */
     public String addFile(String filename) {
        return FileName;
     }
    
   public static void main (String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new FileReader(FileName))) {
        String  currLine;
        while((currLine = br.readLine()) != null){
            System.out.println(currLine);
        }
        
    } catch (Exception e) {
        e.printStackTrace();

        // TODO: handle exception
    



    } /* */


    
}

public void ReadTxt() throws FileNotFoundException {
Scanner keyboard = new Scanner(System.in);
String filenametxt = keyboard.nextLine();
File file = new File(filenametxt);
Scanner inputFile = new Scanner(new File(filenametxt));
while(inputFile.hasNext()){
    System.out.println(inputFile.nextLine());
}
}


}


    

     

    

