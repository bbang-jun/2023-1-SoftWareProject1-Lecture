package practice.lecture0313;

import java.util.Scanner;

public class example1 {


    public static void main(String[] args) {
        final double PI = 3.14d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요:");
        double radius = scanner.nextDouble();

        getRound(radius, PI);
        getArea(radius, PI);

        scanner.close();
    }

    public static void getRound(double radius, double PI){
        System.out.println(2*PI*radius);
    }

    public static void getArea(double radius, double PI){
        System.out.println(PI*radius*radius);
    }
}
