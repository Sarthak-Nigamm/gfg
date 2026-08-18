class Solution {
    public String removeOuter(String s) {
        // code here
        int count =0;
        String str = "";
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) =='('){
                if(count>0){
                    str+=s.charAt(i);
                }
                count++;
            }
            else{
                count--;
                 if(count>0){
                    str+=s.charAt(i);
                }
            }
        }
   return str; }
}