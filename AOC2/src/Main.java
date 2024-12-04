import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static int[][] fileReader() {
        int[][] inputData;
        int i = 0;
        int j = 0;
        try {
            File file = new File("C:\\Users\\Kevin\\IntellijProjects\\AOC2\\input.txt");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            inputData = new int[1000][10];
            while (scanner.hasNextLine()) {
                while (scanner.hasNextInt()){
                    int data = scanner.nextInt();
                    inputData[i][j] = data;
                    j++;
                }
                i++;
                // System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return inputData;
    }



    public static void main(String[] args) {

    }
}