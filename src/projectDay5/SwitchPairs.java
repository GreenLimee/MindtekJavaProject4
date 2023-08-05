package projectDay5;

import java.util.Arrays;

public class SwitchPairs {
    public static void main(String[] args) {
/**
 * Write a method implementation that accepts array of String
 * as parameter and returns array of String with switched
 * the order of values in an array of Strings in a pairwise order.
 * Your method should switch the order of the first two values,
 * then switch the order of the next two, and so on.
 *
 * Example:
 *      .switchPairs(["four", "score", "and", "seven", "years", "ago"])-> return {"score", "four", "seven", "and", "ago", "years"}
 *      .switchPairs(["to", "be", "or", "not", "to", "be", "hamlet"]) -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
 *
 * @param words
 * @return switched pairs array
 */
        String[] words = new String[]{"four", "score", "and", "seven", "years", "ago"};
        System.out.println(Arrays.toString((switchPairs(words))));
    }

    public static String[] switchPairs(String[] words) {
        for (int i = 0; i < words.length; i = i + 2) {
            String temp = words[i];
            words[i] = words[i + 1];
            words[i + 1] = temp;
        }
        return words;
    }
}

