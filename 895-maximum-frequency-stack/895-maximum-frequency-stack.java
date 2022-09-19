class FreqStack {

   
    //map to store frequency  
    HashMap<Integer,Integer> freq;
    //map to store stack of a given frequency
    HashMap<Integer,Stack<Integer>> map;
    
    int maxf = 0;
        
    public FreqStack() {
        //initialize
        freq = new HashMap();
        map = new HashMap();
    }
        
    
    public void push(int val) {
        int temp = freq.getOrDefault(val,0)+1;
        //1.adding element to freq
        freq.put(val,temp);
        
        //2.calculating the maxf
        maxf = Math.max(maxf,temp);
        
        //3.check if map has key of frequency
        if(!map.containsKey(temp))map.put( temp, new Stack<Integer>());
        
        //4.pushing the element to the stack 
        map.get(temp).push(val);
    }
    
    public int pop() {
        //1.get the value from top 
        int val = map.get(maxf).pop();
        
        //2.reduceing frequency of the element 
        freq.put(val,maxf-1);
        //check the size of a map which is == 0;
        if(map.get(maxf).size() == 0)maxf--;
        //4.return the value 
        return val;
    }
}


//==>Time complexity O(n)
//==>space complexity O(1)



/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */