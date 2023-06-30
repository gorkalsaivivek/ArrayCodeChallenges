package src;
/*
https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/0/?track=DSASP-Searching&batchId=154
 */
public class SearchSortedArray {

    static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0;i<N;i++){
            if(K==arr[i]){
                return 1;
            }
        }
        return -1;


    }
}


class SearchSortedArrayStarter {
    public static void main(String[] args) {
        SearchSortedArray searchSortedArray=new SearchSortedArray();
        searchSortedArray.searchInSorted(new int[]{1,2,3,4,6},5,6);

    }
}
