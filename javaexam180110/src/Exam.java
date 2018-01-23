import java.util.Scanner;

public class Exam {
    public static void main(String[] args)
//    System.out.println(""); >>java에서 글자를 출력하는 명령어
//   {
//       System.out.println("Programming! It's fun.");
//       System.out.println("My name is Hong Gil Dong. ");
//       System.out.println("l am 13 years old.");
//       System.out.println("(@) (@)");
//       System.out.println("(=^.^=)") ;
//       System.out.println("(-m-m-)");
//       System.out.println("I can program well.");
//       System.out.println("Dreams come true");
//       System.out.println("My height");
//       System.out.println(170);
//       System.out.println("My weight");
//       System.out.println(68.600000);
//       System.out.println(5+" Dan");
//       System.out.println(5+" * "+2+" = "+10);
//       System.out.println("          item          count          price");
//       System.out.println("           pen"+"             "+20+"            "+100);
//       System.out.println("          note"+"              "+5+"             "+95);
//       System.out.println("        eraser"+"            "+110+"             "+97);
//       System.out.println("My name is Hong");
//       System.out.println("My hometown");
//       System.out.println("Flowering mountain");
//       System.out.println("Flowering mountain");
//       System.out.println("TTTTTTTTTT");
//       System.out.println("TTTTTTTTTT");
//       System.out.println("    TT    ");
//       System.out.println("    TT    ");
//       System.out.println("    TT    ");
//       System.out.println(49+" * "+0.2683+0+0+" = "+13.146700);
//       System.out.println("kor"+ 90);
//       System.out.println("mat"+ 80);
//       System.out.println("eng"+ 100);
//       System.out.println("sum"+ 270);
//       System.out.println("avg"+ 90);
//       System.out.println("          Seoul")
//   }
//    {int num1;
//    num1=10;
//    int num2=20;
//    int num3=num1+num2;
//    System.out.println(num1+"+"+num2+"="+num3);
//
//     char ch1;
//     ch1='a';
//     System.out.println('a');}
//
//}
//    {
//        int num = 10;
//
//        if (num > 0) {
//            System.out.println("num은 0보다 크다");
//        }
//
//        if ((num % 2) == 0) {
//            System.out.println("num은 짝수");
//        } else {
//            System.out.println("num은 홀수");
//        }
//    }
//}

//    {
//        int score = 45;
//        if (score >= 90) {
//            System.out.println("성적은 수 입니다.");
//        } else if (score >= 80) {
//            System.out.println("성적은 우 입니다.");
//        } else if (score >= 70) {
//            System.out.println("성적은 미 입니다.");
//        } else if (score >= 60) {
//            System.out.println("성적은 양 입니다.");
//        } else {
//            System.out.println("성적은 가 입니다.");
//        }
//    }
//}

//    {
//        int num = -20;
//        if (num >= 1) {
//            System.out.println("positive");
//        }
//        else if (num <= -1) {
//            System.out.println("negative");
//            }
//        }
//    }

//    {
//        int n = 3;
//
//        switch (n) {
//            case 1:
//                System.out.println("Simple Java");
//                break;
//            case 2:
//                System.out.println("Funny Java");
//                break;
//            case 3:
//                System.out.println("Fantastic Java");
//                break;
//            case 4:
//                System.out.println("Best Java");
//                break;
//        }
//
//    System.out.println("Hi, Java");
//    }
//}

//    { String str = "강아지";
//
//    switch(str) {
//        case "고양이":
//            System.out.println("cat");
//            break;
//        case "강아지":
//            System.out.println("dog");
//            break;
//
//        }
//
//    }
//}

//    {
//        String str = "쥐";
//
//        switch (str) {
//            case "쥐":
//                System.out.println("mouse");
//                break;
//            default:
//                System.out.println("해당 단어가 없습니다.");
//        }
//    }
//}

//    {
//        int num = 0;
//
//        while (num <= 100)
//        {
//            System.out.println("안녕하세요" + num);
//            num++;
//
//        }
//    }
//}
//    {
////        키보드 입력 준비
//        Scanner kb = new Scanner(System.in);
////        입력할 숫자를 저장하는 변수 -> 사용자가 입력한 숫자를 변수 num에 저장
//        int num = kb.nextInt();
////        저장한 숫자 출력
//        System.out.println(num);
//
//    }
//}
//    {
////        키보드 입력 준비
//        Scanner kb = new Scanner(System.in);
////        입력할 문자를 저장하는 변수 -> 사용자가 입력한 문자를 변수 str에 저장
//        String str = kb.nextLine();
////        저장한 문자 출력
//        System.out.println(str);
//
//    }
//}

//    {
//        Scanner Keyboard=new Scanner(System.in);
//        System.out.println("당신의 이름은?");
//        String str = Keyboard.nextLine();
//        System.out.println("안녕하세요"+ str + '님');
//        System.out.println("당신은 스파게티를 좋아한다는데, 진실입니까?");
//        boolean isTrue=Keyboard.nextBoolean();
//        if(isTrue==true)
//            System.out.println("오~ 좋아하는군요.");
//        else
//            System.out.println("이런 아니었군요.");
//
//        System.out.println("당신과 동생의 키는 어떻게 되나요?");
//        double num1=Keyboard.nextDouble();
//        double num2=Keyboard.nextDouble();
//        double diff=num1-num2;
//        if(diff>0)
//            System.out.println("당신이" + diff + "만큼 크군요.");
//        else
//            System.out.println("당신이" + (-diff) + "만큼 작군요.");
//
//    }
//}

//    {
//    int num = 0;
//    int num2 = 0;
////    do while을 활용한 반복 출력
//    do {
//        System.out.println("java" + num);
//        num++;
//    } while(num<5);
//
////    while을 활용한 반복 출력
//    while(num2<5) {
//        System.out.println("java"+ num2);
//        num2++;
//    }
////    for를 활용한 반복 출력
//    for(int num3 = 0; num3<5; num3++) {
//        System.out.println("java" + num3);
//    }
//    }
//}

//    {
//    String str;
//
//    Scanner Keyboard = new Scanner(System.in);
//    str = Keyboard.nextLine();
////    System.out.println(str);
//    for(int num=0; num<20; num++) {
//        System.out.println(str);
//    }
//    }
//}

//    {
//
//    for(int num = 10; num<=20; num++)
//        System.out.println(num);
//    }
//}

    {


    for(int num=10; num<=100; num++) {
        System.out.println(num + 10);
    }
    }
}