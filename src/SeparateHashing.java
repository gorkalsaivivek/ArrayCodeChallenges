package src;

import java.util.ArrayList;
import java.util.LinkedList;

public class SeparateHashing {
    ArrayList<ArrayList<Integer>> arrayLists;
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        arrayLists=new ArrayList<ArrayList<Integer>>(hashSize);

        for(int i=0;i<n;i++){
            arrayLists.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            arrayLists.get(arr[i] % hashSize).add(arr[i]) ;
        }
        return arrayLists;
    }

}

class SeparateHashingStarter {
    public static void main(String[] args) {
        SeparateHashing separateHashing=new SeparateHashing();
        separateHashing.separateChaining(new int[]{92,4,14,24,44,91},6,10);
    }
}
