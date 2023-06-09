import java.util.*;
class Singleone
{
 public int singleNumber(int[] nums) 
 {
    int ans =0;
    for(int i=0;i<nums.length;i++)
    {
        ans^=nums[i];
        System.out.println("answer is:"+ans);
    }
    return ans;
 }
    public static void main(String[] args)
 {
    Singleone ob=new Singleone();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("enter the numbers");
    for(int i=0; i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    int no=ob.singleNumber(arr);
    System.out.println("number is:"+no);
  }
}