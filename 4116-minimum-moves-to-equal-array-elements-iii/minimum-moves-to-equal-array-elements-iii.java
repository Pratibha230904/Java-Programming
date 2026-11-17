class Solution {
    public int minMoves(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=max){
                arr[i]++;
                count++;
                
            }
        }

        return count;
    }
}