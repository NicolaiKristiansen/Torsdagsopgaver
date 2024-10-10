package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeemenu = new ArrayList<>();

    public ArrayList<String> getMenu() {
        return coffeemenu;
    }

    public void loadMenuData() {
        File file = new File("data/coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                coffeemenu.add(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
