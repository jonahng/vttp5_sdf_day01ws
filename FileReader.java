import java.io.*;
import java.util.*;

public class FileReader{

    public static void main(String[] args){

        try{
            File myObj = new File("C:\\Users\\65932\\vttp5_sdf_day01ws\\try32.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String listItem = myReader.nextLine();
                System.out.println(listItem);
            }
    
        } catch(FileNotFoundException e){
            System.out.println("caught the filenotfound exception");
        }


    }
    
   

    
}
