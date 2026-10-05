import java.util.HashSet;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

        // Jewels ke characters store karo
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        int count = 0;

        // Stones me check karo ki jewel hai ya nahi
        for (int i = 0; i < stones.length(); i++) {

            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = numJewelsInStones(jewels, stones);

        System.out.println("Number of Jewels: " + result);
    }
}