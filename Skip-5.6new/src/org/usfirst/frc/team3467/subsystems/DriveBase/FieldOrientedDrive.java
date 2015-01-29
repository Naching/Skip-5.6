package org.usfirst.frc.team3467.subsystems.DriveBase;

import org.usfirst.frc.team3467.robot.*;
import org.usfirst.frc.team3467.subsystems.DriveBase.*;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FieldOrientedDrive extends Command {

	Gyro gyro1 = RobotMap.driveBaseGyro1;


    public FieldOrientedDrive() {
    	requires(Robot.driveBase);
    	this.setInterruptible(true);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.stick1.getRawButton(2)){
    		DriveBase.lowSpeedFieldMecanumJoystickDrive();
    	}else{
    		DriveBase.fieldMecanumJoystickDrive();

    }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
