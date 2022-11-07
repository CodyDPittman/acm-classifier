package edu.odu.cs.cs350.pne;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class AsciiReader{
    static String readToString(String p){
        Path path = Paths.get(p);
        /*creating an empty byte array */
        byte[] ascii = {};


        try{
           /*storing all bytes into the array */
            ascii = Files.readAllBytes(path);
            
        }

        /*Catch block */

        catch(IOException e){

            /*printing out the error */


            e.printStackTrace();

        }

        String stringContent = new String(ascii);
        return stringContent;




        


    }
}




/*Public static void main(String[] args)
 * throws IOException{
 * 
 * 
 * }
 */