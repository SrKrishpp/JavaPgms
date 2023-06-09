import java.util.*;
class Solution {
public int removeElement(int[] nums,int val)
{
 int j=0;
 int size=nums.length;
  int[] dup=new int[size];
  for(int i=0;i<size;i++)
  {
    if(nums[i]!=val)
    {
      dup[j]=nums[i];
      j++;
    }

  }
  //dup[j++]=ar[size-1];
  for(int i=0;i<j;i++)
  {
   nums[i]=dup[i];
  }
  return j;

}

public static void main(String[] arg)
{
  
  int size;
  Solution ob= new Solution();
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the size of an array");
  size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("enter the numbers");
  for(int i=0; i<size;i++)
  {
    arr[i]=sc.nextInt();
  }
 System.out.println("enter the value to remove"); 
int target=sc.nextInt();  
int n=ob.removeElement(arr,target);
System.out.println("duplicate");
for(int i=0;i<n;i++)
  {
  	System.out.println(arr[i]);
  }
}
}