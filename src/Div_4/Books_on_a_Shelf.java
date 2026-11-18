package Div_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Books_on_a_Shelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();

            TreeMap<Integer, Integer> map = new TreeMap<>();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            if(n == 1){
                System.out.println(1);
                System.out.println(arr[0]);
                continue;
            }

            int si = 0;
            // left to right
            for (int key : map.keySet()) {
                arr[si++] = key;
                map.put(key, map.get(key) - 1);
            }

            int ei = n - 1;
            for (int key : map.keySet()) {
                if (map.get(key) > 0) {
                    arr[ei--] = key;
                    map.put(key, map.get(key) - 1);
                }
            }

            for (int key : map.keySet()) {

                while (map.get(key) > 0) {
                    arr[si++] = key;
                    map.put(key, map.get(key) - 1);
                }

            }


            int left = 1;
            si = 1;
            while (arr[si - 1] < arr[si]) {
                left++;
                si++;
            }
            ei = n - 2;
            int right = 1;
            while (arr[ei] > arr[ei + 1]) {
                right++;
                ei--;
            }

            System.out.println(left + right);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
