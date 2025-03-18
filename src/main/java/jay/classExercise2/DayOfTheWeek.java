package jay.classExercise2;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number (1-7) or a day name (Monday-Sunday): ");

        if(scanner.hasNextInt()){
            int dayNumber = scanner.nextInt();
            switch (dayNumber){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tueday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("not a day");
            }
        }

        else {
            String dayName = scanner.next().toLowerCase();
            switch (dayName){
                case "monday":
                    System.out.println("Day number: 1");
                    break;
                case "tuesday":
                    System.out.println("Day number: 2");
                    break;
                case "wednesday":
                    System.out.println("Day number: 3");
                    break;
                case "thursday":
                    System.out.println("Day number: 4");
                    break;
                case "friday":
                    System.out.println("Day number: 5");
                    break;
                case "saturday":
                    System.out.println("Day number: 6");
                    break;
                case "sunday":
                    System.out.println("Day number: 7");
                    break;
                default:
                    System.out.println("not a number");
            }
        }
        scanner.close();
    }
}
