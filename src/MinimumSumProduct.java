package src;

import java.util.*;

/*
https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1?page=1&curated[]=1&sortBy=submissions
 */
public class MinimumSumProduct {
    public long minValue(long a[], long b[], long n)
    {
       /* int sum=0;
        Arrays.sort(a);

        Arrays.sort(b);
        int N= (int) n;

        for(int i=0;i<N;i++){
            sum+=a[i]*b[N-i-1];
        }

        return sum;
        */
        long sum=0;
        Stack<Long> stack=new Stack<Long>();
        Queue<Long> queue=new LinkedList<>();
        for(int i=0;i<b.length;i++){
            queue.add(b[i]);
        }


        for(int i=0;i<a.length;i++){
            stack.push(a[i]);

        }

        for(int i=0;i<b.length;i++){
            sum+= stack.pop()* queue.remove();
        }
        return sum;
    }
}


class MinimumSumProductStarter {

    public static void main(String[] args) {
        MinimumSumProduct minimumSumProduct=new MinimumSumProduct();
        System.out.println(minimumSumProduct.minValue(new long[]{3, 1, 1},new long[]{6, 5, 4},3));
    }
}