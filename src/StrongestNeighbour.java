package src;

public class StrongestNeighbour {

    static void maximumAdjacent(int sizeOfArray, int arr[]){

        int[] result=new int[sizeOfArray-1];

        for(int i=0;i<=sizeOfArray-2;i++){
            result[i]=Math.max(arr[i], arr[i+1]);
            System.out.print(result[i] +" ");
        }
    }
}

class StrongestNeighbourStarter {
    public static void main(String[] args) {
        StrongestNeighbour strongestNeighbour=new StrongestNeighbour();
        strongestNeighbour.maximumAdjacent(6,new int[] {1,2,2,3,4,5});
    }
}
