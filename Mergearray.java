import java.util.*;
class Mergearray
{
 public void merge(int[] nums1, int m, int[] nums2, int n) 
  {
        int[] marr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m)
       {
        marr[k++]=nums1[i++];
       }        
        while(j<n)
        {
         marr[k++]=nums2[j++];
        }
    Mergearray.Sort(marr,k);
       
 for(i=0;i<m+n;i++)
  {
  	System.out.println(marr[i]);
  }
}
public static int[] Sort(int[] a,int size)
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
 public static void main(String[] args)
    {
    Mergearray ob=new Mergearray();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of first array");
    int m=sc.nextInt();
    int[] ar1=new int[m];
    System.out.println("enter the numbers");
    for(int i=0; i<m;i++)
    {
      ar1[i]=sc.nextInt();
    }
    ar1=ob.Sort(ar1,m);
    System.out.println("enter the size of second array");
    int n=sc.nextInt();
    int[] ar2=new int[n];
    System.out.println("enter the numbers");
    for(int i=0;i<n;i++)
    {
      ar2[i]=sc.nextInt();
    }
    ar2=ob.Sort(ar2,n);
    System.out.println("going merge");
    ob.merge(ar1,m,ar2,n);
    }
}