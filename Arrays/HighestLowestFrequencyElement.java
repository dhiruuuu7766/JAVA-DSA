import java.util.HashMap;

public class HighestLowestFrequencyElement {

    static int[] getHighestLowestFreqElemetn(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //hashmap is ready
        //1 -> 3
        //2 -> 5
        //3 -> 9
        //4 -> 3
        //5 -> 1

        int highFreq = Integer.MIN_VALUE;
        int highNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highFreq) {
                highFreq = currentFreq;
                highNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int[] ans = {highNum, lowestNum};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,3,2,3,2,3,3,3,4,5,3,2,3,4,1};
        int[] ans = getHighestLowestFreqElemetn(arr);
        System.out.println("Highest Frequency wala number jo zero index par  aaya hai -> " + ans[0]);
        System.out.println("Lowest Frequency wala number jo index one pr aaya hai -> " + ans[1]);
    }
}
