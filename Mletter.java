public class Mletter {
    public static void main(String[] args) {
        int n = 7; // height of the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                // Print stars at the borders and diagonals
                if (j == 0 || j == n || (i == j && j <= n / 2) || (i + j == n && j >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
