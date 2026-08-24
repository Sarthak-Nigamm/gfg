class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        
        int m1[] = new int[256];
        int m2[] = new int[256];
        for(int i =0; i<s2.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(m1[ch1]!=m2[ch2]){
                return false;
            }
            
            m1[ch1] = i+1;
            m2[ch2] = i+1;
            
        }
   return true; }
}