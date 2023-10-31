import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        String val = String.valueOf(date);
        String arr[]= val.split(" ");
        System.out.println(arr[3]);

        String time[] = arr[3].split(":");
        if(Integer.parseInt(time[0]) >= 12){
            System.out.println("time is 12 pm");
        }
        System.out.println(val);
    }
}