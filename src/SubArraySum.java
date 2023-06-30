package src;

import java.util.ArrayList;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int sum=0;
        int start=0;
        ArrayList<Integer> result=new ArrayList<Integer>();

        for(int i=start;i<n;i++){

            sum+=arr[i];
            if(sum==s){
                result.add(start+1);
                result.add(i+1);
                return result;
            }
            else if (sum>s){
                sum=0;
                start++;
                i=start-1;
            }
            else {

            }
        }
        if(result.size()==0){
            result.add(-1);
            return result;
        }
        return result;
    }
}


class SubArraySumStarter {
    public static void main(String[] args) {
        SubArraySum subArraySum=new SubArraySum();
        System.out.println(subArraySum.subarraySum(new int[]{1,2,3,7,5},5,12));
        System.out.println(subArraySum.subarraySum(new int[]{1,2,3,4,5,6,7,8,9,10},10,15));

    }
}