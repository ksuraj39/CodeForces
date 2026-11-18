package Div_4;

import java.util.Arrays;
import java.util.Scanner;

public class Three_Piles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(b == a + 1 && c == b + 1 ? "YES" : "NO");
        }
    }
}
