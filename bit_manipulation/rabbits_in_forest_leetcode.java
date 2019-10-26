class Solution {
    public int numRabbits(int[] answers) {
        
        Map <Integer,Integer> hm=new HashMap <Integer,Integer>();
        int count=0;
        for(int i=0;i<answers.length;i++)
        {
           if(hm.containsKey(answers[i]))
           {
               int val=hm.get(answers[i]);
               hm.put(answers[i],val+1);
           }
            else
                hm.put(answers[i],1);
        }
        
        Set <Map.Entry<Integer,Integer>> st=hm.entrySet();
          for (Map.Entry< Integer,Integer> me:st) 
           { 
              
              int key=me.getKey();
              int val=me.getValue();
              if(key==0)
                   count+=val;
             else if(val<=key+1)
              {
                  
                  count+=(key+1);
                 
              }
              else 
              {
                  int m=val*key;
                  int v=m%(key+1);
                  count+=val+v;
              }
              
              
           } 
       return count;
    }
}