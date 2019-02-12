package frc.team4550.libs;

import java.util.List;

/**
 * Allows you to use subsystems
 * 
 * @author Collin Conrad (masterex1000) (2019)
 * @author 4550 Programming Team (2019-)
 */

//Note: add yourself to the authors list if you add something worth while to this file

//TODO Add Try-Catch to all ops

class SubsystemManager {

    private List<Subsystem> subsystems; // Holds all of our sub-systems

    public SubsystemManager(List<Subsystem> subsystems) {
        this.subsystems = subsystems;
    }

    /**
     * Initalize every subsystem by running all init() methods
     */
    public void init() {
        for(Subsystem system : subsystems) {
            system.init();
        }
    }

    public void emergencyStop() {
        for(Subsystem system : subsystems) {
            system.emergencyStop();
        }
    }
    public void autoInit() {
        for(Subsystem system : subsystems) {
            system.autoInit();
        }
    }
    public void teleopInit() {
        for(Subsystem system : subsystems) {
            system.teleopInit();
        }
    }
    public void teleopPeriodic() {
        for(Subsystem system : subsystems) {
            system.teleopPeriodic();
        }
    }
    public void autoPeriodic() {
        for(Subsystem system : subsystems) {
            system.autoPeriodic();
        }
    }

    public List<Subsystem> getSubsystems() {
        return subsystems;
    }
}