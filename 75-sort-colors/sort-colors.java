class Solution {
    public void sortColors(int[] arr) {
    int l=0;
    int m=0;
    int r=arr.length-1;
     while(m<=r){
        if(arr[m]==0){
            int temp=arr[l];
            arr[l]=arr[m];
            arr[m]=temp;
            m++;
            l++;
        }else if(arr[m]==2){
            int temp=arr[m];
            arr[m]=arr[r];
            arr[r]=temp;
         //   m++;
            r--;


        }else{
            m++;
        }
     }
    }
}