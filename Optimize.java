import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Optimize {

    public static void main(String[] args) {
        LPHashTable table = new LPHashTable(37);
        File data = new File("mydata.txt");

        testAllWeights(table, data);
    }

    public static void testAllWeights(LPHashTable table, File data) {
        File combinations = new File("combinations.txt");

        int minProbes = (int) Double.POSITIVE_INFINITY;
        int count = 0;

        try {
            Scanner scanner = new Scanner(combinations);
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                int[] weights = new int[9];

                lineNum++;
                print(lineNum);

                for (int i = 0; i < line.length; i++) {
                    weights[i] = Integer.parseInt(line[i]);
                }

                table.setWeights(weights);
                table.empty();
                table.resetProbeCount();
                loadFromFile(table, data);

                if (table.getProbeCount() < minProbes) {
                    minProbes = table.getProbeCount();
                    count = 1;
                } else if (table.getProbeCount() == minProbes) {
                    count++;
                }
            }
        } catch (FileNotFoundException err) {
            //
        }

        File resultFile = new File("results.txt");

        try {
            FileWriter writer = new FileWriter(resultFile);
            writer.write(minProbes + " " + count);
            writer.close();

        } catch (IOException err) {
            //
        }
    }

    public static void loadFromFile(LPHashTable table, File file) {
        try {
            Scanner scanner = new Scanner(file);
            table.empty();

            while (scanner.hasNextLine()) {
                String studentNumber = scanner.nextLine();
                try{
                    table.insert(studentNumber);
                }catch(IllegalStateException err){
                    print(table.findIndex(studentNumber));
                }
            }

            scanner.close();

        } catch (FileNotFoundException err) {
            print("File not found.");
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(int text) {
        System.out.println(text);
    }

}