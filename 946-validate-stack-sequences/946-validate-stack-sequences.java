class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
         Stack<Integer> stack=new Stack<Integer>();
    int i=0;
    int n=pushed.length;
    
    for(int num:pushed)
    {
        stack.push(num);
        while(!stack.isEmpty() && stack.peek()==popped[i])
        {
            stack.pop();
            i++;
        }
    }
    
    return i==n;
    }
}

//==>Time complexity O(n)
//==>space complexity O(n)