// A string is a sequence of charcater(like text).
// string name = "Archana";
// In java ,strong is not a primitive data type
// it is a class from the java.langpackage
// how to create a string 
// 1. using string literal
// string s1="hello";
// 2. using new kwyword
// string s2=new string("hello");
// literal = stored in string pool(memory efficient)
// new = storedd in heap memory (separate object)
// string is immutable  immutable= cannot be change

public class string {
// 1.String reverse 
public static void main(String[] args){
    // String str ="Hello";
    // String rev="";
    // for(int i = str.length()-1; i>=0;i--){
    //     rev +=str.charAt(i);
    // }
    // System.out.println(rev);

// 2.check palindrome 
// String str="madam";
// String rev = "";
// for(int i=str.length()-1; i>=0;i--){
//     rev +=str.charAt(i);
// }
// if(str.equals(rev)){
//     System.out.println("palindrome");
// }
// else{
//     System.out.println("not palindrome");
// }

// 3.count vowel in a string
// String str="eduation";
// int count =0;
// for(int i=0;i<=str.length(); i++){
//     char ch = str.charAt(i);
// }
// if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//     count++;
// }
// System.out.println("vowel: "+ count);

//  4.Write a Java program to get the character
//  at the given index within the 

// String str = "java Execises";
// System.out.println("original string =" + str);
// int index1=str.charAt(0);
// int index2=str.charAt(10);
// System.out.println("The charcter postion at 0 is =" + (char)index1);
// System.out.println("the character psotion at 4 is =" + (char)index2);

//5.Write a Java program to get the character (Unicode code point)
//  at the given index within the string.
// String str="archana@6261";
// System.out.println("original string" +str);
// int val1 = str.codePointAt(2);
// int val2 = str.codePointAt(7);
// System.out.println("charcter (unicode point)="+val1);
// System.out.println("charcter (unicode point)="+val2);

// 6.Write a Java program to count Unicode code points in
the specified text range of a string.
String str="archana@6261";
System.out.println("original string ="+ str);
int cou =str.codePointCount(1,12);
System.out.println("codepoint count="+cou);


    }


    
}
