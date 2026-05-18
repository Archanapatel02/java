public class pattern {
    public static void main(String[] args){
//1.solid raectange
// *****
// *****
// *****
// *****
        // int n = 4;
        // int m = 5;
        // // outer loop
        // for(int i=1;i<=n;i++){
        //     // inner loop
        //     for(int j=1;j<=m;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println('*');
        // }
//2. hollow reactangle
// *****
// *   *
// *   *
// *****
        // int n = 4;
        // int m = 5;
        // // outer loop
        // for(int i=1;i<=n;i++){
        //     // inner loop
        //     for(int j=1;j<=m;j++){
        //         if(i==1||j==1||n==i||m==j){
        //             System.out.print('*');
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
//3.half pyramid
// *
// **
// ***
// ****
// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//4.inverted triangle
// *****
// ****
// ***
// **    
// *
// int n=5;
// for(int i=n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//5.pyramid pattern
// *
// ***
// *****
// *******
// *********
// int n=5;
// for(int i=1;i<=n;i++){
//     // space
//     for(int j=1;j<=n-1;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=(2*i-1);j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//6.number pattern
// 1
// 12
// 123
// 1234
// 12345
// int n=5;
// for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
// }
//7.floyd's Triangle
// 1
// 23
// 456
// 78910
int n=4;
int num =1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(num+"");
        num++;
    }
    System.out.println();
    }  
        }
}
