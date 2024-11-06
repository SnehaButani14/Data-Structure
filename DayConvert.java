import java.util.Scanner;

public class DayConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of seconds: ");
        int day = scanner.nextInt();

        int year = day / 365;
        int week = (day % 365) / 7;
        int newDay = (day % 365)%7;

        System.out.println( year + ":" +  week + ":" + newDay);

    }
    }

 
    

