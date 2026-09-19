class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        if(a.length!=b.length){
            return false;
        }

    
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    b[j]='0';
                    break;

                } 
                
            }
        }

        for(int k=0;k<b.length;k++){
            if(b[k]!='0'){
                return false;
            }
        }

        return true;
        
        
        
    }
}