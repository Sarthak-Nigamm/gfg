import java.util.*;
class Solution {
    ArrayList<Integer> findTwoElement(int nums[]) {
        // code here
        int A = nums[0];
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                A = nums[i+1];
            }
            sum+=nums[i];
        }
        sum+= nums[nums.length-1];
        sum -= A;

        int aclsum = 0;
        for(int i =1; i<=nums.length; i++){
            aclsum +=i;
        }
       int B = Math.abs(aclsum-sum);
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(A);
       arr.add(B);
   return arr; }
}

