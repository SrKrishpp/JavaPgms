import java.util.*;
public class StringFormatter {  
public String sortSentence(String s) {
    String[] arr=s.split(" ");
    String[] ans=new String[arr.length];
    for(String a:arr){
            int val=a.charAt(a.length()-1)-'0';
            System.out.println("value of val: "+ val);
            ans[val-1]=a.substring(0, a.length()- 1); 
        }          
    return String.join(" ",ans);
}
       
    public static void main(String[] args) {  
    StringFormatter ob=new StringFormatter();
    System.out.println(ob.sortSentence("is2 sentence4 This1 a3"));  
    System.out.println(ob.sortSentence("Myself2 Me1 I4 and3"));  
    }  
}
  