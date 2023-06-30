package src;

public class SumTwoNumbers {

    int sum(int a , int b)
    {
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits

            a = a ^b; //SUM of two bits is A XOR B

            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;

    }
}

class SumTwoNumbersStarter {
    public static void main(String[] args) {
        SumTwoNumbers sumTwoNumbers=new SumTwoNumbers();
        sumTwoNumbers.sum(5,3);

    }
}
