class Solution {
    public int lengthOfLongestSubstring(String s) {
        int biggest = 0;
        HashSet<Character> newList = new HashSet<>();
        for(int i=0;i<s.length();i++){
            newList.clear();
            newList.add(s.charAt(i));
            if(newList.size()>biggest){
                biggest=newList.size();
            }
             for(int j=i+1;j<s.length();j++){
                 if(!newList.contains(s.charAt(j))){
                     newList.add(s.charAt(j));
                         if(newList.size()>biggest)
                           biggest=newList.size();
                     
                 }else{
                     newList.clear();
        
                     break;
                 }              
                 
             }
            
        }
       return biggest;
    }
}
