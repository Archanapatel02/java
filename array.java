import java.util.Scanner;
public class array {
// Array is the colloction of element of the same data type staored in a continous memory
// fixed size
//stores same type(int,double,string etc)
//Access using index(starts from 0)
// int [] marks={99.90.89}

//1.print array element 
public static void main(String[] args){
//     int[] arr ={10,20,30,40,50};
//     for(int i=0; i<arr.length; i++){
//         System.out.println("element at index"+i+"="+arr[i]);
//     }
    
// 2.find sum of array element 
// int[] arr ={10,20,30,40,};
// int sum=0;
// for(int i = 0; i<arr.length;i++){
//     sum +=arr[i];
//     System.out.println("sum="+sum);
// }
//3.find largest element
// int[] arr={20,100,60,90};
// int max = arr[0];
// for(int i=0; i<arr.length;i++){
//     if(arr[i]>max){
//         max = arr[i];
//     }
// }
// System.out.println("Largest ="+ max);

//4.Resevse an array
// int[] arr={10,20,30,40,50};
// for(int i=arr.length-1;i>=0;i--){
//     System.out.println(arr[i] +" ");
// }

//5.count even and odd
// int[] arr={1,2,3,4,5,6,7,8,9,};
// int even=0, odd=0;
// for(int i=0;i<arr.length;i++){
//     if(arr[i]%2==0)
//         even++;

//     else
//         odd++;
// }
//     System.out.println("even="+even);
//     System.out.println("odd ="+odd);

//6.search an element (linear search)
// int[] arr={9,8,2,1,5};
// int key=2;
// boolean found = false;
// for(int i=0;i<=arr.length;i++){
//     if(arr[i]==key){
//         found=true;
//         break;

//     }

// }
// if(found)
//     System.out.println("element found");
// else
//     System.out.println("element nit found");
// }
// 7.sort array (ascending order)
// int[] arr={8,6,1,4,0,7};
// for(int i =0; i<arr.length;i++){
//     for (int j=i+1;j<arr.length;j++){
//         if(arr[i]>arr[j]){
//             int temp =arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     }
// }
// for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]+" ");
//}
//8.find second largest element
int[] arr={9,8,2,108,199};
int max=0;
int second =0;
for(int i=0;i< arr.length;i++){
    if(arr[i]>max){
        second=max;
        max=arr[i];

    }
    else if(arr[i]>second && arr[i]!=max){
        second =arr[i];
    }
}
System.out.println("second largest =" + second);

}
}
