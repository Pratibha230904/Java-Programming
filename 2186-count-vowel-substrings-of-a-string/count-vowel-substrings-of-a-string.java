class Solution {
    public int countVowelSubstrings(String word) {
         int count=0;
        for(int i =0;i<word.length();i++){
            HashSet<Character> se=new HashSet<>();
           
            for(int j=i;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    se.add(ch);
                }else{
                    break;
                }

                  if(se.size()==5){
                count++;

            }

            }

          
        }

        return count;
    }
}