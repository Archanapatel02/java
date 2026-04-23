// 1.Write a program that takes an integer (1-7)
//  and prints the corresponding day name (e.g., 1 for Monday).
import java.util.Scanner;
public class student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number(1-7)");
        // int day=sc.nextInt();

        // switch(day){
        //     case 1:
        //         System.out.println("monday");
        //         break;
        //     case 2:
        //         System.out.println("tuesday");
        //         break;
        //     case 3:
        //         System.out.println("wednesday");
        //         break;
        //     case 4:
        //         System.out.println("thurday");
        //         break;
        //     case 5:
        //         System.out.println("friday");
        //         break;
        //     case 6:
        //         System.out.println("saturday");
        //         break;
        //     case 7:
        //         System.out.println("sunday");
        //         break;  
        //     default:
        //     System.out.println("invalid input! please enter 1 to 7");

        // }
// 2.Take two numbers and a character operator
//  (+, -, *, /) and perform the mathematical operation.
// System.out.println("enter a frist number");
// int a =sc.nextInt();
// System.out.println("enter a second number");
// int b=sc.nextInt();
// System.out.println("enter a operator (+, -, *, /)");
// int op= sc.next().charAt(0);

// double result;

// switch(op){
//     case '+':
//         result=a+b;
//         System.out.println("result ="+ result);
//         break;
//     case '-':
//         result=a-b;
//         System.out.println("result ="+ result);
//         break;
//     case '/':
//         result=a/b;
//         System.out.println("result ="+ result);
//         break;
//     case '*':
//         result=a*b;
//         System.out.println("result ="+ result);
//         break;
//     default:
 //       System.out.println("Invalid operator");
    
// }

// 3.Take a single character input and
//  determine if it is a vowel or a contentant
// System.out.println("enter a character ");
// char ch=sc.next().charAt(0);

// ch=Character.toLowerCase(ch);

// switch(ch){
//     case'a':
//     case'i':
//     case'e':
//     case'o':
//     case'u':
//     System.out.println("it is vowel");
//     break;
    
//     default:
//         System.out.println("conatant");
    
//}

//4. Input a month number (1-12) and print the
//  number of days in that month for a non-leap year.
// System.out.println("enter a month()1-12");
// int month=sc.nextInt();

// switch(month){
//     case 1:case 3:case 5:case 7: case 8: case 10: case 12:
//         System.out.println("31 days");
//         break;
//     case 4:case 6: case 9: case 11:
//         System.out.println("30 days");
//         break;
//     case 2:
//         System.out.println("28 days");
//         break;

//     default:
//         System.out.println("invalid month");
        


//}

//5.Input a letter grade ('A', 'B', 'C', 'D', 'F') and print its descriptive
//  meaning (e.g., 'A' = "Excellent"). 

System.out.println("Enter a grade letter (A-F)");
char ch =sc.next().charAt(0);

ch=Character.toUpperCase(ch);

switch(ch){
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("very good");
        break;
    case 'c':
        System.out.println("good");
        break;
    case'D':
        System.out.println("promote");
        break;
    case 'F':
        System.out.println("fail");
        break;
    default:
        System.out.println("invalid grade letter");
    
}

} 

    
}
