package practice.lecture0320;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        for(int value : unit){
            int res = money/value;

            if(res>0){
                System.out.println(value + "원 짜리 : " + res + "개");
                money = money%value;
            }
        }

        scanner.close();
    }
}
