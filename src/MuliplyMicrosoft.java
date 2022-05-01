package src;


public class MuliplyMicrosoft {

    static int solution(int[] A) {
        int N = A.length;
        int result = 0;

        for (int i = 0; i < N; i++){
                for (int j = N-1; j >0; j--) {
                    if (A[i] == A[j]) {
                        return Math.max(result, Math.abs(i - j));
                    }
                }


        }

        return result;
    }
}

class MuliplyMicrosoftStarter {
    public static void main(String[] args) {
        System.out.println(MuliplyMicrosoft.solution(new int[]{4,6,2,2,6,6,1}));
    }
}
