import java.util.HashSet;

public class FairCandySwap {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceTotal = 0;
        int bobTotal = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            aliceTotal = aliceTotal + aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            bobTotal = bobTotal + bobSizes[i];
        }

        int difference = (aliceTotal - bobTotal) / 2;

        HashSet<Integer> bob = new HashSet<>();

        for (int i = 0; i < bobSizes.length; i++) {
            bob.add(bobSizes[i]);
        }

        for (int i = 0; i < aliceSizes.length; i++) {

            int aliceBox = aliceSizes[i];
            int bobBox = aliceBox - difference;

            if (bob.contains(bobBox)) {
                return new int[]{aliceBox, bobBox};
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int aliceSizes[] = {1, 1};
        int bobSizes[] = {2, 2};

        int result[] = fairCandySwap(aliceSizes, bobSizes);

        System.out.println("Alice gives: " + result[0]);
        System.out.println("Bob gives: " + result[1]);
    }
}