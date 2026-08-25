import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MissingElementWithDuplicates {
    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        //marking
        for(int index=0; index<n; index++) {
            int value = Math.abs(arr[index]);
            int postion = value - 1;
            if (arr[postion] > 0) {
                arr[postion] = -arr[postion];
            }
        }

        for (int i=0; i<n; i++) {
            if(arr[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,4,5,2,2};
        List<Integer> result = findMissingNumbers(arr);
        System.out.println(result);
    }
}
