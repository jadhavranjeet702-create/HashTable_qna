import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 19;

        boolean result = isHappy(n);

        System.out.println("Happy Number: " + result);
    }
}