package STRING;

import java.util.*;

public class Remove_all_adjacency_duplicate {

    public static String removeAdjacency(String str) {
//        StringBuilder output = new StringBuilder();
//        int n = str.length();
//        int i = 0;
//
//        while (i < n) {
//            // Check if the next character is out of bounds or different from the current character
//            if (i + 1 == n || str.charAt(i) != str.charAt(i + 1)) {
//                output.append(str.charAt(i));
//                i++;
//            } else {
//                // Skip all adjacent duplicates
//                while ( str.charAt(i) == str.charAt(i + 1)) {
//                    i++;
//                }
//                i++;
//            }
//        }
//
//        String outputStr = output.toString();
//
//        if (outputStr.length() != str.length()) {
//            return removeAdjacency(outputStr);
//        } else {
//            return outputStr;
//        }

        Stack<Character> stack = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (!stack.isEmpty() && stack.peek() == str.charAt(i)) {
                while (i < n && stack.peek() == str.charAt(i)) {
                    i++;
                }
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }

        StringBuilder output = new StringBuilder();
        for (char c : stack) {
            output.append(c);
        }

        String outputStr = output.toString();
        if (outputStr.length() != str.length()) {
            return removeAdjacency(outputStr);
        } else {
            return outputStr;
        }




    }

    public static void main(String[] args) {
        String str = "axyyxb";
        System.out.println(removeAdjacency(str));
    }
}
