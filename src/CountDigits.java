package src;

public class CountDigits {

    public static int countDigits(int n)
    {
        if (n==0) {
            return 1;
        }
        if (n<=9) {
            return 1;
        }
        return  1 + countDigits(n/10);
    }
}

class CountDigitsStarter {

    public static void main(String[] args) {
        CountDigits countDigits=new CountDigits();
        System.out.println( countDigits.countDigits(22));
    }
}
