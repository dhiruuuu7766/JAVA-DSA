public class TwoSum {

    public static void main(String[] args) {
       int[] arr = {2, 3, 6, 6, 2, 9};
        int target = 11;
        System.out.println(twoSum(arr, 141));
    }

    public static boolean twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}




