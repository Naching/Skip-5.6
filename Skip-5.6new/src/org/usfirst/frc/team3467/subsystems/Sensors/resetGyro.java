package org.usfirst.frc.team3467.subsystems.Sensors;

import org.usfirst.frc.team3467.robot.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class resetGyro extends Command {
	
    public resetGyro() {
    	requires(Robot.sensors);
    }
    
    protected void initialize() {
    	Sensors.resetGyro();
    }
    
    protected void execute() {
    }
    
    protected boolean isFinished() {
        	return true;
    }
    
    protected void end() {
    }
    
    protected void interrupted() {
    }
}
