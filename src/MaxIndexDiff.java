package src;

public class MaxIndexDiff {

    static int maxIndexDiff(int A[], int N) {

        int i=0;
        int maxResult=-1;

        while(i<=N-1){
            for(int j=N-1;j>=i;j--){
                if(A[i]<=A[j]) {
                    maxResult=Math.max(maxResult,j-i);
                    break;
                }
            }
            i++;
        }

    return maxResult;
    }
}

class MaxIndexDiffStarter {
    public static void main(String[] args) {
        MaxIndexDiff maxIndexDiff=new MaxIndexDiff();
        System.out.println( maxIndexDiff.maxIndexDiff(new int[]{34, 8, 10, 3, 2, 80, 30, 33, 1},9));
    }
}