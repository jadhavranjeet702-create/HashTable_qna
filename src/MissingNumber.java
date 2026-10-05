public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        return total - sum;
    }

    public static void main(String[] args) {

        int nums[] = {3, 0, 1};

        int result = missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }
}