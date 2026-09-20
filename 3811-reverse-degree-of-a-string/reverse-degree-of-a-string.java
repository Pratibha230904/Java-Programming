class Solution {
    public int reverseDegree(String s) {
        int numb=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ne=(int)('z'-ch+1);
           numb +=ne*(i+1);

          
        }
        return numb;
    }
}