import java.util.*;
public class Example2  
{  
public static void main(String args[])  
{  
//character array  
char[] chars = {'T', 'o', 'm', ' ', 'C', 'r', 'u', 'i', 's', 'e'};  
//constructor of the String class  
String str = new String();  
//invoking valueOf() method of the String class  
String string = str.valueOf(chars);  
//prints the string  
System.out.println(string);  
char[] ch = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'o', 'n', ' ', 'T', 'e', 'c', 'h', 'n', 'o', 'l', 'o', 'g', 'y'};  
//creating an object of the StringBuilder class  
StringBuilder sb = new StringBuilder();  
//Java for-each loop  
for(char cha: ch)   
{  
//appends the string representation of the char array   
sb.append(cha);  
}  
//the toString() method returns a string that represents data in the sequence  
String string1 = sb.toString();  
//prints the string  
System.out.println(string1);  
}  
}    
