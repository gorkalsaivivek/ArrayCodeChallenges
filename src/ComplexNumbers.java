package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ComplexNumbers {
    private int realPart;
    private int imaginaryPart;

    public ComplexNumbers(int real,int imaginary) {
        this.realPart=real;
        this.imaginaryPart=imaginary;
    }

    public void plus(ComplexNumbers c) {
        this.realPart =  this.realPart + c.realPart;
        this.imaginaryPart=this.imaginaryPart + c.imaginaryPart;

    }

    public void multiply(ComplexNumbers c) {

        int localImginaryPart1=this.imaginaryPart;
        int localImaginaryPart2= c.imaginaryPart;

        this.imaginaryPart= this.realPart * c.imaginaryPart + this.imaginaryPart * c.realPart;
        this.realPart= this.realPart * c.realPart - (localImginaryPart1 * localImaginaryPart2);

    }

    public void print() {

        System.out.print(this.realPart + "+" + "i"+this.imaginaryPart);

    }

}


class ComplexNumbersStarter {

    public static void main(String[] args) {

     //   System.out.println(ComplexNumbersStarter.removeConsecutiveDuplicates("aabccba"));
        System.out.println(ComplexNumbersStarter.findUnique(new int[]{2, 3, 1, 6, 3, 6, 2}));
     //   System.out.println(ComplexNumbersStarter.removeConsecutiveDuplicates(""));

        }



    public static String removeConsecutiveDuplicates(String s) {

        if(s.length()==1 || s.length()==0){
            return s;
        }

        if(s.charAt(0)==s.charAt(1)){
            return removeConsecutiveDuplicates(s.substring(1,s.length()));
        }

        return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1,s.length()));

    }

    public static boolean RecursiveparseBoolExpr(String expression, char response, char oneFound, char twoFound) {

        if(expression.length()==0){

            if(response=='!'){
                if(oneFound=='f' || twoFound=='f'){
                    return true;
                }
                else
                    return false;

            }
            else if(response=='|'){
                if(oneFound=='f' && twoFound=='f'){
                    return false;
                }
                else
                    return true;
            }
            else if(response=='&'){
                if(oneFound=='t' && twoFound=='t'){
                    return true;
                }
                else
                    return false;
            }

            return false;
        }

        if(expression.charAt(0)=='f' || expression.charAt(0)=='t'){
            if(oneFound==Character.MIN_VALUE){
                oneFound=expression.charAt(0);
            }

            else if (twoFound==Character.MIN_VALUE){
                twoFound=expression.charAt(0);
            }

        }

        return RecursiveparseBoolExpr(expression.substring(1,expression.length()),response,oneFound,twoFound);
    }

    public static boolean parseBoolExpr(String expression) {
        char response=expression.charAt(0);

return RecursiveparseBoolExpr(expression.substring(1,expression.length()),response,Character.MIN_VALUE,Character.MIN_VALUE);
    }

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {

        if(disks==1){
            System.out.println(source + " " + destination);
            return;
        }
        towerOfHanoi(disks-1,source,destination,auxiliary);
        System.out.println(source + " " + destination);
        towerOfHanoi(disks-1,auxiliary,source,destination);



        // Write your code here

    }

    public static double findGeometricSum(int k){


        if(k==1){
            return 1 + 1/k;
        }



        return 1/Math.pow(2,k) + findGeometricSum(k-1);

    }

    public static boolean isStringPalindrome(String input) {

        if(input.length()<=1){
            return true;
        }

        if(input.charAt(0)==input.charAt(input.length())){
            return isStringPalindrome(input.substring(1,input.length()-1));
        }
        return false;
        // Write your code here

    }

    public static int convertStringToInt(String input){


        if(input.length()==0){
            return 0;
        }

        if(input.charAt(0)=='0'){
           return convertStringToInt(input.substring(1,input.length()));

        }
        return convertStringToIntRecursion(input);
    }

    public static int convertStringToIntRecursion(String input){
        return Integer.parseInt(input);
    }

    public static String addStars(String s) {
        if(s.length()<=1){
            return s;
        }

        if(s.charAt(0)==s.charAt(1)){
            return s.charAt(0) + "*" + s.charAt(1) + addStars(s.substring(1,s.length()));
        }
        return  s.charAt(0) + addStars(s.substring(1,s.length()));


    }

    public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashSet<Integer> result = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){
               if(arr1[i]==arr2[j] && !(result.contains(arr1[i])) ){
                   result.add(arr1[i]);
                   System.out.println(arr1[i] + " ");
                   break;
               }
           }
    }

    }

    public static int arrayEquilibriumIndex(int[] arr){

        int rightSum=0;
        int leftSum=0;
        for(int x: arr){
            rightSum+=x;
        }

        for(int i=0;i<arr.length;i++){
            leftSum+=arr[i];
            if(leftSum==rightSum){
                return i;
            }

            rightSum-=arr[i];
        }
        return -1;
    }

    public static int findUnique(int[] arr) {

        HashSet<Integer> result = new HashSet<>();

        for(int x: arr){
            result.add(x);
        }

        for(int x: arr){
            if(result.contains(x)) {
                return x;
            }
        }
        return -1;

    }
}