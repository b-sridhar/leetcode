package Problems;

import java.util.Stack;

public class ValidParentheses {

    public static boolean solution(String expr){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<expr.length(); i++){
            char curr = expr.charAt(i);

            if(curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
                continue;
            }

            if(stack.isEmpty())
                return false;

            char prev = stack.pop();;

            if(curr == ')'){
                if(prev == '{' || prev == '[')
                    return false;
            }else if(curr == '}'){
                if(prev == '(' || prev == '[')
                    return false;
            }else if(curr == ']'){
                if(prev == '(' || prev == '{')
                    return false;
            }
        }

        return (stack.isEmpty());
    }

    public static void main(String[] args){
        String expr = "({[]})";
        boolean output = solution(expr);
        System.out.println("Output: " + output);
    }
}
