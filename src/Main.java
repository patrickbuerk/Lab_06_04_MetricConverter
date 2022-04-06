import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
	double meters =0;
    String trash="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your measure in meters: ");
        if
        (in.hasNextDouble()){
            meters = in.nextDouble();
            in.nextLine();
            double inches = 39.37 * meters;
            double miles = meters / 1609;
            double feet = meters * 3.281;
            System.out.println("the measurement in inches is " + inches);
            System.out.println("the measurement in miles is " + miles);
            System.out.println("the measurement in feet is " + feet);

        }
        else{
            trash = in.nextLine();
            System.out.println("you did not enter a valid measurement in meters: "+trash );

    }



    }


    }




