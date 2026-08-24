public class FindUniqueElement {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4, 4, 5, 6, 5, 6};

        int unique = 0;

        for (int i=0; i<arr.length; i++) {
            unique = unique ^ arr[i];
        }
        System.out.println("The unique element in the given array is : " + unique);
    }
}
