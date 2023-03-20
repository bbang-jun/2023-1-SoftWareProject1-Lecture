package practice.lecture0313;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int amount = scanner.nextInt();

        int []count = new int[8];
        int []money = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 1};
        for(int i =0; i<8; i++){
            count[i] = amount/money[i];
            amount%=money[i];
        }

        System.out.println("오만원권 "+count[0]+"매");
        System.out.println("만원권 "+count[1]+"매");
        System.out.println("오천원권 "+count[2]+"매");
        System.out.println("천원권 "+count[3]+"매");
        System.out.println("오백원 "+count[4]+"개");
        System.out.println("백원 "+count[5]+"개");
        System.out.println("오십원 "+count[6]+"개");
        System.out.println("일원 "+count[7]+"개");

        scanner.close();
    }
}
