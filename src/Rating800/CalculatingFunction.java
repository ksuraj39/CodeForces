package Rating800;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even = n / 2;
        int odd  = n - even;


        long evenSum =(long)even * (even + 1);
        long oddSum  =(long)odd * odd;

        System.out.println(evenSum - oddSum);
    }
}
