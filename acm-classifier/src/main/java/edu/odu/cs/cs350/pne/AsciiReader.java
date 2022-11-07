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

        catch(IOException except){

            /*printing out the error */


            except.printStackTrace();

        }

        String stringContent = new String(ascii);
        return stringContent;




        


    }

    public static void main(String[] args)throws IOException{
        /*the print statement will be used to print out the example ASCII file */
        /*System.out.print(null);*/

    }
}




/*Public static void main(String[] args)
 * throws IOException{
 * 
 * 
 * }
 */