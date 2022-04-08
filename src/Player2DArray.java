package src;
/*
https://leetcode.com/contest/weekly-contest-287/problems/find-players-with-zero-or-one-losses/
*/
import java.util.*;

public class Player2DArray {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new TreeMap<>();
        for(int[] m : matches){
            losses.put(m[0], losses.getOrDefault(m[0], 0));
            losses.put(m[1], losses.getOrDefault(m[1], 0) + 1);
        }
        List<List<Integer>> r = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(Integer player : losses.keySet())
            if(losses.get(player) <= 1)
                r.get(losses.get(player)).add(player);
        return r;
    }
}

class Player2DArrayStarter {
    public static void main(String[] args) {
        Player2DArray player2DArray=new Player2DArray();
        int[][] match={{2,3},{1,3},{5,4},{6,4}};
        System.out.println(player2DArray.findWinners(match));
    }
}
