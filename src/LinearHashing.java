package src;

public class LinearHashing {

    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        int[] result=new int[hash_size];
        for(int i=0;i<hash_size;i++){
            result[i]=-1;
        }
        for(int i=0;i<hash_size;i++){
            int index=arr[i]%hash_size;
            if(result[index]==-1){
                result[index]=arr[i];
            }
            else {

                while(result[index]!=-1 ){
                    index++;
                    if(result[index]==-1){
                        result[index]=arr[i];
                    }
                }
            }

        }
       return result;
    }
}


class LinearHashingStarter {
    public static void main(String[] args) {
        LinearHashing linearHashing=new LinearHashing();

    }
}
