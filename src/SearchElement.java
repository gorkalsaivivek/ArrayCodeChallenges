package src;
/*
https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/0/?track=DSASP-Searching&batchId=154
 */
public class SearchElement {
    static int search(int arr[], int N, int X)
    {
        for(int i=0;i<N;i++){
            if(X==arr[i]){
                return i;
            }
        }

        return -1;

    }
}

class SearchElementStarter {
    public static void main(String[] args) {
        SearchElement searchElement=new SearchElement();
        System.out.println(searchElement.search(new int[]{1,2,3,4,5},5,5));
    }

}
