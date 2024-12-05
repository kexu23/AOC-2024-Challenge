import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int[][] fileReader() {
        int[][] inputData;
        int i = 0;
        int j = 0;
        try {
            File file = new File("C:\\Users\\Kevin\\IntellijProjects\\AOC1\\AOC1\\AOC2\\input.txt");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            inputData = new int[1000][];
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                int[] arr = Arrays.stream(data.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                inputData[i] = arr;
                //System.out.println();
                //printArray(inputData[i]);
                i++;
                // System.out.println(data);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return inputData;
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static int safeOrUnsafe(int[] arr){

        int mistakes = 0;

        mistakes = mistakes + Checker.checkDifferenceArray(arr);
        if (mistakes <= 1){
            if (mistakes + Checker.decreasingArray(arr) <= 1 ){
                System.out.println("\nAmount of mistakes: ");
                mistakes = mistakes + Checker.decreasingArray(arr);
                System.out.println(mistakes);
                System.out.println("Passed\n");
                return 1;
                //mistakes = mistakes + Checker.decreasingArray(arr);
                //if (mistakes <= 1){
                //    return 1;
                //}
            }
            else if (mistakes + Checker.increasingArray(arr) <= 1){
                System.out.println("\nAmount of mistakes: ");
                mistakes = mistakes + Checker.increasingArray(arr);
                System.out.println(mistakes);
                System.out.println("Passed\n");
                return 1;
                //mistakes = mistakes + Checker.increasingArray(arr);
                //if (mistakes <= 1){
                //    return 1;
                //}
            }
            else{
                System.out.println("\nAmount of mistakes: ");
                System.out.println(mistakes);
                System.out.println("Not Passed\n");
                return 0;
            }
        }
        else{
            System.out.println("\nAmount of mistakes: ");
            System.out.println(mistakes);
            System.out.println("Not Passed\n");
            return 0;
        }

    }

    static int isSafe(int[] arr){
        if (Checker.increasingDifferenceArray(arr) <= 1|| Checker.decreasingDifferenceArray(arr) <= 1){
            return 1;
        }
        for (int i = 0; i < arr.length; i++) {
            int[] temparr = arr;
            List<int[]> list = Arrays.asList(arr);
            if (Checker.increasingDifferenceArray(temparr) <= 1 || Checker.decreasingDifferenceArray(arr) <= 1){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[][] inputData = fileReader();
        int safeReports = 0;

        for (int i = 0; i < inputData.length; i++) {
            printArray(inputData[i]);
            safeReports = safeReports + isSafe(inputData[i]);
        }

        System.out.println("\nThe number of safe reports is: ");
        System.out.println(safeReports);

    }
}