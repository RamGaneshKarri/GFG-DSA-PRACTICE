public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 56, 1000, 167 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
