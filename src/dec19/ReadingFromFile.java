/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *
 * @author LoneStar
 */
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException{
        File fileToRead = new File("semestersOver.txt"); 
        
        if(fileToRead.exists())
        {
           Scanner scanner = new Scanner(fileToRead);  
           
           //loop over file and display tp console 
           while(scanner.hasNext()){
               System.out.print(scanner.nextLine());
           }
           scanner.close(); 
           
        }
        else
        {
            System.err.printf("That file name doesnt exist");
        }
    }
}
