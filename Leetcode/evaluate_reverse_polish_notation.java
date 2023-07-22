package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class evaluate_reverse_polish_notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"4","13","5","/","+"};
		System.out.println(evalRPN(tokens));

	}
	
    public static int evalRPN(String[] tokens) {
    	Stack <Integer> stack = new Stack<>();
    	int a;
    	for (String i : tokens) {
    		if (i == "-") {
    			a = stack.pop();
    			stack.push(stack.pop() - a);
    		}
    		else if (i == "+") {
    			a = stack.pop();
    			stack.push(stack.pop() + a);
    		}
    		else if (i == "/") {
    			a = stack.pop();
    			stack.push(stack.pop() / a);
    		}
    		else if (i == "*") {
    			a = stack.pop();
    			stack.push(stack.pop() * a);
    		}
    		else stack.push(Integer.valueOf(i));
    		
    	}

        return stack.peek();

    }

}
