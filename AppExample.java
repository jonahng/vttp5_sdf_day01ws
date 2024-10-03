import java.io.Console;
import java.util.*;

public class AppExample {

    
    public static void main(String[] args){
        List<String> cartItems = new ArrayList<>();// use set and Hashmap to prevent duplication!=
/*         menu();
        userInput(); */

    }
    

    public static void menu(){
        System.out.println("hello this is a shopping cart");
        System.out.println("list,quit, add, remove");

    }

    public static void userInput(){

        List<String> cartItems = new ArrayList<>();

        Console console = System.console();
        String keyboardInput = "";
        while(!keyboardInput.equals("quit")){
            menu();
            keyboardInput = console.readLine("Type Here:");
            keyboardInput = keyboardInput.toLowerCase();

            if(keyboardInput.equals("list")){
                if(cartItems.size() >0){

                }else{
                    System.out.println("Nothing on list!");
                } 
            }
            if (keyboardInput.startsWith("add")){
                keyboardInput = keyboardInput.replace(',', ' ');
                Scanner scan = new Scanner(keyboardInput.substring(4));
                String tempStorage = "";
                while(scan.hasNext()){
                    tempStorage = scan.next();
                }

            }
// string deleteindex = scan.next()  after previously 

//aa

        }
        System.out.println("That's all for today");

    }
}
