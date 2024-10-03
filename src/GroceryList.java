/*Import console
console.readline welcome to shopping cart
create arraylist of strings

user can type list, add, delete

if arraylist.length(Dk the exact function) = 0, print your cart is empty
input is from readline,
if input scan .equals add, 
then add the rest of the string into the arraylist
if input scan .equals delete,
remove arraylist[x] where x is the rest 
of the string after delete, it may need parseInt to get value 
if input .equals list, 
if list.length(??) = 0, print your cart is empty
else for(String item: list), System.out.println(item.index + item)
while loop to keep it asking
https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-String-input-with-the-Scanner-class
*/
import java.io.Console;
import java.util.*;

public class GroceryList{

    public String getUserKeyword(){
    Scanner scan = new Scanner(System.in);
    String keyWord = scan.next();
    scan.close();
    return keyWord;

    }

    public void main(String[] args){
    List<String> grocerylist = new ArrayList();

    if(keyWord.equals("list")) {
        if(ArrayList.size() == 0) 

  
        }
    

    }
   


}