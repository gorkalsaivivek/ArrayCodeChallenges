package src;

public class MajorityWins {

    public int majorityWins(int arr[], int n, int x, int y) {
        int countX=0;
        int countY=0;

        for(int i=0;i<=n-1;i++){
            if(arr[i]==x){
                countX++;
            }

            if(arr[i]==y){
                countY++;
            }
        }
        if(countX == countY){
            return (x<=y) ? x : y;
        }
        return (countX>countY) ? x : y;
    }
}


class MajorityWinsStarter {
    public static void main(String[] args) {
        MajorityWins majorityWins=new MajorityWins();
        majorityWins.majorityWins(new int[]{98,99,39,12,0,36,15,47,79,62,64,64,5},11,64,5);
    }
}
