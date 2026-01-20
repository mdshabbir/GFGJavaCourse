package arraySorting;

public class BubbleSort {
    public static void main(String[] args) {
        // to perform bubble sort in array
        /*
        we use swapping and arrange the order in increasing order
         */
    int a[] = {64, 34, 25, 12, 22, 11, 90, 5,3,100};
    int n= a.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
