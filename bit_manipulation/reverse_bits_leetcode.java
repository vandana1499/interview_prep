public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int c=32;
        List <Integer> li=new ArrayList<>();
        while(c>0)
        {
            int t=n&1;
            li.add(t);
            n=n>>1;
            c--;
        }
        int res=0;
        for(int i=0;i<li.size();i++)
        {
            res=res<<1;
            res=res|li.get(i);
            
        }
        return res;
    }
}
