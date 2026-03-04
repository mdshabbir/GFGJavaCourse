package sorting;

public class SortingUtils {
    /**
     * In-place insertion sort that sorts the given array in ascending order.
     * Can be called from anywhere as sorting.SortingUtils.insertionSort(arr).
     */
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * In-place selection sort for primitive int arrays.
     * @param arr array to sort (modified in place)
     * @param ascending whether to sort ascending (true) or descending (false)
     */
    public static void selectionSort(int[] arr, boolean ascending) {
        if (arr == null || arr.length <= 1) return;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (ascending) {
                    if (arr[j] < arr[selected]) selected = j;
                } else {
                    if (arr[j] > arr[selected]) selected = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[selected];
            arr[selected] = temp;
        }
    }

    /**
     * Convenience overload: selectionSort(arr) sorts ascending.
     */
    public static void selectionSort(int[] arr) {
        selectionSort(arr, true);
    }

    /**
     * Generic selection sort for object arrays with a Comparator.
     * Example: SortingUtils.selectionSort(new Integer[]{...}, Integer::compareTo);
     */
    public static <T> void selectionSort(T[] arr, java.util.Comparator<? super T> cmp) {
        if (arr == null || arr.length <= 1) return;
        if (cmp == null) throw new IllegalArgumentException("Comparator must not be null");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (cmp.compare(arr[j], arr[selected]) < 0) {
                    selected = j;
                }
            }
            T tmp = arr[i];
            arr[i] = arr[selected];
            arr[selected] = tmp;
        }
    }
    /*
     * Check weather array is sorted or not
     */
    public static boolean isSorted (int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr [j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
        return !flag;
    }
}
