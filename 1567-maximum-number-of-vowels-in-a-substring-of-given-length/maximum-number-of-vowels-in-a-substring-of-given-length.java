class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int right=0;
        int count=0;
        char[]arr=s.toCharArray();
        int mincount=Integer.MIN_VALUE;

        while(right<arr.length){
            if(arr[right]=='a'||arr[right]=='e'||arr[right]=='i'||arr[right]=='o'||arr[right]=='u'){
                count++;
            }
            if(right-left+1==k){
                if(count>mincount){
                    mincount=count;
                }
            
                if(arr[left]=='a'||arr[left]=='e'||arr[left]=='i'||arr[left]=='o'||arr[left]=='u'){
                    count--;
                }

                left++;
                

            } 
              right++;   
              }
        
        return mincount;
    }
}     