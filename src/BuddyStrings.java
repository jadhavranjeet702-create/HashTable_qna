public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {

            boolean seen[] = new boolean[26];

            for (int i = 0; i < s.length(); i++) {

                int index = s.charAt(i) - 'a';

                if (seen[index]) {
                    return true;
                }

                seen[index] = true;
            }

            return false;
        }

        int first = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {

                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        if (first == -1 || second == -1) {
            return false;
        }

        return s.charAt(first) == goal.charAt(second)
                && s.charAt(second) == goal.charAt(first);
    }

    public static void main(String[] args) {

        String s = "ab";
        String goal = "ba";

        boolean result = buddyStrings(s, goal);

        System.out.println("Buddy Strings: " + result);
    }
}