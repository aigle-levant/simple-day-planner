import java.util.Scanner;
import java.util.ArrayList;

public class dayPlannerMain
{
    /*
     * the program does the following:
     * 
     * asks the user to input activities and their
     * duration respectively
     * 
     * asks user for total time duration
     * 
     * prints out activities that can and can't be done
     * within that duration
     */

     public static void main(String[] args)
     {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList <dayPlanner> plan = new ArrayList<>();
            
            System.out.println("Please enter the activities and their duration in minutes.");
            System.out.println("Enter blank to stop.");
            while (true)
            {
                System.out.println("Activity name: ");
                String activity = scanner.nextLine();
                if (activity.isEmpty())
                {
                    break;
                }
                int duration = Integer.valueOf(scanner.nextLine());

                plan.add(new dayPlanner(activity, duration));
            }

            System.out.println("Total time:");
            int totalTime = scanner.nextInt();

            while (true)
            {
                for (dayPlanner i:plan)
                {
                    if (totalTime>=i.getDuration())
                    {
                        System.out.println("You can do the following within this duration:\n");
                        System.out.println(i);
                        totalTime -= i.getDuration();
                        System.out.println();
                    } else {
                        System.out.println("You can't do the following within this duration:\n");
                        System.out.println(i);
                        break;
                    }
                }
                break;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
