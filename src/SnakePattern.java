package src;

import java.util.ArrayList;

public class SnakePattern {

    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i< matrix.length;i++){
            if(i%2==0) {
                for (int j = 0; j < matrix[i].length; j++) {

                    result.add(matrix[i][j]);
                    System.out.print(matrix[i][j] + " ");
                }
            }
            if(i%2==1) {
                for (int j = matrix[i].length-1; j >=0 ; j--) {
                    result.add(matrix[i][j]);
                    System.out.print(matrix[i][j] + " ");
                }
            }

            }
        return result;
        }

    }

class SnakePatternStarter{
    public static void main(String[] args) {
        SnakePattern SnakePattern=new SnakePattern();
        SnakePattern.snakePattern(new int[][]{{45, 48, 54},
                {21, 89, 87},
                {70, 78, 15}});
    }
}
