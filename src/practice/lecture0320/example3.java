package practice.lecture0320;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();
        Integer output = null;

        switch (operator){
            case "+":
                output = num1 + num2;
                break;
            case "-":
                output = num1 - num2;
                break;
            case "x":
                output = num1 * num2;
                break;
            case "/":
                if(num1 == 0 || num2 == 0)
                    System.out.println("나눠지는 수와 나누는 수 모두 0입니다.");
                else
                    output = num1/num2;
                break;
            case "%":
                output = num1%num2;
                break;
            default:
                System.out.println("올바르지 않은 사칙연산자입니다!");
        }
        if(output == null)
            System.out.println("종료하도록 하겠습니다.");
        else
            System.out.println(num1+" "+operator+" "+num2+" = "+output);
    }
}
