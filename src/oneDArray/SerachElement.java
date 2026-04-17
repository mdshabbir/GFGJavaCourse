package oneDArray;

public class SerachElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 78, 43, 89, 0, 2, 4, 5, 6};

    }

    public static boolean searchElement(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            boolean isavailable = false;
            if (arr[i] == num) {
                isavailable = true;
                break;
            }
            if (isavailable == true) {
                return true;
            }

        }
            return false;

    }
}
