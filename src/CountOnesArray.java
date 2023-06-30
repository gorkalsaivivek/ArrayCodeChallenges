package src;
/*
https://practice.geeksforgeeks.org/problems/count-1s-in-binary-array-1587115620/0/?track=DSASP-Searching&batchId=154#
 */
public class CountOnesArray {

    public static int countOnes(int arr[], int N){
        int result=0;
        for(int i=0;i<N;i++){
            if(arr[i]==1){

                result++;
            }
        }
    return result;
    }
}

class CountOnesArrayStarter {
    public static void main(String[] args) {
        CountOnesArray countOnesArray=new CountOnesArray();
        countOnesArray.countOnes(new int[]{1,1,1,1,1,0,0,0} , 8);
    }


}
