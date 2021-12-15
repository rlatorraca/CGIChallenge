package ca.com.cgi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Application running using JDK Amazon Correto version 17
 */

/**
 * Main class
 *  - This class is used by the client to :
 *      a) set ceiling fan operations (Speed and Direction)
 *      b) get results to the console.
 *
 * @author  RLSP
 * @version 1.0
 */
public class MainCeilingFan {


    static int fanSpeed;

    static String fanDefaultDirection="cw";

    static String fanDirection="";

    // Default direction is clockwise
    static CeilingFanOperations ceilingFanOperations = new CeilingFanOperations();

    public static void main(String[] args) {

        System.out.println("Starting Ceiling Fan app ... ");
        System.out.println("Ceiling Fan is “off” (speed 0)");
        System.out.println("Ceiling Fan default direction is Clockwise(cw) ");
        fanDirection = fanDefaultDirection;
        boolean appUp = true;

        while (appUp) {
            System.out.println("[1] - Cord Direction  - Clockwise(cw) or AntiClockwise(acw) ");
            System.out.println("[2] - Speed - change the speed between [0 (off) , 1  ,2  , 3 (maximum)");
            System.out.println("[Exit] - Close Ceiling Fan App");

            boolean permmitedEntered = false;

            String option = readNextLine();
            switch (option) {
                case "1" -> {
                    getCurrentDirection();
                    permmitedEntered = true;
                    break;
                }

                case "2" -> {
                    getCurrentSpeed();
                    permmitedEntered = true;
                    break;
                }
                case "exit" -> {
                    permmitedEntered = false;
                    appUp = false;
                    break;
                }
                default -> {
                    System.out.println("Choose [1] or [2]");
                }
            }
            if(permmitedEntered){
                fanDefaultDirection=fanDirection;
            }

        }
    }

    static String readNextLine() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String valueEntered = "";
        try {
            valueEntered = input.readLine();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        valueEntered.toLowerCase();
        return valueEntered.trim();
    }

    private static boolean getCurrentDirection() {

        System.out.println("Pull the cord in Clockwise(cw) or AntiClockwise(acw) direction: ");

        fanDirection= readNextLine();
        if(!(fanDirection.equalsIgnoreCase("cw") || fanDirection.equalsIgnoreCase("acw")) ) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("     Invalid Direction     ");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
            return false;
        }
        setupNewDirection();
        ceilingFanOperations.printSettings();
        return true;
    }

    private static void setupNewDirection() {
        if(!fanDirection.equalsIgnoreCase(fanDefaultDirection)) {
            ceilingFanOperations.changeFanDirection();
        }

    }

    private static void getCurrentSpeed() {
        setupNewDirection();

        if(fanDirection.equalsIgnoreCase("cw")){
            fanSpeed=ceilingFanOperations.changeFanSpeed(fanSpeed);
        } else if(fanDirection.equalsIgnoreCase("acw")){
            fanSpeed=ceilingFanOperations.changeFanSpeed(fanSpeed);
        }

    }


}
