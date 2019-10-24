class Solution {
    public int[] countBits(int num) {
        
        int arr[]=new int[num+1];
        
        for(int i=0;i<=num;i++)
        {
            int n=i;
            int c=0;
            if(n==0)
            {
                arr[i]=0;
            }
            else
            {
                while(n>0)
                {
                    n=n&n-1;
                    c++;
                }
                arr[i]=c;
                
            }
            
                
        }
        return arr;
    }
}