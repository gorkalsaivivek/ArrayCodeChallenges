package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitSwap {

    List<Integer> evenNumbers=new ArrayList<>();
    List<Integer> oddNumbers=new ArrayList<>();




    public int swapDigits(int num){
        List<List<Integer>> result=recursionDigits(5678);
        String stringNum=String.valueOf(num);
      Collections.sort(evenNumbers);
      Collections.sort(oddNumbers);
        for(int i=0;i<stringNum.length();i++) {
            if(Integer.parseInt(String.valueOf(stringNum.charAt(i)))%2==0){

            }
        }

        return 0;

    }


    public List<List<Integer>> recursionDigits(int n){
        int[] evenNum =new int[4];
        if(n>0){
            recursionDigits(n/10);
            if(n%2==0){
                evenNumbers.add(n%10);
            }
            else {
                oddNumbers.add(n%10);
            }


        }
        List<List<Integer>> result=new ArrayList<>();
        result.add(evenNumbers);
        result.add(oddNumbers);
        return result;
    }
}

class DigitSwapStarter{
    public static void main(String[] args) {
        DigitSwap digitSwap=new DigitSwap();
        digitSwap.swapDigits(5876);

        }

    }


