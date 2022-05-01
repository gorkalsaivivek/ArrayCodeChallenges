package src;

public class KillingSpree {

    long killinSpree(long n)
    {
        long result=0;
        long resultCompare=n;
        for(long i=1;i<Long.MAX_VALUE;i++){
            result+=(i*i);
            resultCompare=resultCompare-(i*i);
            if(result + (i+1)*(i+1)>=resultCompare ){
                if((i+1)*(i+1)>resultCompare)
                return i;
            }

        }
        return 0;
    }
}


class KillingSpreeStarter {
    public static void main(String[] args) {
        KillingSpree killingSpree=new KillingSpree();
      // System.out.println(killingSpree.killinSpree(1000000000000));
       System.out.println(killingSpree.killinSpree(14));

    }
}