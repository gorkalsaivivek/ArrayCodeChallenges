package src;
/*
https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion {
    
    public int firstBadVersion(int n) {

        int start=0;
        int end=n;
        int res=0;

        int mid=start+(end-start)/2;

        while(start<=end){

            if(isBadVersion(mid)){
                res=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }

        return res;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
