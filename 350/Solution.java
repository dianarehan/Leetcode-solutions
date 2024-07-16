class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freqArray[] = new int[(nums1.length>nums2.length)? getMax(nums2)+1: getMax(nums1)+1];
        int smallArray[] = (nums1.length>nums2.length)? nums2: nums1;
        int bigArray[] = (nums1.length>nums2.length)? nums1: nums2;

        List<Integer> res = new ArrayList<>(); 

        for(int i =0;i<smallArray.length;i++){
            freqArray[smallArray[i]]++;
        }
        for (int i = 0; i < bigArray.length; i++) {
            if (bigArray[i] < freqArray.length && freqArray[bigArray[i]] > 0) {
                freqArray[bigArray[i]]--;
                res.add(bigArray[i]);
            }
        }
        Object[] objArray = res.toArray();
        int[] intArray = new int[objArray.length];
        for (int i = 0; i < objArray.length; i++) {
            intArray[i] = (int) objArray[i];
        }
        return intArray;
    }

    private int getMax(int [] arr){
        int maxSoFar = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxSoFar) 
                maxSoFar =arr[i];
        }
        return maxSoFar;
    }
}
