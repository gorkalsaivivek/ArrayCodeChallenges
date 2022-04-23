package src;

public class SumDigits {
    static int sum=0;
    // complete the function
    public static int sumOfDigits(int n)
    {
        int sumlocal=0;
        if(n>0){
            sumlocal+=n%10;
           sumOfDigits(n/10);
        }
        return sumlocal;
    }
}

class SumDigitsStarter {
    public static void main(String[] args) {
        SumDigits sumDigits=new SumDigits();
        sumDigits.sumOfDigits(64);
    }
}
