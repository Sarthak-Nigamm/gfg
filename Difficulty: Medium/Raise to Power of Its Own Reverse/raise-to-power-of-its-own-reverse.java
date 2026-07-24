class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int copy = n;
        int pow = 0;
        while(copy!=0){
            int ld = copy%10;
            copy/=10;
            if(ld==0){
                continue;
            }
            pow = pow*10 + ld;
            
        }
  return (int)Math.pow(n,pow);  }
}
