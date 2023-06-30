package src;

/*
https://practice.geeksforgeeks.org/problems/digital-root/1/?track=DSASP-Recursion&batchId=154
 */
public class DigitalRoot {
    static int result=0;
    // complete the function
    public static int digitalRoot(int n)
    {
        result+=n%10;
        if(n==0){
            return 1;
        }
        if( n<=9){
            return n;
        }

        digitalRoot(n/10);
        if(result>9) {
            result+=result%10;
            digitalRoot(result/10);
        }
        return result;
    }
}

class DigitalRootStarter {
    public static void main(String[] args) {
        DigitalRoot digital=new DigitalRoot();
        System.out.println(digital.digitalRoot(99));
    }

}
