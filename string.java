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
String str="eduation";
int count =0;
for(int i=0;i<=str.length(); i++){
    char ch = str.charAt(i);
}
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    count++;
}
System.out.println("vowel: "+ count);

    }


    
}
