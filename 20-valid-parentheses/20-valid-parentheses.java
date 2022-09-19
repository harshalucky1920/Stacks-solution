class Solution {
    public boolean isValid(String s) {
Deque<Character> openParens = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length; i++){
            char c = chars[i];
            
            if(c == '(' || c == '{' || c == '['){
                openParens.push(c);
            } else{
                if(openParens.isEmpty()){
                    return false;
                }
                
                char match = openParens.pop();
                
                if(c == '}' && match != '{'){
                    return false;
                }
                
                if(c == ']' && match != '['){
                    return false;
                }
                
                if(c == ')' && match != '('){
                    return false;
                }
            }
        }
        
        return openParens.isEmpty();
    }
}

//==>Time complexity O(n)
//==>space complexity O(n)
        
