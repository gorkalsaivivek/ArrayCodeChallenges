package src;

import java.util.*;

public class RecursionClass {

    public static boolean checkABRecusion(String input) {
        if (input.length() == 0) {
            return true;
        }

        if (input.charAt(0) == 'a') {
            return checkABRecusion(input.substring(1, input.length()));
        }

        if (input.substring(0, 2).equals("bb")) {
            return checkABRecusion(input.substring(2, input.length()));
        }
        return false;
    }

    public static boolean checkAB(String input) {
        if (input.length() == 0) {
            return true;
        }
        if (input.charAt(0) != 'a') {
            return false;
        } else {
            return checkABRecusion(input.substring(1, input.length()));
        }
    }



    public static int pairSum(int[] arr, int num) {
        int count=0;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                if(arr[i]+arr[j]==num){
                    count++;
                }
            }
        }
        return count;
    }


    public static  int findUnique(int arr[]) {
        int XOR=0;
        for (int i=0;i<arr.length;i++){
            XOR ^=arr[i];
        }
        return XOR;
    }

    public static boolean checkSequence(String a, String b) {

        if(a.length()==0 && b.length()!=0){
            return false;
        }
        if(b.length()==0 && a.length()!=0){
            return true;
        }
        if(a.length()==0 && b.length()==0){
            return true;
        }
        if(b.charAt(0)!=a.charAt(0)){
            return checkSequence(a.substring(1),b);
        }
        else if(b.charAt(0)==a.charAt(0)){
            return checkSequence(a.substring(1),b.substring(1));
        }
        return false;

    }

    public static int maximumProfit(int budget[]) {
        int maxProfit=0;
        int currentProfit=0;
        Arrays.sort(budget);

        for(int i=0;i<budget.length;i++){
            currentProfit=budget[i] * (budget.length-i);
            if(maxProfit<currentProfit){
                maxProfit=currentProfit;
            }
        }
        return  maxProfit;
    }
    public static boolean splitArray(int input[]) {

        List<Integer> groupBy5=new ArrayList<>();
        List<Integer> groupBy3=new ArrayList<>();
        List<Integer> groupByAll=new ArrayList<>();


        int sumBy5=0,sumBy3=0,subByAll=0;

        for(int i=0;i<input.length;i++){

            if(input[i]%5==0){
                sumBy5+=input[i];
                groupBy5.add(input[i]);
            }
           else if(input[i]%3==0 && input[i]%5!=0){
                sumBy3+=input[i];
                groupBy3.add(input[i]);
            }
           else {
                subByAll+=input[i];
                groupByAll.add(input[i]);
            }
        }

        if(sumBy5>sumBy3){
            if(sumBy5+subByAll==sumBy3){
                return true;
            }
            else
                return false;
        }
        else if (sumBy5<sumBy3){
            if(sumBy3+subByAll==sumBy5){
                return true;
            }
            else
                return false;
        }


        return false;


    }

}

class RecursionClassStarter {


    public static void main(String[] args) {
        RecursionClass recursionClass=new RecursionClass();
      // RecursionClass.findUnique(new int[]{2 ,4 ,7 ,2 ,7});
      //  System.out.println(recursionClass.checkSequence("abcde","aeb"));
       // System.out.println(recursionClass.checkSequence("abchjsgsuohhdhyrikkknddg","coding"));
       // System.out.println(recursionClass.maximumProfit(new int[]{30,20, 53, 14}));
       // System.out.println(recursionClass.maximumProfit(new int[]{34, 78, 90, 15, 67}));
      //  System.out.println(recursionClass.splitArray(new int[]{1 ,2}));
        System.out.println(recursionClass.splitArray(new int[]{1 ,4 ,3}));
    }


}
