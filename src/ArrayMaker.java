import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayMaker {



    static int[] toArray1() {

        int[] input = Main.fileReader();
        int[] arr1 = new int[input.length/2];

        //ArrayList<Integer> arr1 = new ArrayList<Integer>();
        //ArrayList<Integer> arr2 = new ArrayList<Integer>();

        int j = 0;

        for (int i = 0; i < input.length;) {
            arr1[j] = input[i];
            i = i + 2;
            j++;
        }

        return (arr1);
    }

    static int[] toArray2(){

        int[] input = Main.fileReader();
        int[] arr2 = new int[input.length/2];

        //ArrayList<Integer> arr1 = new ArrayList<Integer>();
        //ArrayList<Integer> arr2 = new ArrayList<Integer>();

        int j = 0;

        for (int i = 1; i < input.length;) {
            arr2[j] = input[i];
            i = i + 2;
            j++;
        }

        return (arr2);
    }

    static int[] intToArray(int arr){
        int number = arr;
        LinkedList<Integer> result = new LinkedList<>();
        while (number > 0) {
            result.push(number % 10);
            number /= 10;
        }
        int[] array = new int[result.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = result.get(i);
        }

        return array;
    }

}
