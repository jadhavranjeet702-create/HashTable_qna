import java.util.HashMap;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int length = 0;
        boolean odd = false;

        for (int count : map.values()) {

            if (count % 2 == 0) {
                length = length + count;
            } else {
                length = length + count - 1;
                odd = true;
            }
        }

        if (odd) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {

        String s = "abccccdd";

        int result = longestPalindrome(s);

        System.out.println("Longest Palindrome Length: " + result);
    }
}
