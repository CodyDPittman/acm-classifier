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
import java.io.PrintWriter;
import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Replace;
 

public class AsciiInput {

    private static final String FileName ="C:\\Users\\alber\\OneDrive\\Desktop\\acmClassifier\\acm-classifier\\acm-classifier\\src\\main\\java\\edu\\odu\\cs\\cs350\\pne\\asciinput.txt";

    
    /*May use public Object addFile(String filename) if needed */
     public String addFile(String filename) {
        return FileName;
    }
    
    public static void ReadTxt () throws Exception {
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

/*public void ReadTxt() throws FileNotFoundException {
Scanner keyboard = new Scanner(System.in);
String filenametxt = keyboard.nextLine();
File file = new File(filenametxt);
Scanner inputFile = new Scanner(new File(filenametxt));
while(inputFile.hasNext()){
    System.out.println(inputFile.nextLine());
} 
} */


/*public String[] ReadTxt(String argsv) throws Exception{

    File file = new File(argsv);
    FileInputStream in = new FileInputStream(file);
    String textContent = in.toString();
    textContent = textContent.trim();
    textContent = textContent.replace(",", "");
    textContent = textContent.replace(".","");
    textContent = textContent.replace("!", "");
    textContent = textContent.replace("?", "");
    textContent = textContent.replace(":", "");
    textContent = textContent.replace("-"," ");
    textContent = textContent.replace("&", " and");
    String[] iter = textContent.split(" ");
    String string;

    for (int i=0; i<iter.length; i++ ) {
        string= iter[i].trim();
        string=string.toLowerCase();
        iter[i]=string;
        
    }
    return iter;
    

    
    /* */
//}

}






    

     

    

