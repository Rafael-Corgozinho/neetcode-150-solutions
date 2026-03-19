import java.util.Stack;

class Solution{
    public boolean isValid(String s) {

        char openP = '(';
        char closeP =')';
        char openC = '[';
        char closeC = ']';
        char openCh = '{';
        char closeCh = '}';


       Stack<Character> parentheses = new Stack<>();
       for(char c: s.toCharArray()){

        if(c == openC || c == openP || c == openCh){
            parentheses.push(c);
        }
        else if(c == closeP || c == closeC || c == closeCh) {
                if(parentheses.isEmpty()) {
                    return false; 
                }
        

        if(c == closeP && parentheses.peek() == openP 
        || c == closeC && parentheses.peek() == openC 
        || c == closeCh && parentheses.peek() == openCh){
            parentheses.pop();
        } else{
            return false;
        } 
    }
}
    return parentheses.isEmpty();
}
}