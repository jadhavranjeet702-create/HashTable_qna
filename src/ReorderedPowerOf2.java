import java.util.Arrays;

public class ReorderedPowerOf2 {

    public static boolean reorderedPowerOf2(int n) {

        char[] original = String.valueOf(n).toCharArray();

        Arrays.sort(original);

        for (int i = 0; i < 31; i++) {

            int power = 1 << i;

            char[] digits = String.valueOf(power).toCharArray();

            Arrays.sort(digits);

            if (Arrays.equals(original, digits)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 10;

        boolean result = reorderedPowerOf2(n);

        System.out.println("Can be Reordered: " + result);
    }
}