class Solution {
    public String removeStars(String s) {
         if(s==null || s.length()==0) return s;
        
        Stack<Character> stack=new Stack<>();
        
        for(char x : s.toCharArray()){
            if(x=='*' && stack.size()>0) stack.pop();
            else if(x=='*') continue;
            else stack.push(x);
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
    }
}

//==> Time Complexity O(n)
//==> space Complexity O(n)