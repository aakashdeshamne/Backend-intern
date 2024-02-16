import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Thread1 extends Exception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1:-


        ArrayList<String>list=new ArrayList<>();
        String[] arr={"a","b","c","d","e","f","g","h","i","j"};
        for(String i:arr){
            list.add(i);
        }

        //task2:-

        Date ctime = new Date();
        System.out.println(ctime.getHours()+":"+ctime.getMinutes()+":"+ctime.getSeconds());

        //task3:-

        Calendar cal=Calendar.getInstance();
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        int minutes = cal.get(Calendar.MINUTE);
        int seconds = cal.get(Calendar.SECOND);
        System.out.println(hours + ":" + minutes + ":" + seconds);


        //task4:-


        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println(formattedTime);


        //task5:-

        HashSet<Integer>set=new HashSet<>();
        int[] arr1={1,2,3,4,5,1,2,6,7,8};
        for(int i:arr1){
            if(!set.contains(i)){
                set.add(i);
            }
        }

    }


}