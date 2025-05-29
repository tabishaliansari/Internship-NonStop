public class checkSortedArray {
    public static boolean checkSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        return checkSorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0, 7, 8, 9, 10};
        System.out.println(checkSorted(arr, 0));
    }
}
