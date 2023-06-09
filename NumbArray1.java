import java.util.*;
class NumbArray1
{
  public int[] plusOne(int[] digits)
  {
    int size=digits.length;
    int[] digit=new int[size+1];
    for(int i=size-1; i>=0; i--) 
    {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
   
    digit[0]=1;
    return digit;
   }       
    public static void main(String[] arg)
{
  NumbArray1 ob=new NumbArray1();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  String num=sc.nextLine();
  int size=num.length();
  int[] ch=new int[size];
  for(int i=0;i<size;i++)
  {
    ch[i]=num.charAt(i)-'0';
  }
  int[] ar=ob.plusOne(ch);
 /* for(int i:ar)
  {
    System.out.println(i);
  }*/
 System.out.println(Arrays.toString(ar));
}
}