package src;

/*
https://leetcode.com/problems/search-insert-position/
*/

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int start=0;
        int end=nums.length;
        int res=0;
        int mid=0;

        while(start<end){
            mid=start+ (end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
                res=mid;

            }
            else if(nums[mid]<target) {
                start=mid+1;
                res=mid;
            }
            else {
                return mid;
            }

        }
        return res;
    }
}

class SearchInsertPositionStarter {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition= new SearchInsertPosition();
        searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2);
    }

}
