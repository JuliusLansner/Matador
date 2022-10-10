import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    static Scanner scan = new Scanner(System.in);

/*recieves a message and displays it to the user
    prompts the user for one input value
    returns the input
*/
    public String getUserInput(String msg){
        System.out.println(msg);
        String input = scan.nextLine();
        return input;
    }
/* recieves a message and displays it to the user
    prompts the user for multiple[iterations] input values
    returns a list of inputs
*/
    public ArrayList<String> getUserInput(String msg, int iterations ){
        ArrayList<String> values = new ArrayList<>();


        int i = 0;
        String input="";
        while(i < iterations ){
            System.out.println(msg);
            input = scan.nextLine();
            if(input.equalsIgnoreCase("Q")){
                break;
            }
            values.add(input);
            i++;
        }
        return values;
    }
/* recieves a message and displays it to the user
    displays a list of options
    prompts the user for one input value
    returns the input
    */
    public int getUserInput(String msg, ArrayList<String> options){

        System.out.println(msg);

        for(int i = 0; i<options.size(); i++){

            System.out.println(i+1+". "+options.get(i));
        }
        int choice = scan.nextInt();
        return choice;
    }
}

