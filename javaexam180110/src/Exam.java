import java.util.Scanner;

public class Exam {
    public static void main(String[] args){
        double num1;
        double num2;

        String operator;

        Scanner kb = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        num1 = kb.nextDouble();
        operator = kb.nextLine();


        System.out.println("연산을 선택하세요(덧셈:a, 뺄셈:b, 곱셈:c, 나눗셈:d, 나머지:e)");
        operator = kb.nextLine();

        System.out.println("두번째 숫자를 입력하세요");
        num2 = kb.nextDouble();

        switch (operator) {
            case "a":
                System.out.println("덧셈한 결과입니다.");
                System.out.println(adder(num1,num2));
                break;
            case "b":
                System.out.println("뺄셈한 결과입니다.");
                System.out.println(minus(num1,num2));
                break;
            case "c":
                System.out.println("곱셈한 결과입니다.");
                System.out.println(multi(num1,num2));
                break;
            case "d":
                System.out.println("나눗셈한 결과입니다.");
                System.out.println(divide(num1,num2));
                break;
            case "e":
                System.out.println("나머지 결과입니다.");
                System.out.println(modular(num1,num2));
                break;
            default:
                System.out.println("연산을 잘못 입력하였습니다.");
        }


        System.out.println(adder(1,1));
        System.out.println(multi(1,2));
        System.out.println(divide(4,2));
        System.out.println(minus(5,2));
        System.out.println(modular(6,4));

    }
//        int num = 2;
//        while(num < 10){
//            if(num%5==0) {
//                break;
//            }
//            System.out.println(num);
//            num++;
//        }
//    }
//}
//        int num = 1;
//        while (true) {
//            if (num % 6 == 0 && num % 14 == 0) {
//                break;
//            }
//            num++;
//        }
//        System.out.println(num);
//    }
//}
//

    public static double adder(double num1, double num2) {
//    덧셈값을 저장하는 변수 생성
        double result;
//        덧셈 연산 실행
        result = num1 + num2;
//        덧셈한 결과 값을 리턴(도출)
        return result;
    }

    public static double multi(double num1, double num2) {
//        곱셈값을 저장하는 변후 생성
        double result;
//        곱셈 연산 실행
        result = num1 * num2;
//        곱셈한 결과 값을 리턴
        return result;
    }

    public static double minus(double num1, double num2) {
        double result;
        result = num1 - num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result;
        result = num1 / num2;
        return result;
    }
    public static double modular(double num1, double num2) {
        double result;
        result = num1 % num2;
        return result;
    }
}
