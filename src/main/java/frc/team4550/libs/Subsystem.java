package frc.team4550.libs;

public abstract class Subsystem {

    private String name;

    /**
     * Initalizes a subsystem without a name, please give it a name using alt syntax
     */
    
    public Subsystem() {
        name = "My Untitled Subsystem";
    }

    /**
     * Initalizes the subsystem with a name
     */
    public Subsystem(String subsystemName) {
        name = subsystemName;
    }

    /**
     * Extend this to add initalization for the robot, This will be executed when the code starts
     */

    public abstract void emergencyStop(); // made abstract to force creating emergencyStop method

    public void init() {
        System.out.println(name + ": I Don't Have An Init Method! Overide Me!");
    }

    public void autoInit() {
        System.out.println(name + ": I Don't Have Any Auto Routines Specified");
    }

    public void teleopInit() {
        System.out.println(name + ": I don't have a teleopInit() method!!! Overide Me");
    }

    public void teleopPeriodic() {
        // We Won't have a command here, That would spam the console if we did
    }

    public void autoPeriodic() {
        // We Won't have a command here, That would spam the console if we did
    }

    public String getName() {
        return name;
    }
}