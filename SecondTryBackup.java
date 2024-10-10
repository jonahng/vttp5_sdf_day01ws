import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;

public class SecondTryBackup {

    
    
    public static void main(String[] args) throws IOException{
        
        menu();
        userInput();
    }




    public static void menu(){
        System.out.println("Hi this is your shopping cart, type list, add item, delete item, close to continue");
    }





    public static void userInput() throws IOException{
        String newFileName = "";
        List<String> stuffInCart = new ArrayList<>();
        Console console = System.console();
        String keyboardInput = "";
        while(!keyboardInput.equals("close")){
            keyboardInput =console.readLine("Type your command here:");
            keyboardInput = keyboardInput.toLowerCase();




            if(keyboardInput.equals("list")){
                if(stuffInCart.size() == 0){
                    System.out.println("Your grocery list is empty! type: add item Name to add your item");
                }else{
                for(String listItem : stuffInCart){
                    System.out.println(stuffInCart.indexOf(listItem)+1 + ". " + listItem);
                }
                }
            }

            if(keyboardInput.startsWith("add")){
                Scanner scan = new Scanner(keyboardInput.substring(4));
                while(scan.hasNext()){
                    String item = scan.next();
                    stuffInCart.add(item);
                }
                FileWriter myWriter = new FileWriter(newFileName);
                for(String item: stuffInCart){
                    myWriter.write(item + "\n");
                }
                myWriter.close();
                scan.close();
                

            }

            if(keyboardInput.startsWith("delete")){
                Scanner scan = new Scanner(keyboardInput.substring(7));

                while(scan.hasNext()){
                    stuffInCart.remove(scan.nextInt() - 1);
                    
                }
                scan.close();
            }

            if(keyboardInput.startsWith("path")){
                Scanner scan = new Scanner(keyboardInput.substring(4));
                    newFileName = "C:\\Users\\65932\\vttp5_sdf_day01ws\\" + scan.next() + ".txt";
                    File newFile = new File(newFileName);
                    newFile.createNewFile();
                    System.out.println("new file created! filename: " + newFile.getName());
/*                     FileWriter myWriter = new FileWriter(newFileName);
                    myWriter.write("Hello new file written");
                    myWriter.close(); */


        
                    scan.close();

                    

                }
                

            }


        }



        }
    


