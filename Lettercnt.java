import java.util.*;
class Lettercnt
	{
	public static void Lett(String str)
	{
		HashMap<Character, Integer> arr=new HashMap<>();
		char[] charray=str.toCharArray();
		//char[] chclone = charray.clone();
		for(int i = 0 ; i < charray.length;i++)
		{
			if(arr.containsKey(charray[i]))
			{
				arr.put(charray[i],arr.get(charray[i])+1);
			}
			else{
				arr.put(charray[i],1);
			}
		}
		/*for(int i = 0 ; i < chclone.length;i++) {
           System.out.print(chclone[i]+""+arr.get(chclone[i])+" "); 
        }*/
		for(Map.Entry entry:arr.entrySet())
		{
			System.out.print(entry.getKey()+""+entry.getValue()+" ");
		}
	}

	public static void main(String[] args) {
		Lettercnt ob=new Lettercnt();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
    	String str = sc.next();
    	ob.Lett(str);
	
	}
}