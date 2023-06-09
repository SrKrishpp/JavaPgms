import java.util.*;
import java.io.*;
class Solution1 {
    public int balancedStringSplit(String s) {
        int cnt=0, res=0;
	for(int i=0; i<s.length(); i++){
		cnt += s.charAt(i)=='R' ? 1 : -1 ;
		res += cnt==0 ? 1 : 0;
	}
	return res;
        
    }
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);  
    Solution1 ob=new Solution1();
	System.out.print("Enter a string: ");  
	String str= sc.nextLine(); 
	int count=ob.balancedStringSplit(str);
	System.out.println("value is:"+count);
    }
}