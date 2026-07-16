class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int count[] = new int[n+1];
        for(int i =0; i<arr.length; i++){
            count[arr[i]]++;
        }
        for(int i =1; i<count.length; i++){
            list.add(count[i]);
        }
   return list; }
}
