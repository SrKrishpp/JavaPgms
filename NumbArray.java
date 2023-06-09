import java.util.*;
class NumbArray
{
  public int[] plusOne(int[] digits)
  {
    int size=digits.length;
    int temp =digits[size-1]+1;
    if (temp==10)
    {
      int[] digit=new int[size+1];
      digit[size-1]=1;
      digit[size]=0;
      for(int i=0;i<size-1;i++)
      {
        digit[i]=digits[i];
      }
    return digit;
  }
  else
    digits[size-1]=temp;
   return digits;
  }
public static void main(String[] arg)
{
  NumbArray ob=new NumbArray();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  String num=sc.nextLine();
  int size=num.length();
  int[] ch=new int[size];
  for(int i=0;i<size;i++)
  {
    ch[i]=num.charAt(i)-'0';
  }
  /* for (int i : ch) {
        System.out.println(i);
    }*/
    int[] ar=ob.plusOne(ch);
  for(int i:ar)
  {
    System.out.println(i);
  }  
  System.out.println(Arrays.toString(ar));
}
}