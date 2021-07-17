import java.util.Scanner;

class Main {


    public static void dec(int n) {
        dec(n, n, "");
    }
    public static void dec(int n, int max, String prefix) {
        if (n == 0) {
            StdOut.println(prefix);
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            dec(n-i, i, prefix + " " + i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dec(n);
    }
}