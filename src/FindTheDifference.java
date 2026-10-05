import java.util.HashMap;

public class FindTheDifference {

    public static char findDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                return ch;
            }

            if (map.get(ch) == 1) {
                map.remove(ch);
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }

        return ' ';
    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        char result = findDifference(s, t);

        System.out.println("Added Character: " + result);
    }
}