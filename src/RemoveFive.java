package src;

public class RemoveFive {

    public int solution(int N) {
int sign =  N>0?1:-1;
int value = Math.abs(N);
int maxValue = Integer.MIN_VALUE;
String stringValue = Integer.toString(value);
for(int i=0; i<stringValue.length(); i++){
    final String digit = stringValue.substring(i, i+1);
    if (digit.equals("5")){

        String stringToCheck = stringValue.substring(0,i) + stringValue.substring(i+1);
        int intToCheck = Integer.parseInt(stringToCheck)* sign;
        maxValue = Math.max(intToCheck, maxValue);


    }
}
return maxValue;
    }
}

class RemoveFiveStarter {
    public static void main(String[] args) {
        RemoveFive removeFive=new RemoveFive();
        removeFive.solution(15953);
    }
}
