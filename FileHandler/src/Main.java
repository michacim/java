import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void writeText(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        fw.write("Hallo guten Tag\nSchönes Wetter");
        fw.close();

    }
    public static void readText(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();

    }

    public static void main(String[] args) {
        System.out.println("write...");
        try {
            //writeText("data.txt");
            readText("data.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}