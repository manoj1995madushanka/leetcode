public class TwoSum {

    private static int[] getIndexes(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //if (nums[i] == nums[j]) {
                    //  indexes = new int[]{j, j};

                    //} else {
                    indexes = new int[]{i, j};

                    //}
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;

        int[] result = getIndexes(arr, target);
        System.out.println(result[0] + "" + result[1]);

    }
}
