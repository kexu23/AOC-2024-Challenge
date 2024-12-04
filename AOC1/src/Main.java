import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int difference(int x, int y){
        return Math.abs(x - y);
    }

    static int differenceAdder(int[] arr1, int[] arr2){

        int total = 0;

        if (arr1.length == arr2.length){
            int length = arr1.length;

            for (int i = 0; i < length; i++) {
                total = total + difference(arr1[i], arr2[i]);
            }
        }

        return total;
    }

    public static int frequencyFinder(int[] arr1, int[] arr2){
        int total = 0;
        int freq = 0;
        for (int i = 0; i < arr1.length; i++) {
            freq = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    freq++;
                }
            }
            total = total + arr1[i] * freq;
        }
        return total;
    }

    public static int[] fileReader() {
        int[] inputData;
        int i = 0;
        try {
            File file = new File("C:\\Users\\Kevin\\IntellijProjects\\AOC1\\Arrays.txt");
            Scanner scanner = new Scanner(file);
            inputData = new int[2000];
            while (scanner.hasNextInt()) {
                int data = scanner.nextInt();
                // System.out.println(data);
                inputData[i] = data;
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return inputData;
    }

    public static void main(String[] args) {


        int[] arr1 = ArrayMaker.toArray1();
        int[] arr2 = ArrayMaker.toArray2();
        /*
        int total = 0;

        for (int i = 0; i < arr1.length; i++) {
            int[] tempArr1 = ArrayMaker.intToArray(arr1[i]);
            int[] tempArr2 = ArrayMaker.intToArray(arr2[i]);

            System.out.println("Given array 1 is");
            MergeSort.printArray(tempArr1);

            System.out.println("\nGiven array 2 is");
            MergeSort.printArray(tempArr2);

            MergeSort.sort(tempArr1, 0, tempArr1.length - 1);
            MergeSort.sort(tempArr2, 0, tempArr2.length - 1);

            System.out.println("\n\nSorted array 1 is");
            MergeSort.printArray(tempArr1);

            System.out.println("\nSorted array 2 is");
            MergeSort.printArray(tempArr2);

            System.out.println("\nDifference between arrays is: ");
            System.out.println(differenceAdder(tempArr1, tempArr2));
            total = total + differenceAdder(tempArr1, tempArr2);
        }

         */

        /*
        System.out.println();
        System.out.println(arr1[0]);
        System.out.println();

        System.out.println("Given array 1 is");
        MergeSort.printArray(arr1);

        System.out.println("\nGiven array 2 is");
        MergeSort.printArray(arr2);
        */

        MergeSort.sort(arr1, 0, arr1.length - 1);
        MergeSort.sort(arr2, 0, arr2.length - 1);

        /*
        System.out.println("\n\nSorted array 1 is");
        MergeSort.printArray(arr1);
        System.out.println("\nSorted array 2 is");
        MergeSort.printArray(arr2);
         */

        System.out.println("\nThe sum of the distances is: ");
        System.out.println(differenceAdder(arr1, arr2));

        System.out.println("\nSimilarity score of the arrays: ");
        System.out.println(frequencyFinder(arr1, arr2));
        //System.out.println(total);

    }



}