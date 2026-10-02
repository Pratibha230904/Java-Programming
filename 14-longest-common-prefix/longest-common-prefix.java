class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                String word=strs[j];
                if(i>=word.length() || strs[0].charAt(i)!=word.charAt(i)){
                     return sb.toString();
                  
                }
            }
            sb.append(strs[0].charAt(i));
           
            
        }
        return sb.toString();
    }
}