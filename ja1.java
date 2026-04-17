// 1.take input bu user and add two number
import java.util.Scanner;
public class ja1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a frist number");
        // int a = sc.nextInt();
        // System.out.println("enter a second number");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("sum = "+ sum);
//2. wap to take principle ,rate and time as input from the user ans calculate simple inetrest
System.out.println("enter a principle");
float p = sc.nextFloat();
System.out.println("enter a rate");
float r = sc.nextFloat();
System.out.println("enter a time");
float t =sc.nextFloat();
float SI = (p*r*t)/100;
System.out.println("simple interest =" + SI);
        
    }
    
}
