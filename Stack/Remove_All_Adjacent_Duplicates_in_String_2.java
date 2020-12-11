package Stack;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_2 {
    class CharCount {
        char c;
        int count;
        CharCount(char c, int count){
            this.c = c;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<CharCount> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && c == stack.peek().c){
                if(stack.peek().count != k-1){
                    stack.peek().count += 1;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(new CharCount(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            int i = 0;
            CharCount curPeek = stack.pop();
            while(i < curPeek.count){
                sb.append(curPeek.c);
                i++;
            }
        }

        return sb.reverse().toString();
    }
}
