package src;

import java.util.HashMap;

public class TheftWorldBank {

    public double maximumProfit(int N, long C, long w[], long p[])
    {
        HashMap<Long,Long> hashmap=new HashMap<>();
        for(int i=0;i<w.length;i++){
            if(Math.sqrt(w[i])%1!=0){
                hashmap.put(w[i],p[i]);
            }
        }


        return 1;

        }
    }

class TheftWorldBankStarter{
    public static void main(String[] args) {
        TheftWorldBank theftWorldBank=new TheftWorldBank();
        theftWorldBank.maximumProfit(3,10,new long[]{4, 5, 7},new long[]{8, 5, 4});
    }
}