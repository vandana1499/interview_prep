class Solution {
    public int subarrayBitwiseORs(int[] A) {
       
      Set <Integer> prev=new HashSet<>();
      Set <Integer> res=new HashSet<>();
        prev.add(A[0]);
        res.add(A[0]);
        for(int i=1;i<A.length;i++)
        {
            Set <Integer> cur=new HashSet<>();
            cur.add(A[i]);
            res.add(A[i]);
            for(int x:prev)
            {
                cur.add(x|A[i]);
                res.add(x|A[i]);
            }
            prev=cur;
        }
        return res.size();        
    }
   
}