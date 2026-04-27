// for loop 
// 1.  write a loop that print nummber from 1 to 10 on separate lines
import java.util.Scanner;
public class loopdemo {
    public static void main(String[] args){
        // for(int i = 1; i<= 10;i++){
        //     System.out.println(i);
        // }
// 2. Calculate the sum of the first 1,000 natural numbers.
// int sum=0;
// for(int i=1;i<=1000;i++){
//         sum = sum + i;
// }
//     System.out.println("sum ="+ sum);

// 3. Use a loop to iterate from 1 to 100 and 
// print only the even numbers.
// for(int i=1;i<=100;i++){
//     if(i%2==0){
//         System.out.println(i);
//     }
// }
//4.Create a countdown from 10 down to 1.
// for(int i=10;i>=1;i--){
//     System.out.println(i);
// }

//5.Given an integer print its first 10 multiples
// in the format N x i = result.
Scanner sc = new Scanner(System.in);
// System.out.println("enter a N number");
// int N = sc.nextInt();
// for(int i=1;i<=10;i++){
//     System.out.println(N + "*" + i + "=" +(N*i));
// }

        // while loop
// 1. print number from 1 to 10
// int i=1;
// while(i<=10){
//     System.out.println(i);
//     i++;
// }

// 2.print even nummber 1 tp 20
// int i=1;
// while(i<=20){
//     if(i%2==0){
//         System.out.println(i);
//     }
//     i++;
// }

//3.sum of frist natural number
// int i=1;
// int sum = 0;
// while(i<=10){
//     sum=sum + i;
//     System.out.println("sum =" + sum);
//     i++;

// }

//4.Reverse a number
// int i = 12345;
// int rev = 0;
// while(i!=0){
//     int num = i%10;
//     rev =rev*10+num;
//     i = i/10;
// }
//     System.out.println("Reverse = " + rev);

// 5. check palindrome number
int i =121;
int rev = 0;
while(i!=0){
    int num = i%10;
    rev= rev * 10 + num;
    i = i/10;
}
System.out.println("reverse =" + rev);

    }
} 