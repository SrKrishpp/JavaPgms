import java.util.*;
class Consistent
{
public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(char c:allowed.toCharArray()){
            set.add(c);
        }
        
        int count=0;
        for(String s:words){
            boolean flag=true;;
            System.out.println("word is : "+s);
            System.out.println(flag);
            for(char c:s.toCharArray()){
                System.out.println(" checking character : "+c);
                System.out.println(set);
                if(!set.contains(c)){
                    flag=false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Consistent ob=new Consistent();
    String str1[]={"ab","cdeff","abb","abcd"};
    String str2="ab";
    int count=ob.countConsistentStrings(str2,str1);
      System.out.println(count);  
    }
}