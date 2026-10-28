package Rating800;

import java.util.Scanner;

public class Perfect_Sandwiches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // test case input

        while(t-->0){

            int a = sc.nextInt();  // no of cheese
            int b = sc.nextInt();  // no of sausage


            if(a >= b){
                System.out.println(Math.min(b,a - b));
                return;
            }else{
                System.out.println(-1);
                return;
            }
        }
    }
}
