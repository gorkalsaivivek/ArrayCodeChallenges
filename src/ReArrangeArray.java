package src;

public class ReArrangeArray {

    static void arrange(long arr[], int n)
    {
        long result[] =new long[n];

        for(int i=0;i<n;i++){
            result[i]=arr[(int)arr[i]];
        }

        for(int i=0;i<n;i++){
            arr[i]=result[i];
            System.out.println(arr[i]);
        }
    }
}

class ReArrangeArrayStarter{
    public static void main(String[] args) {
        ReArrangeArray reArrangeArray=new ReArrangeArray();
        reArrangeArray.arrange(new long[] {1,0},2);
    }
}
