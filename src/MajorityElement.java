public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int count = 0;
        int majority = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                majority = nums[i];
            }

            if (nums[i] == majority) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }

    public static void main(String[] args) {

        int nums[] = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}