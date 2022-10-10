import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO {


    public ArrayList<String> readGameData() {
        File file = new File("Data/gamedata.csv");
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            input.nextLine();//ignorer header

            while (input.hasNextLine()) {
                data.add(input.nextLine());//“Egon: 30000”
            }
        } catch (FileNotFoundException e) {
            data = null;
        }
        return data;
    }


    public static void writeGameData(ArrayList<Player> players) {
        try {
            FileWriter writer = new FileWriter("Data/gamedata.csv");
            writer.write( "name, amount\n");

            for (Player p : players) {
                writer.write(p.getName() + "," + p.getBalance()+"\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public String[] readBoardData(){
        String[] values = new String[40];
        String header;
        try {
            Scanner scan = new Scanner(new File("data/boarddata.csv"));
            header = scan.nextLine();
            for (int i = 0; i < values.length; i++){
                String s = scan.nextLine();
                values[i] = s;
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        return values;
    }


}






