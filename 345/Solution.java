class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while(left<right){
            while(left<right && !vowelDetected(arr[left])){
                left++;
            }
            while(left<right && !vowelDetected(arr[right])){
                right--;
            }
            if(left<right){
                char temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
                }
        }

        return new String(arr);
    }
    private boolean vowelDetected(char c){
        if(c == 'a'||c=='e'||c=='i'||c=='u'||c=='A'||c=='E'||c=='I'||c=='o'||c=='O'||c=='U')
            return true;
        return false;
    }
}
