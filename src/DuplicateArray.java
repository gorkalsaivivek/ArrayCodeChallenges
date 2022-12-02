package src;

import java.util.*;

public class DuplicateArray {
    /*public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            result.put(arr[i], result.getOrDefault(arr[i],0)+1);

        }
        ArrayList<Integer> resultList=new ArrayList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : result.entrySet()) {
            if(integerIntegerEntry.getValue()>1){
                resultList.add(integerIntegerEntry.getKey());
            }
        }
        if(resultList.size()==0)
            new ArrayList<>().add(-1);
return Collections.sort(resultList);
    }

     */

    public static int tripletSum(int[] arr, int num) {

        int startIndex=0,startSecondIndex=0,startThirdIndex=0;
        int result=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            startSecondIndex=i+1;
            startThirdIndex=arr.length-1;
            while(startSecondIndex<startThirdIndex){

                if(arr[startSecondIndex]+arr[startThirdIndex] +arr[i]> num){
                    startThirdIndex=startThirdIndex-1;
                }
                else if(arr[startSecondIndex]+arr[startThirdIndex]+arr[i] < num){
                    startSecondIndex=startSecondIndex+1;
                }
                else {
                    result++;
                    startSecondIndex++;
                    startThirdIndex--;

                }

            }
        }

return result;
        }

    public static void rotate(int[] arr, int d) {
        int sizeArray=arr.length;
        int num=d;
        int tempCounter=0;

        int[] tempArray=new int[d];

        for(int i=0;i<d;i++){
            tempArray[i]=arr[i];
        }

        for(int i=0;i<sizeArray-tempArray.length;i++){
            arr[i]=arr[d];
            d++;
        }
        for(int i=sizeArray-num;i<sizeArray;i++){
            arr[i]=tempArray[tempCounter];
            tempCounter++;
        }
    }

    }


class DuplicateArrayStarter {
    public static void main(String[] args) {
        DuplicateArray.rotate(new int[]{1, 2, 3, 4, 5, 6},2);
        //System.out.println(DuplicateArray.tripletSum(new int[]{1, 2, 3, 4, 5, 6, 7},12));

    }
}

interface A{
    public void method();
}
class One{
    public void method(){
        System.out.println("Class One method");
    }
}
class Two extends One implements A{
    public void method(){
        System.out.println("Class Two method");
    }
}
class Solution extends Two{
    public static void main(String[] args){
        A a = new Two();
        a.method();
    }
}
