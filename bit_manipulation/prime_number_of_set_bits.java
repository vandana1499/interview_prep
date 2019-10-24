class Solution {
    public int countPrimeSetBits(int L, int R) {
        
        int count=0;
        for(int i=L;i<=R;i++)
        {
            int n=i;
            int c=0;
            while(n>0)
            {
                n=n&n-1;
                c++;
            }
            int x=0;
            for(int j=1;j<=c;j++)
            {
                if(c%j==0)
                    x++;
            }
            if(x==2)
                count++;
        }
        
        return count;
    }
}