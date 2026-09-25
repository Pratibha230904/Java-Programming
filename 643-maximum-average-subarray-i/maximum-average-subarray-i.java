class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int left=0;
        int right=0;
        double sum=0;
        double avg=Integer.MIN_VALUE;
        while(right<arr.length){
            sum+=arr[right];
            if(right-left+1==k){
              double  avg1=sum/k;
                if(avg1>avg){
                    avg=avg1;
                    

                }
                sum-=arr[left];
                    left++;
            }
            right++;
        }
        return avg;
    }
}