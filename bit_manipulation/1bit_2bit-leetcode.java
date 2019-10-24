class Solution {
    public boolean isOneBitCharacter(int[] bits) {
     
       
        for(int i=0;i<bits.length;i++)
        {
            if(bits[i]==1)
            {
                if(bits[i+1]==1 || bits[i+1]==0 && i<bits.length)
                    i++;
                  if(i==bits.length-1)
                return false;
            }
          
            
        }
        
        return true;
      
}
}