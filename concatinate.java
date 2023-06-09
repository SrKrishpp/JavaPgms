import java.util.*;
class concatinate {
    public String truncateSentence(String s, int k) {

        String[] arg=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++)
        {
            sb.append(arg[i]+" ");
        }
         return sb.toString();
            
    }
    public static void main(String[] args) {

        concatinate ob=new concatinate();
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String str= sc.nextLine(); 
        System.out.print("Enter a number: ");  
        int k= sc.nextInt(); 
        String wrd=ob.truncateSentence(str,k);
        System.out.print("concatinated string:  "+ wrd);
    
    }

}