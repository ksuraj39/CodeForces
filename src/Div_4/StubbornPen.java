package Div_4;

import java.util.Scanner;

public class StubbornPen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){

            int n = sc.nextInt();
            String s = sc.next();

            char curr = 'R';
            int cnt = 0;

            for(char ch : s.toCharArray()){
                if (ch != curr){
                    cnt++;
                    curr = ch;
                }

                curr = (curr == 'R') ? 'B' : 'R';
            }

            System.out.println(cnt);
        }
    }
}
