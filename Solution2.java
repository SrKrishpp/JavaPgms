import java.util.*;
class Solution2 {
    public int numJewelsInStones(String jewels, String stones) {
    int count=0,i=0;
    for(int j=0;j<jewels.length();j++)
    {
    while(i<stones.length())
    {
    if(jewels.charAt(j)==stones.charAt(i))
    {
    count++;
    }
    i++;
    } 
    i=0; 
    }
    return count;
    }
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);  
    Solution2 ob=new Solution2();
    System.out.print("Enter a jwels: ");  
    String jw= sc.nextLine(); 
    System.out.print("Enter a stones: ");  
    String st= sc.nextLine(); 
    int count=ob.numJewelsInStones(jw,st);
    System.out.println("value is:"+count);
    }
}