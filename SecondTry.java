import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;

public class SecondTry {
    public String newFileName = "";

    public final class Paths extends Object{}
    


    
    
    public SecondTry(String newFileName) {
        this.newFileName = newFileName;
    }






    public static void main(String[] args) throws IOException{

        
        menu();
        userInput();

    }






    public static void menu(){
        System.out.println("Hi this is your shopping cart, type list, add item, delete item, close to continue");

    }





    public static void userInput() throws IOException{
        SecondTry instance = new SecondTry(null);

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
                scan.close();

                }

            
            if(keyboardInput.startsWith("users")){
                File folder = new File("C:\\Users\\65932\\vttp5_sdf_day01ws\\cartdb");
                File[] filesList = folder.listFiles();
                System.out.println("Here are the users in the database:");
                for(File file: filesList){
                    System.out.println(file.getName());
                }
                System.out.println("---End of database---");
                


            }







            if(keyboardInput.startsWith("login")){
                Scanner scan = new Scanner(keyboardInput.substring(6));

                String loginName = scan.next();
                //if filename exists, instance.setfilename = existing file
                //else if filename does not exist, create new file, and set file name = new file
                


                instance.setNewFileName("C:\\Users\\65932\\vttp5_sdf_day01ws\\cartdb\\" + loginName + ".txt") ;
                File newFile = new File(instance.getNewFileName());

                if(newFile.exists()){
                    stuffInCart = Files.readAllLines(newFile.toPath());
                    System.out.println("logged in to your account!");
                } else{newFile.createNewFile();
                System.out.println("new file created! filename: " + newFile.getName());}
/*              FileWriter myWriter = new FileWriter(newFileName);
                myWriter.write("Hello new file written");
                myWriter.close(); */


    
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
                    instance.setNewFileName("C:\\Users\\65932\\vttp5_sdf_day01ws\\" + scan.next() + ".txt") ;
                    File newFile = new File(instance.getNewFileName());
/*                     if(newFile.exists()){
                        Path newPath = Paths.get(instance.getNewFileName());
                        
                        stuffInCart = Files.readAllLines(newPath);
                    } */

                    newFile.createNewFile();
                    System.out.println("new file created! filename: " + newFile.getName());
/*                     FileWriter myWriter = new FileWriter(newFileName);
                    myWriter.write("Hello new file written");
                    myWriter.close(); */


        
                    scan.close();

                    

                }
                FileWriter myWriter = new FileWriter(instance.getNewFileName());
                myWriter.write(instance.getNewFileName() + "\n");
                for(String item: stuffInCart){
                    myWriter.write(item + "\n");
                    
                

            }
            myWriter.close();


        }
        System.out.println("User logged out, thank you!");
    }




    public String getNewFileName() {
        return newFileName;
    }




    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }



        }
    


