package Rating800;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]lucky = {4,7,44,47,74,447,474,744,747,777};

        for(int num : lucky){
            if(n % num == 0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
