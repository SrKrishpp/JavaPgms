import java.util.*;
class Solutions {
public int[] Sort(int[] a,int size)
{
for (int i = 0; i < size; i++)   
  {  
   for (int j = i + 1; j < size; j++)   
   {  
    int tmp = 0;  
    if (a[i] > a[j])   
     {  
	  tmp = a[i];  
	  a[i] = a[j];  
	  a[j] = tmp;  
	 }  
    }
  }
  return a;
}
public int searchInsert(int[] nums, int target) {

int n=nums.length;
int i=0;
 while((n>i)&&(target>nums[i]))
{
  i++;
}
  return i;
}
public static void main(String[] arg)
{
  
  int size;
 Solutions ob= new Solutions();
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the size of an array");
  size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("enter the numbers");
  for(int i=0; i<size;i++)
  {
    arr[i]=sc.nextInt();
  }
   int[] sorted=ob.Sort(arr,size);
  System.out.println("sorted array");
for(int i:sorted)
  {
  	System.out.println(i);
  }
  System.out.println("enter the target to find");
  int target=sc.nextInt();
  int num=ob.searchInsert(sorted,target);
  if(num!=size)
  {
  if(target==sorted[num])
  {
    System.out.println("the target to be found in index "+num);
  }
  else{
    System.out.println("the target to insert:"+num);
  }
  }
  else 
    System.out.println("the target to insert:"+num);
  }
}