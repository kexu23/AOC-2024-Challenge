public class Checker {

    static int checkDifferenceArray(int[] arr){
        int mistakes = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i]-arr[i+1]) > 3 || Math.abs(arr[i]-arr[i+1]) < 1){
                mistakes++;
            }
        }
        return mistakes;
    }

    static int increasingArray(int[] arr){
        int mistakes = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] >= arr[i+1]){
                mistakes++;
            }
        }
        return mistakes;
    }

    static int decreasingArray(int[] arr){
        int mistakes = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] <= arr[i+1]){
                mistakes++;
            }
        }
        return mistakes;
    }

    static int increasingDifferenceArray(int[] arr){
        int mistakes = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i+1] - arr[i] > 3 || arr[i+1] - arr[i] < 1){
                mistakes++;
            }
        }
        return mistakes;
    }

    static int decreasingDifferenceArray(int[] arr){
        int mistakes = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] - arr[i+1] > 3 || arr[i] - arr[i+1] < 1){
                mistakes++;
            }
        }
        return mistakes;
    }

}
