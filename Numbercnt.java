import java.util.*;
class Numbercnt
{
public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int numsClone[] = nums.clone(); 
        Arrays.sort(nums);
       for(int i = 0 ; i < nums.length;i++) {
           if(!map.containsKey(nums[i])) {
               map.put(nums[i],i);
               System.out.println("key: "+i+"value: "+nums[i]);
           }
            
        }
        int[] result = new int[nums.length];
        for(int i = 0 ; i < numsClone.length;i++) {
           result[i] = map.get(numsClone[i]); 
           //System.out.println("key: "+i+"value: "+map.get(i));
        }
        return result;
    }
public static void main(String[] arg)
{
    Numbercnt ob= new Numbercnt();
    int[] num={8,1,3,3,4};
    int[] result=ob.smallerNumbersThanCurrent(num);
    for(int i:result)
    {
    System.out.println(i);
    }
}
}