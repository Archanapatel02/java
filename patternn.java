//1.Number Triangle pattern
//1
//12
//123
//1234
//12345
public class patternn {
    public static void main(String[] args){
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

//2.number square
//11111
//22222
//33333
//44444
//55555
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n;j++){
//         System.out.print(i);
//     }
//     System.out.println();
// }

//3.Reverse number triangle
//12345
//1234
//123
//12
//1
// int n=5;
// for(int i=n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

//4.inverted pyramid
int n=5;
for(int i=n;i>=1;i--){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}

