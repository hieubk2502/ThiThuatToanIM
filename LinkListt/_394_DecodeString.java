package LinkListt;

import java.util.Stack;

public class _394_DecodeString {
    public static String decodeString(String s){
        int n=s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c= s.charAt(i);
            if (c==']'){
                //Main process

                // pop until meet '['  "2[abc"
                String loopString ="";
                while (stack.peek() !='['){
                    loopString = stack.pop() +loopString;
                }
                // remove '['
                stack.pop();

                // get number "2["
                String numberString = "";
                while (stack.isEmpty() ==false && Character.isDigit(stack.peek())){
                    numberString =stack.pop()+ numberString; //==2
                }
                int nLoop = Integer.parseInt(numberString);
                // repeat the string
                loopString = loopString.repeat(nLoop);
                // add result back to the stack
                for (int j = 0; j < loopString.length(); j++) {
                    stack.push(loopString.charAt(j));
                }
            }else {
                stack.push(c);
            }
        }
        String result ="";
        while (stack.isEmpty()==false){
            result=stack.pop()+result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("2[abc]"));
    }
}
