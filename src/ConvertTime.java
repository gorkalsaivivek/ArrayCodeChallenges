package src;

/*
https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/
*/
public class ConvertTime {

    public int convertTime(String current, String correct) {
        String currentTime[]=current.split(":");
        String correctTime[]=correct.split(":");
        int tries=0;

        int currentTimeMinutes= Integer.parseInt( currentTime[0]) *60 + Integer.parseInt( currentTime[1]);

        int correctTimeMinutes= Integer.parseInt( correctTime[0]) * 60 + Integer.parseInt( correctTime[1]);


        int diffMinutes=correctTimeMinutes-currentTimeMinutes;

        while(diffMinutes>=60) {
            diffMinutes=diffMinutes -60;
            tries++;
        }
        while(diffMinutes>=15) {
            diffMinutes=diffMinutes -15;
            tries++;
        }
        while(diffMinutes>=5) {
            diffMinutes=diffMinutes -5;
            tries++;
        }
        while(diffMinutes>=1) {
            diffMinutes=diffMinutes -1;
            tries++;
        }

        return tries;
    }
}

class ConvertTimeStarter{
    public static void main(String[] args) {
        ConvertTime convertTime=new ConvertTime();
        System.out.println(convertTime.convertTime("02:30","04:35"));
        System.out.println(convertTime.convertTime("11:00","11:01"));
    }
}


