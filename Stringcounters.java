import java.util.*;
class Stringcounters {
    public static void main(String[] arg) {
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String word1= sc.nextLine();
        int i;
        char ch[] = new char[word1.length()];
        int len=word1.length();
        for(i=0;i<len;i++)
        {
         ch[i]=word1.charAt(i);
         int count=0;
         for(int j=0;j<=i;j++)
        {
        if((word1.charAt(i)) == (ch[j]))

        {
            count++;
        }
        
    }
    
    System.out.print(ch[i]+""+count+" ");
    
    //int j=0;
    /*for(i = 0; i < word1.length(); i++) {
            count[(int) word1.charAt(i)]++;
        }
   for(i = 0; i<300; i++) {
            if (count[i] != 0) {
                System.out.println((char)i + ":" + count[i]);
                //j++;
            }*/
        }
    }
}
