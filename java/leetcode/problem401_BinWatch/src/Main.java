import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }


    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    if (minute < 10) {
                        list.add(hour + ":0" + minute);
                    } else {
                        list.add(hour + ":" + minute);
                    }
                }
            }
        }
        return list;
    }
}