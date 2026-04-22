//1.Write a program to take an integer input and
//print whether it is even or odd using the modulo operator %.
import java.util.Scanner;
public class main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        // if(a%2==0)
        //     System.out.println("even number");
        // else{
        //     System.out.println("odd number");
        // }

// 2.Take a number from the user and determine if it 
//  positive, negative, or zero using an if-else-if ladder.

        // System.out.println("enter a number");
        // int a=sc.nextInt();

        // if(a<0)
        //     System.out.println("negative number");
        
        // if( a>0)
        //     System.out.println("postive number");

        //     else{
        //         System.out.println("zero number");
        //     }

 // 3.Accept three numbers and identify the greatest
 //  among them by nesting conditions or using logical && operators.
    
        // System.out.println("enter frist number");
        // int a = sc.nextInt();
        // System.out.println("enter a second number");
        // int b = sc.nextInt();
        // System.out.println("enter a thrid number");
        // int c = sc.nextInt();

        // if(a>b && a>c)
        //     System.out.println("a is the greter number ");
        // if(b>a && b>c)
        //     System.out.println("b is the greater number");
        // else
        //     System.out.println("c  is the  greater number");

// 4.Check if a person is eligible to vote (age >=18)
//and print a corresponding message.

// System.out.println("enter a age ");
// int a = sc.nextInt();
// if(a>=18)
//     System.out.println("you are eligible to give the vote");
// else{
//     System.out.println("youare not eligible to give a vote");
// }

// 5. Write a program to determine if a given year
//  is a leap year based on divisibility rules. 
// System.out.println("enter a year");
// long year =sc.nextInt();
// if((year % 400 ==0 )||(year % 4 ==0 && year % 100 != 0)){
//     System.out.println("this year is leap year");
// }
// else{
//     System.out.println("this year is not a leap year ");
// }

//6.Categorize marks into grades 
// System.out.println("enter a percentage");
// float a = sc.nextInt();
// if(a>=90){
//     System.out.println("A");
// }
// else if(a>=50){
//     System.out.println("B");
// }
// else if(a>=35){
    
//     System.out.println("c");
// }
// else{
//     System.out.println("fail");
// }

    
    

// 7.Accept a single character and check if it is a vowel 
// (a, e, i, o, u) or a consonant.
// System.out.println("enter a character");
// char ch=sc.next().charAt(0);
// ch=Character.toLowerCase(ch);

// if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
//     System.out.println("vowel");
// }
// else{
//     System.out.println("consonant");
// }
//     }
// }

//8.Input three angles and determine if they
//  form a valid triangle (sum must be exactly )
// System.out.println("enter three angle");
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();

// if(a+b+c==180 && a>0 && b>0 && c>0){
//     System.out.println("valid triangle");
// }
// else{
//     System.out.println("invalid triangle");
// }
//     }
// }

//9. Calculate a total bill based on units consumed, with different rates for
//  different unit ranges (e.g., first 50 units at one rate, next 150 at 
// another).
// System.out.println("enter a unit consumed");
// int unit=sc.nextInt();
// double bill =0;

// if(unit<=50){
//     bill=unit*1;
// }
// else if(unit<=200){
//     bill=(50*1)+(unit-50)*2;
// }
// else{
//     bill=(50*1)+(150*2)+(unit-200)*3;
// }
// System.out.println("Total bill =rs"+ bill);
//     }
// }

//10. Input cost price and selling
//  price to calculate and display the profit or loss amount
System.out.println("enter a cost price");
double cp=sc.nextDouble();
System.out.println("enter a selling price");
double sp=sc.nextDouble();

if(sp>cp){
    double profit = sp-cp;
    System.out.println("profit ="+ profit);
}
else if(cp>sp){
    double loss= cp-sp;
    System.out.println("loss ="+ loss);
}
else{
    System.out.println("no profit no loss");
}
    }
}