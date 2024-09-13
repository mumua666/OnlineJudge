package Array;

import java.util.Stack;

public class P844 {

    String getNewString(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (!ch.equals('#')) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        String strNew = "";
        for (Character ch : stack) {
            strNew += ch;
        }
        return strNew;
    }

    public boolean backspaceCompare(String s, String t) {
        return getNewString(s).equals(getNewString(t));
    }

    // Official Solutiion

    // public boolean backspaceCompare(String S, String T) {
    // return build(S).equals(build(T));
    // }

    // public String build(String str) {
    // StringBuffer ret = new StringBuffer();
    // int length = str.length();
    // for (int i = 0; i < length; ++i) {
    // char ch = str.charAt(i);
    // if (ch != '#') {
    // ret.append(ch);
    // } else {
    // if (ret.length() > 0) {
    // ret.deleteCharAt(ret.length() - 1);
    // }
    // }
    // }
    // return ret.toString();
    // }

    public static void main(String[] args) {
        System.out.println(new P844().getNewString("a##c"));
        System.out.println(new P844().getNewString("#a#c"));
    }
}
