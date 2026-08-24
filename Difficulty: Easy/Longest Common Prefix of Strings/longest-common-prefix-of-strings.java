class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr == null || arr.length ==0) return "";
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int index = 0;
        while(index<first.length()&& index<last.length()){
            if(first.charAt(index) == last.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        
  return first.substring(0,index);  }
}