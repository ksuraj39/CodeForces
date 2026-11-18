package Div3;

import java.util.Scanner;

public class SwapandNegate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int totalSum = 0;
            int ones = 0;
            boolean flag = false;


            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                totalSum += x;
                if(x == 1) ones++;
                if (i > 0 && i < n - 1 && x > 1) {
                    flag = true;
                }
            }

            if (totalSum == n) {
                System.out.println(-1);
            } else if (flag) {
                System.out.println(totalSum - 1);
            } else {
                System.out.println(totalSum- (n - 1));
            }
        }
    }

}
