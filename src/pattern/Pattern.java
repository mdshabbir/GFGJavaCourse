package pattern;

public class Pattern {
    public static void main(String[] args) {
        // print a universal pattern
//       universalPattern(11);
        decrementTriangle(5);
    }
    public static void universalPattern (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == ((n - 1) / 2) || j == ((n - 1) / 2) || i == j ||
                        i + j == n - 1 || i + j == ((n - 1) / 2) || j - i == ((n - 1) / 2) || i - j == ((n - 1) / 2) || i + j == (n - 1) + ((n - 1) / 2))  {
                    System.out.print("*  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // print this patter like this
    /*
             * * * * *
               * * * *
                 * * *
                   * *ś
                     *
     */
    public static  void decrementTriangle (int n) {

        for ( int row = n; row > 0; row--) {
            // print the space first
            for (int sp = 5;  sp > 1 ; sp--) {
                System.out.print(" ");
            }
            for (int st = 0; st < row; st++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
