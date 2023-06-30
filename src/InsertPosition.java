package src;

public class InsertPosition {
    static int searchInsertK(int Arr[], int N, int k)
    {
        for(int i=0;i<N;i++){
            if(Arr[i]==k) {
                return i;
            }
            else if(Arr[i]>k){
                return i;
            }
        }
        return 0;
    }
}

class InsertPositionStarter {
    public static void main(String[] args) {
        InsertPosition insertPosition=new InsertPosition();
        System.out.println(insertPosition.searchInsertK(new int[]{1,3,5,6},4,5));
        System.out.println(insertPosition.searchInsertK(new int[]{1,3,5,6},4,2));

    }
}
