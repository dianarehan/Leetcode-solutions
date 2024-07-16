import java.util.HashMap;
import java.util.Vector;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Object> myMap= new HashMap<>();
        int res [] = new int [2];
        for(int i =0; i<nums.length;i++){
            if(!myMap.containsKey(nums[i]))
                myMap.put(nums[i],i);
            else{
                Object prevVal = myMap.get(nums[i]);
                Vector<Object> u = new Vector<>();
                u.add(prevVal);
                u.add(i);
                myMap.put(nums[i],u);
            }
        }
        for(int i =0;i<nums.length;i++){
            int tryx = target-nums[i];
            if(myMap.containsKey(tryx)){
                Object index1 = myMap.get(tryx);
                Object index2 = myMap.get(nums[i]);
                if(index1 instanceof Integer && index1!=index2){
                res[0]=Math.min((Integer)index1,(Integer)index2);
                res[1]=Math.max((Integer)index1,(Integer)index2); 
                break;                   
                }
                else if (index1 instanceof Vector) {
                    Vector<Object> indices = (Vector<Object>) index1;
                    for (Object obj : indices) {
                        if ((int) obj != i) {
                            res[0] = i;
                            res[1] = (int) obj;
                            break;
                        }
                    }
                }

            }
        }
        return res;
        }
    }
