class Solution {
    public int smallestIndex(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
          
            int check=Integer.MAX_VALUE;
            int sum=0;
           while(arr[i]!=0){
            int last=arr[i]%10;
            sum +=last;
            arr[i]/=10;
        
           }

           if(sum==i && sum<check){
            check=sum;
            return i;
           }
            
        }
        return -1;
    }
}