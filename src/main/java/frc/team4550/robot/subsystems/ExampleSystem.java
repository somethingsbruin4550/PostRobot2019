package frc.team4550.robot.subsystems;

import frc.team4550.libs.*; // We need our subsystem library

class ExampleSystem extends Subsystem {

    public ExampleSystem() {
        super("ExampleSystem"); // This sets the name that will be used when logging
    }

    @Override
    public void init() {
        //This method is called when the robot first initalizes all
        //of the subsystems. This is where you should create motor
        //controllers etc...
    }

    @Override
    public void teleopInit() {
        //This is where we will initalize all of our teleop code,
        //There usually isn't much to do here (that I can think of).


    }

    @Override
    public void teleopPeriodic() {
        //This is called constently when we are in teleop mode,
        //Here you would update speeds, read controller input etc...
    }

    @Override
    public void emergencyStop() {
        //This method is required because it is an abstract method.
        //That is done so that it forces you to remember to add one
        //to everysingle subsystem you add. Do what you would expect
        //to do here. Stop everything......

        System.out.println("Stoping Everything...");
    }


    // There are a few other methods that you can add that will be really
    // Helpful in differnt situations. The only method you need to add is
    // the emergency stop method. All other methods/events are optional.
    // The worst that will happen is that they may tell you that they
    // aren't beinng initalized when you are running the code
}