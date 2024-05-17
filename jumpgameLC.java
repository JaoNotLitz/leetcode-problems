public class jumpgameLC {
    public static void main(String[] args) {
        int[] test1 = { 2, 3, 1, 1, 4 };
        int[] test2 = { 1, 2, 1, 0, 4 };
        System.out.println(canJump(test1));
        System.out.println(canJump(test2));
    }

    public static boolean canJump(int[] nums) {
        boolean variable=true;
        for (int i = 0; i < nums.length; i++) {
            i= i+nums[i];
            if (i>=nums.length-1) {
                return variable;
            }
            int maxValue=0;
            for (int j = i; j <= i+nums[i]; j++) {
                //find max value
                if (maxValue<=nums[j]||j==i) {
                    maxValue=nums[j];
                }
            }
            if (maxValue==0) {
                return variable=false;
            }

        }
        return variable;
    }


}
