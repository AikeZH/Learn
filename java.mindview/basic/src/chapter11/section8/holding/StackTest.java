package chapter11.section8.holding;

import util.Stack;

/**
 * @author zhanghua
 * @date 2020/9/24
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    /* Output:
    fleas has dog My
     */
}
