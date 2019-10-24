class Solution {
    public boolean hasAlternatingBits(int n) {
       
       
        int last=n%2;
         n=n>>1;
        while(n>0)
        {
            int cur=n%2;
            if(cur==last)
                return false;
            last=cur;
            n=n>>1;
        }
        return true;
    }
}