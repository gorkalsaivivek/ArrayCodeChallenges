package src;

public class PivotIndex {

    public int pivotIndex(int[] nums) {

        if (nums.length == 0)
            return -1;
        int leftSum = 0, rightSum = 0;
        for (int num : nums)
            rightSum += num;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}

class PivotIndexStarter {
    public static void main(String[] args) {
        PivotIndex pivotIndex=new PivotIndex();
        System.out.println(pivotIndex.pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex.pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex.pivotIndex(new int[]{2,1,-1}));

    }
}
