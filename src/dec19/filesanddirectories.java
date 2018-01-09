package dec19;

import java.io.File;
import java.util.Scanner;


public class filesanddirectories {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter a file or a directory name:");
        analyzePath(keyboard.nextLine());
        
        
    }
    
    //this methos will tell us about theh string passed in as an argument by using it to create a file object 
    public static void analyzePath(String path){
        File fileToInspect = new File(path);
        
        if(fileToInspect.exists()){
            System.out.println("It was a valid path");
            System.out.println(fileToInspect.isDirectory()?"is a directory":"Is not a directory");
            System.out.println(fileToInspect.isFile()?"is a file":"Is not a file"); 
            System.out.println(fileToInspect.isAbsolute()?"Is absolute path":"Is not absolut path");
            System.out.println(fileToInspect.lastModified());
            System.out.println("Path" + fileToInspect.getPath());
            System.out.println("AbsolutePath:"+fileToInspect.getAbsolutePath());
            if(fileToInspect.isDirectory())
            {
                String[] directoryContents = fileToInspect.list(); 
                System.out.printf("%nDirectory Content");
                //enhanced for loops 
                for(String fileName : directoryContents)
                {
                    System.out.println(fileName);
                }
            }
        }
        else
        {
            System.out.print("It was not a valid path");
        }
    }
}
