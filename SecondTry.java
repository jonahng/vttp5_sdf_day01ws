import java.io.Console;
import java.util.*;

public class SecondTry {
    public static void main(String[] args){
        menu();
        userInput();
    }

    public static void menu(){
        System.out.println("Hi this is your shopping cart, type list, add item, delete item, close to continue");
    }

    public static void userInput(){
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
                    stuffInCart.add(scan.next());
                }

            }

            if(keyboardInput.startsWith("delete")){
                Scanner scan = new Scanner(keyboardInput.substring(7));

                while(scan.hasNext()){
                    stuffInCart.remove(scan.nextInt() - 1);
                }
            }


        }
    }
}

