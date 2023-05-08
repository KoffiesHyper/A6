import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Optimize {

    public static void main(String[] args) {
        LPHashTable table = new LPHashTable(37);

        File data = new File("mydata.txt");
        
        testAllWeights(data);
    }

    public static void testAllWeights(File file){

    }

    public static void loadFromFile(LPHashTable table, File file) {
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String studentNumber = scanner.nextLine();
                table.insert(studentNumber);
            }

        } catch (FileNotFoundException err) {
            print("File not found.");
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

}