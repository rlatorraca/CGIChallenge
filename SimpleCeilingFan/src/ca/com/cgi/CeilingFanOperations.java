package ca.com.cgi;

/**
 * CeilingFanOperations class
 *  - This class is used by the client to working on Operations necessaries on App :
 *      a) set ceiling fan operations (Speed and Direction)
 *      b) get results to the console.
 *
 * @author  RLSP
 * @version 1.0
 */
public class CeilingFanOperations {

    // Constants
    private static final int MIN_FAN_SPEED = 0;
    private static final int MAX_FAN_SPEED = 3;


    // Atributes
    private int currentFanSpeed;
    private boolean reverseDiretion=false;


    public String getFanDirection() {
        return  reverseDiretion ? "antiClockwise" : "clockWise";
    }

    // Changes the speed of fan with respect to the pull direction
    public int changeFanSpeed(int currentFanSpeed) {
//        if(reverseDiretion == false) {

            if (currentFanSpeed == MAX_FAN_SPEED) {
                this.currentFanSpeed = MIN_FAN_SPEED;
            } else {
                this.currentFanSpeed = ++currentFanSpeed;

            }

        printSettings();
        return this.currentFanSpeed;
    }


    public void changeFanDirection() {

        reverseDiretion = !reverseDiretion;
        System.out.println("===============================================");
        System.out.println("Ceiling Fan direction switched to : " + getFanDirection().toUpperCase());
        System.out.println("===============================================\n");
    }

    public void printSettings() {
        System.out.println("===============================================");
        System.out.println("Direction =>  "+ getFanDirection().toUpperCase() + " |  Fan Speend => " + getCurrentFanSpeed());
        System.out.println("===============================================\n");
    }


    public int getCurrentFanSpeed() {
        return currentFanSpeed;
    }

    public void setCurrentFanSpeed(int currentFanSpeed) {
        this.currentFanSpeed = currentFanSpeed;
    }
}
