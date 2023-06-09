import java.util.*;
class Solutionfc {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
    for(String w:word1)
    {
sb1.append(w);
   }
   for(String x:word2)
   {
    sb2.append(x);
   }

   return sb1.toString().equals(sb2.toString());     
    }
    public static void main(String[] arg)
    {
      
    Solutionfc ob=new Solutionfc();
    String str1[]={"ab","cdeff"};
    String str2[]={"abcdeff"};
    boolean count=ob.arrayStringsAreEqual(str1,str2);
    if (count==true)
    {
        System.out.println(" same");

    }
else{
    System.out.println(" not same");
    }
}
}