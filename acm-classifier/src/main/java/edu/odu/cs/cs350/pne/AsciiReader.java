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


 /*We are going to be implementing a bufferReader instead of utilizing a byte array for this for prope
  * security of our code so that there woun't be any future problems to be spotted.
  Will copy the contents of the current ascii file into a new file, and will use the logic of using a byte array into using a bufferReader instead.
  Test 1 will focus on creating the new file
  Test 2 will focus on making sure that the file has content within them and is not empty
  Test 3 will be focusing making sure that the IOException function is working (seems to be quite tied with Test 2)
  Test 4 will be focusing  on checking if the file's path is correct (this will be subjected to change)
  Test 5 will focus on the output of the file
  And this will be implemented within the document class.
  */