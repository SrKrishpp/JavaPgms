import java.util.*;
class Peak {
public int check(int[] a,int size)
{
 int i=0;
 int j=size-1;
 while(i<size && j>0)
 {
 	if(a[i]>=a[j])
 	{
 		j--;
         //amin=a[j];

 	}
 	else
 	{
 		i++;
 		//amin=a[i];
 		//j++;
    }

 }
 //System.out.println("maximum no:"+amin);
 return i;

}
public int[] rev(int[] a,int size)
{
	int[] arev=new int[size];
	int j=0;
	for(int i=size-1;i>=0;i--)
	{
      arev[j]=a[i];
      j++;
	}
	return arev;
}
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
public int Dupli(int[] ar,int size)
{
	
	int j=0;
	int[] dup=new int[size];
	for(int i=0;i<size-1;i++)
	{
		if(ar[i]!=ar[i+1])
    {
			dup[j]=ar[i];
      j++;
    }
	}
  dup[j++]=ar[size-1];
  for(int i=0;i<j;i++)
  {
   ar[i]=dup[i];
  }
	return j;
}
public static void main(String[] arg)
{
  
  int size;
  Peak ob= new Peak();
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the size of an array");
  size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("enter the numbers");
  for(int i=0; i<size;i++)
  {
    arr[i]=sc.nextInt();
  }
  
  int ind=ob.check(arr,size);
  System.out.println("index is"+ ind);
  System.out.println("max value:"+arr[ind]);
  int pivot=arr[ind];
  int[] arev=ob.rev(arr,size);
  System.out.println("reversed array");
  for(int i:arev)
  {
  	System.out.println(i);
  }
  int[] sorted=ob.Sort(arr,size);
  System.out.println("sorted array");
for(int i:sorted)
  {
  	System.out.println(i);
  }
int n=ob.Dupli(sorted,size);
System.out.println("duplicate");
for(int i=0;i<n;i++)
  {
  	System.out.println(arr[i]);
  }
}
}