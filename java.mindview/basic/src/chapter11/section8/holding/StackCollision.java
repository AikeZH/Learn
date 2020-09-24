package chapter11.section8.holding;


import util.Stack;

/**
 * @author zhanghua
 * @date 2020/9/24
 */
public class StackCollision {
    public static void main(String[] args) {
        util.Stack<String> stack = new util.Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack2.push(s);
        }
        while (!stack2.empty()){
            System.out.print(stack2.pop()+" ");
        }
    }
    /* Output:
    fleas has dog My
    fleas has dog My
     */
}
