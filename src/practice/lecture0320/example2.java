package practice.lecture0320;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        int x1=100, y1=100;
        int x2=200, y2=200;

        Scanner scanner = new Scanner(System.in);
        int userX1, userY1, userX2, userY2;
        userX1 = scanner.nextInt();
        userY1 = scanner.nextInt();
        userX2 = scanner.nextInt();
        userY2 = scanner.nextInt();

        if(((userX1 > x1 && userX1 < x2) && (userY1 > y1 && userY1 < y2)) || ((userX2 > x1 && userX2 < x2) && (userY2 > y1 && userY2 < y2)))
            System.out.println("사각형이 겹칩니다.");
        else
            System.out.println("사각형이 겹치지 않습니다.");
    }
}
