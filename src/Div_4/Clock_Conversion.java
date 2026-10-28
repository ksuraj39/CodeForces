package Div_4;

import java.util.Scanner;

public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t--> 0){

            String time = sc.next();
//          hh : mm

            System.out.println(convert(time));
        }
    }
    public static String convert(String s){
        int hh = Integer.parseInt(s.substring(0,2));
        int mm = Integer.parseInt(s.substring(3));

        StringBuilder sb = new StringBuilder();
        if(hh == 0){
            sb.append("12:");
            sb.append(String.format("%02d",mm));
            sb.append(" AM");
//            System.out.println(sb.toString());
            return sb.toString();
        }

        if(hh < 12){
            sb.append(String.format("%02d",hh));
            sb.append(":");
            sb.append(String.format("%02d",mm));
            sb.append(" AM");

//            System.out.println(sb.toString());
            return sb.toString();
        }


        if(hh == 12){
            sb.append(hh+":");
            sb.append(String.format("%02d",mm));
            sb.append(" PM");

//            System.out.println(sb.toString());
            return sb.toString();
        }

        if(hh > 12){
            int extra = hh - 12;
            sb.append(String.format("%02d",extra));
            sb.append(":");
            sb.append(String.format("%02d",mm));
            sb.append(" PM");
//            System.out.println(sb.toString());
            return sb.toString();
        }
        return "";
    }
}
